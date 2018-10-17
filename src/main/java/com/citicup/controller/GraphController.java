package com.citicup.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.CommentMapper;
import com.citicup.dao.EdgeMapper;
import com.citicup.dao.GraphMapper;
import com.citicup.dao.PointMapper;
import com.citicup.model.*;
import com.citicup.util.ResponseHelper;
import com.citicup.util.SessionHelper;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.text.SimpleDateFormat;
import java.util.*;

@ResponseBody
@RestController
@EnableAutoConfiguration
public class GraphController {

    @Autowired
    private GraphMapper graphMapper;
    @Autowired
    private PointMapper pointMapper;
    @Autowired
    private EdgeMapper edgeMapper;
    @Autowired
    private CommentMapper commentMapper;

    @RequestMapping("/getGraphDetail")
    public String getGraphDetail(@RequestParam String graphId) {

        List<Edge> edges = edgeMapper.getAllById(graphId);
        List<Point> points = pointMapper.getAllById(graphId);

        JSONObject json = new JSONObject();
        json.put("id", graphId);
        json.put("edges", edges);
        json.put("points", points);

        return json.toJSONString();
    }

    @RequestMapping("/newGraph")
    public String newGraph(HttpServletRequest request) {

        //验证用户登录状态
        HttpSession session = request.getSession();
        String username = SessionHelper.getUserFromSession(session);
        if (username == null) {
            return JSON.toJSONString(new ResponseHelper("logout"));
        }

        //建立graphid
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String graphid = username + "-" + df.format(new Date());

        //持久化
        Graph graph = new Graph(graphid, username, 0, 0);
        graphMapper.insert(graph);

        JSONObject json = new JSONObject();
        json.put("graphid", graphid);
        return json.toJSONString();
    }

    @RequestMapping("/updateGraph")
    public String updateGraph(HttpServletRequest request, @RequestParam String graphJson) {

        //验证用户登录状态
        HttpSession session = request.getSession();
        String username = SessionHelper.getUserFromSession(session);
        if (username == null) {
            return JSON.toJSONString(new ResponseHelper("logout"));
        }

        //解析json
        JSONObject json = JSON.parseObject(graphJson);
        String graphid = json.getString("graphid");
        JSONArray links = json.getJSONArray("linkList");
        JSONArray companys = json.getJSONArray("companyList");

        List<Edge> edges = new ArrayList<>();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < links.size(); i++) {
            JSONObject jo = links.getJSONObject(i);
            Edge edge = new Edge(jo.getString("stkcdA"), jo.getString("stkcdB"), graphid,
                    (byte) 0, 0.0, 0.0, jo.getDouble("fund"), jo.getString("id"),
                    jo.getString("begin"), jo.getString("end"));
            edges.add(edge);
        }
        for (int i = 0; i < companys.size(); i++) {
            JSONObject jo = companys.getJSONObject(i);
            Point point = new Point(jo.getString("nodeStock"), graphid, (byte) 0,
                    0.0, 0.0, 0.0, 0, 0,
                    jo.getString("nodeColor"), jo.getString("nodeRole"),
                    jo.getString("x"), jo.getString("y"), jo.getString("nodeName"), jo.getString("id"));
            points.add(point);
        }

        //删除原节点和边，插入新的节点和边
        edgeMapper.deleteByGraphId(graphid);
        pointMapper.deleteByGraphId(graphid);
        if(!edges.isEmpty())
            edgeMapper.saveEdgeList(edges);
        if(!points.isEmpty())
            pointMapper.savePointList(points);

        return JSON.toJSONString(new ResponseHelper("success"));
    }

    /**
     * 得到所有的graphlist
     *
     * @param request
     * @return json
     */
    @RequestMapping("/getAllGraphList")
    public String getAllGraphList(HttpServletRequest request) {

        List<Graph> graphs = graphMapper.selectAll();
        return JSONObject.toJSONString(graphs);
    }

    /**
     * 得到当前用户的graphlist
     *
     * @param request
     * @return json
     */
    @RequestMapping("/getOwnGraphList")
    public String getOwnGraphList(HttpServletRequest request) {

        //验证用户登录状态
        HttpSession session = request.getSession();
        String username = SessionHelper.getUserFromSession(session);
        if (username == null) {
            return JSON.toJSONString(new ResponseHelper("logout"));
        }

        List<Graph> graphs = graphMapper.selectByAuthor(username);
        return JSONObject.toJSONString(graphs);
    }

    @RequestMapping("/getGraphByID")
    public String getGraphByID(@RequestParam String graghid) {

        List<Point> points = pointMapper.getAllById(graghid);
        List<Edge> edges = edgeMapper.getAllById(graghid);

        JSONObject json = new JSONObject();
        json.put("nodeList", points);
        json.put("connectionList", edges);
        return json.toJSONString();
    }

    @RequestMapping("/addComment")
    public String addComment(HttpServletRequest request, @RequestParam String data) {

        //验证用户登录状态
        HttpSession session = request.getSession();
        String username = SessionHelper.getUserFromSession(session);
        if (username == null) {
            return JSON.toJSONString(new ResponseHelper("logout"));
        }

        JSONObject json = JSON.parseObject(data);
        String graphid = json.getString("graphid");
        String comment = json.getString("comment");

        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String time = df.format(new Date());

        Comment c = new Comment(username, graphid, time, comment, 0, 0);
        commentMapper.insert(c);

        return JSON.toJSONString(new ResponseHelper("success"));
    }

    @RequestMapping("/deleteComment")
    public String deleteComment(HttpServletRequest request, @RequestParam String data) {
        //验证用户登录状态
        HttpSession session = request.getSession();
        String username = SessionHelper.getUserFromSession(session);
        if (username == null) {
            return JSON.toJSONString(new ResponseHelper("logout"));
        }

        JSONObject json = JSON.parseObject(data);
        String graphid = json.getString("graphid");
        String time = json.getString("time");
        String commentUser = json.getString("username");

        //不是该用户的评论
        if (!commentUser.equals(username)) {
            return JSON.toJSONString(new ResponseHelper("permission denied"));
        }

        try {
            commentMapper.deleteByPrimaryKey(new CommentKey(username, graphid, time));
            return JSON.toJSONString(new ResponseHelper("success"));
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(new ResponseHelper("fail"));
        }
    }

    @RequestMapping("/getComments")
    public String getComments(HttpServletRequest request, @RequestParam String graphid) {

        List<Comment> comments = commentMapper.getAllById(graphid);
        comments.sort(Comparator.comparing(Comment::getUp).reversed());
        return JSONObject.toJSONString(comments);
    }

    @RequestMapping("/commentUp")
    public String commentUp(HttpServletRequest request, @RequestParam String data) {

        JSONObject json = JSON.parseObject(data);
        String graphid = json.getString("graphid");
        String time = json.getString("time");
        String commentUser = json.getString("username");

        CommentKey key = new CommentKey(commentUser, graphid, time);
        Comment comment = commentMapper.selectByPrimaryKey(key);
        comment.setUp(comment.getUp()+1);
        commentMapper.updateByPrimaryKey(comment);

        return JSON.toJSONString(new ResponseHelper("success"));
    }

    @RequestMapping("/commentDown")
    public String commentDown(HttpServletRequest request, @RequestParam String data) {

        JSONObject json = JSON.parseObject(data);
        String graphid = json.getString("graphid");
        String time = json.getString("time");
        String commentUser = json.getString("username");

        CommentKey key = new CommentKey(commentUser, graphid, time);
        Comment comment = commentMapper.selectByPrimaryKey(key);
        comment.setDown(comment.getDown()+1);
        commentMapper.updateByPrimaryKey(comment);

        return JSON.toJSONString(new ResponseHelper("success"));
    }

    @RequestMapping("/graphUp")
    public String graphUp(@RequestParam String graphid) {

        Graph graph = graphMapper.selectByPrimaryKey(graphid);
        graph.setUp(graph.getUp()+1);
        graphMapper.updateByPrimaryKey(graph);

        return JSON.toJSONString(new ResponseHelper("success"));
    }

    @RequestMapping("/graphDown")
    public String graphDown(@RequestParam String graphid) {

        Graph graph = graphMapper.selectByPrimaryKey(graphid);
        graph.setDown(graph.getDown()+1);
        graphMapper.updateByPrimaryKey(graph);

        return JSON.toJSONString(new ResponseHelper("success"));
    }
}
