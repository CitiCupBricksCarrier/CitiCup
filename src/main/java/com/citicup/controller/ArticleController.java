package com.citicup.controller;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.ArticleMapper;
import com.citicup.dao.UserMapper;
import com.citicup.model.Article;
import com.citicup.model.ArticleKey;
import com.citicup.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
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
    public String newArcticle(@RequestParam String id, @RequestParam String graphid,
                              @RequestParam String author, @RequestParam String text,
                              @RequestParam String title){

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        Article article = new Article(){{
            setWatchnum("0");
            setAuthor(author);
            setGraphid(graphid);
            setId(id);
            setText(text);
            setTitle(title);
            setTime(time);
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
     * @param author
     * @return
     */
    @RequestMapping("/getSingleArctile")
    public String getSingleArctile(@RequestParam String id, @RequestParam String graphid,
                                         @RequestParam String author){

        Article article = articleMapper.selectByPrimaryKey(new ArticleKey(){
            {setId(id);setGraphid(graphid);setAuthor(author);}
        });

        return JSONObject.toJSONString(article);
    }

    /**
     * 增加文章浏览量
     * @param id
     * @param graphid
     * @param author
     * @return
     */
    @RequestMapping("/increaseArticlesBrowse")
    public String increaseArticlesBrowse(@RequestParam String id, @RequestParam String graphid,
                                         @RequestParam String author){

        Article article = articleMapper.selectByPrimaryKey(new ArticleKey(){
            {setId(id);setGraphid(graphid);setAuthor(author);}
        });
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
            return "credits not enough!";
        }

        userMotivator.setCredit(userMotivator.getCredit()-credits);
        userAuthor.setCredit(userAuthor.getCredit()+credits);

        userMapper.updateByPrimaryKey(userAuthor);
        userMapper.updateByPrimaryKey(userMotivator);

        return new JSONObject(){{put("retmessage","success");}}.toString();
    }

    /**
     * 点赞
     * @param id
     * @param graphid
     * @param author
     * @return
     */
    @RequestMapping("/likeArcticle")
    public String likeArcticle(@RequestParam String id, @RequestParam String graphid,
                                         @RequestParam String author){

        Article article = articleMapper.selectByPrimaryKey(new ArticleKey(){
            {setId(id);setGraphid(graphid);setAuthor(author);}
        });
        article.setUp(article.getUp()+1);
        articleMapper.updateByPrimaryKey(article);
        return new JSONObject(){{put("retmessage","success");}}.toString();
    }
}
