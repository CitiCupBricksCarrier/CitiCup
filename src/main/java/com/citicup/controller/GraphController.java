package com.citicup.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.EdgeMapper;
import com.citicup.dao.GraphMapper;
import com.citicup.dao.PointMapper;
import com.citicup.model.Edge;
import com.citicup.model.Graph;
import com.citicup.model.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.basic.DefaultMenuLayout;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@EnableAutoConfiguration
public class GraphController {

    @Autowired
    private GraphMapper graphMapper;
    @Autowired
    private PointMapper pointMapper;
    @Autowired
    private EdgeMapper edgeMapper;

    @RequestMapping("/addGraph")
    public String addGraph(@RequestParam String username, @RequestParam String linkList,
                           @RequestParam String companyList){

        //测试
        username = "1";

        //建立graphid
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String graphid = username + "-" + df.format(new Date());

        JSONArray links = JSON.parseArray(linkList);
        JSONArray companys = JSON.parseArray(companyList);

        List<Edge> edges = new ArrayList<>();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < links.size(); i++){
            JSONObject jo = links.getJSONObject(i);
            Edge edge = new Edge(jo.getString("begin"), jo.getString("end"), graphid,
                    (byte) 0, 0.0, 0.0, jo.getDouble("fund"), jo.getString("id"));
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

        Graph graph = new Graph(graphid, username, 0, 0);
        graphMapper.insert(graph);
        edgeMapper.saveEdgeList(edges);
        pointMapper.savePointList(points);

        return "success";
    }

    @RequestMapping("/getGraghList")
    public String addGraph(@RequestParam String username){

        List<Graph> graphs = graphMapper.selectByAuthor(username);
        return JSONObject.toJSONString(graphs);
    }

    @RequestMapping("/getGraghByID")
    public String getGraghByID(@RequestParam String graghid){

        List<Point> points = pointMapper.getAllById(graghid);
        List<Edge> edges = edgeMapper.getAllById(graghid);

        JSONObject json = new JSONObject();
        json.put("nodeList", points);
        json.put("connectionList", edges);
        return json.toJSONString();
    }
}
