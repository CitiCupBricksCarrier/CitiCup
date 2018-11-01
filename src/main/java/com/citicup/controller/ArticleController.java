package com.citicup.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.ArticleMapper;
import com.citicup.dao.UserMapper;
import com.citicup.model.Article;
import com.citicup.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class ArticleController {

    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private UserMapper userMapper;

    /**
     * 新增文章
     * @return
     */
    @RequestMapping("/newArcticle")
    public String newArcticle(@RequestParam String data){

        JSONObject json = JSON.parseObject(data);
        String author = json.getString("author");
        String graphid = json.getString("grapid");
        String id = json.getString("id");
        String title = json.getString("title");
        String text = json.getString("text");

        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String time = df.format(new Date());
        Article article = new Article(){{
            setWatchnum("0");
            setAuthor(author);
            setGraphid(graphid);
            setId(id);
            setText(text);
            setTitle(title);
            setTime(time);
            setUp(0);
            setDown(0);
        }};

        articleMapper.insert(article);
        return new JSONObject(){{put("retmessage","success");}}.toString();
    }

    /**
     * 得到作者全部文章
     * @return
     */
    @RequestMapping("/getArctilesByAutor")
    public String getArctilesByAutor(@RequestParam String author){

        List<Article> articles = articleMapper.selectByAuthor(author);
        return JSONObject.toJSONString(articles);
    }

    /**
     * 得到全部文章
     * @return
     */
    @RequestMapping("/getAllArctiles")
    public String getAllArctiles(){

        List<Article> articles = articleMapper.selectAll();
        return JSONObject.toJSONString(articles);
    }

    /**
     * 得到单篇文章
     * @param id
     * @param graphid
     * @return
     */
    @RequestMapping("/getSingleArctile")
    public String getSingleArctile(@RequestParam String id, @RequestParam String graphid){

        Article article = articleMapper.selectById(id);
        return JSONObject.toJSONString(article);
    }

    /**
     * 增加文章浏览量
     * @param id
     * @param graphid
     * @return
     */
    @RequestMapping("/increaseArticlesBrowse")
    public String increaseArticlesBrowse(@RequestParam String id, @RequestParam String graphid){

        Article article = articleMapper.selectById(id);
        article.setWatchnum((Integer.parseInt(article.getWatchnum())+1)+"");
        articleMapper.updateByPrimaryKey(article);
        return new JSONObject(){{put("retmessage","success");}}.toString();
    }

    /**
     * 文章打赏
     * @param motivater
     * @param author
     * @param credits
     * @return
     */
    @RequestMapping("/motivateAuthor")
    public synchronized String motivateAuthor(@RequestParam String motivater,@RequestParam String author,
                                 @RequestParam int credits){

        User userAuthor = userMapper.selectByPrimaryKey(author);
        User userMotivator = userMapper.selectByPrimaryKey(motivater);

        if (userMotivator.getCredit() < credits){
            return new JSONObject(){{put("retmessage","credits not enough");}}.toString();
        }

        if (userAuthor.getUid().equals(userMotivator.getUid())){
            return new JSONObject(){{put("retmessage","不能给打赏自己");}}.toString();
        }

        userMotivator.setCredit(userMotivator.getCredit()-credits);
        userAuthor.setCredit(userAuthor.getCredit()+credits);

        userMapper.updateByPrimaryKey(userAuthor);
        userMapper.updateByPrimaryKey(userMotivator);

        return new JSONObject(){{put("retmessage","打赏成功");}}.toString();
    }

    /**
     * 点赞
     * @param id
     * @param graphid
     * @return
     */
    @RequestMapping("/likeArcticle")
    public String likeArcticle(@RequestParam String id, @RequestParam String graphid){

        Article article = articleMapper.selectById(id);
        article.setUp(article.getUp()+1);
        articleMapper.updateByPrimaryKey(article);
        return new JSONObject(){{put("retmessage","success");}}.toString();
    }
}
