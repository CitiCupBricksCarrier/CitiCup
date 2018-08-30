package com.citicup.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.*;
import com.citicup.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class RiskDiffusionController {

    @RequestMapping("/riskDiffusion")
    public String riskDiffusion(@RequestParam String riskCompany, @RequestParam String linkList,
                                @RequestParam String companyList) {

        JSONArray links = JSON.parseArray(linkList);
        JSONArray companys = JSON.parseArray(companyList);
        JSONObject jsonCompany = JSON.parseObject(riskCompany);

        List<Edge> edges = new ArrayList<>();
        Map<String, Point> points = new HashMap<>();
        Point company = new Point(jsonCompany.getString("nodeStock"), "", (byte) 0, 0.0, 0.0, 0.0, 0, 0, jsonCompany.getString("nodeColor"), jsonCompany.getString("nodeRole"), "", "", "");

        for (int i = 0; i < links.size(); i++){
            JSONObject jo = links.getJSONObject(i);
            Edge edge = new Edge(jo.getString("begin"), jo.getString("end"), jo.getString("id"),
                    (byte) 0, 0.0, 0.0, jo.getDouble("fund"));
            edges.add(edge);
        }
        for (int i = 0; i < companys.size(); i++) {
            JSONObject jo = companys.getJSONObject(i);
            Point point = new Point(jo.getString("nodeStock"), "", (byte) 0, 0.0, 0.0, 0.0, 0, 0, jo.getString("nodeColor"), jo.getString("nodeRole"), "", "", "");
            points.put(jo.getString("nodeStock"), point);
        }

        beginRisk(company, edges, points);
        JSONObject resjson = new JSONObject();
        for (int i = 1; i <= 10; i++){
            risk(edges ,points);
            JSONObject tjson = new JSONObject();
            tjson.put("linkList", edges);
            tjson.put("companyList" ,points);
            resjson.put(i*10+"", tjson);
        }

        return resjson.toJSONString();
    }

    private static void risk(List<Edge> linkList, Map<String, Point> companyList){

        for (Map.Entry<String, Point> entry : companyList.entrySet()){
            Point c = entry.getValue();
            if (c.getStatus() == 0){
                c.setInfectprobtemp(infectProbCompute(c, linkList, companyList));
            }
        }

        for (Map.Entry<String, Point> entry : companyList.entrySet()){
            Point c = entry.getValue();
            if (c.getStatus() == 0){
                if (c.getDefectprob() <= c.getInfectprobtemp()){
                    c.setTimeleft(c.getInfecttime());
                    c.setStatus((byte) 1);
                    c.setInfectprob(c.getInfectprobtemp());
                }
                else{
                    c.setInfectprob(0.0);
                }
            }
        }

        infectEdgeMark(linkList, companyList);

        for (Map.Entry<String, Point> entry : companyList.entrySet()){
            Point c = entry.getValue();
            if (c.getStatus() == 1){
                c.setTimeleft(c.getTimeleft()-10);
                if (c.getTimeleft() <= 10){
                    c.setStatus((byte) 0);
                }
            }
        }
    }

    @Autowired
    private InventoryTurnoverRatioMapper inventoryTurnoverRatioMapper;
    @Autowired
    private EquityTurnoverMapper equityTurnoverMapper;
    @Autowired
    private TurnoverOfCurrentAssetsMapper turnoverOfCurrentAssetsMapper;
    @Autowired
    private AverageAccountsReceivableTurnoverRatioMapper averageAccountsReceivableTurnoverRatioMapper;

    @Autowired
    private DaysInInventoryMapper daysInInventoryMapper;
    @Autowired
    private DaysSalesOutstandingMapper daysSalesOutstandingMapper;

    public String beginRisk(Point comp, List<Edge> linkList, Map<String, Point> companyList){

        //初始化defect_prob和infect_time
        for (Map.Entry<String, Point> entry : companyList.entrySet()){
            Point c = entry.getValue();
            initial(c);
            //初始化发生风险的结点
            if (c.getStkcd().equals(comp.getStkcd())){
                c.setStatus((byte) 1);
                c.setInfectprob(1.0);
            }
        }

        //初始化权重
        Map<String, Double> table = new HashMap<>();
        for (Edge edge : linkList){
            String stkA = edge.getStkcda(), stkB = edge.getStkcdb();
            if (table.containsKey(stkA)){
                table.put(stkA, table.get(stkA)+edge.getFund());
            }else{
                table.put(stkA, edge.getFund());
            }
            if (table.containsKey(stkB)){
                table.put(stkB, table.get(stkB)+edge.getFund());
            }else{
                table.put(stkB, edge.getFund());
            }
        }

        for (Edge edge : linkList){
            String stkA = edge.getStkcda(), stkB = edge.getStkcdb();
            if (table.containsKey(stkA) && table.containsKey(stkB) &&
                    table.get(stkA) != 0 && table.get(stkB) != 0){
                double fundA = table.get(stkA), fundB = table.get(stkB);
                edge.setPropagateproba(edge.getFund()/fundA);
                edge.setPropagateprobb(edge.getFund()/fundB);
            }
        }

        return "";
    }

    //初始化defect_prob和infect_time
    public void initial(Point c){
        Double t = 0.0;
        try {
            t += Double.parseDouble(inventoryTurnoverRatioMapper.selectByPrimaryKey(new InventoryTurnoverRatioKey(c.getStkcd(), "2017/9/30")).getInvturnrate());
            t += Double.parseDouble(inventoryTurnoverRatioMapper.selectByPrimaryKey(new InventoryTurnoverRatioKey(c.getStkcd(), "2016/9/30")).getInvturnrate());
            t += Double.parseDouble(inventoryTurnoverRatioMapper.selectByPrimaryKey(new InventoryTurnoverRatioKey(c.getStkcd(), "2015/9/30")).getInvturnrate());
            t += Double.parseDouble(equityTurnoverMapper.selectByPrimaryKey(new EquityTurnoverKey(c.getStkcd(), "2017/9/30")).getEquityturn());
            t += Double.parseDouble(equityTurnoverMapper.selectByPrimaryKey(new EquityTurnoverKey(c.getStkcd(), "2016/9/30")).getEquityturn());
            t += Double.parseDouble(equityTurnoverMapper.selectByPrimaryKey(new EquityTurnoverKey(c.getStkcd(), "2015/9/30")).getEquityturn());
            t += Double.parseDouble(turnoverOfCurrentAssetsMapper.selectByPrimaryKey(new TurnoverOfCurrentAssetsKey(c.getStkcd(), "2017/9/30")).getTurnrateofmobileassets());
            t += Double.parseDouble(turnoverOfCurrentAssetsMapper.selectByPrimaryKey(new TurnoverOfCurrentAssetsKey(c.getStkcd(), "2016/9/30")).getTurnrateofmobileassets());
            t += Double.parseDouble(turnoverOfCurrentAssetsMapper.selectByPrimaryKey(new TurnoverOfCurrentAssetsKey(c.getStkcd(), "2015/9/30")).getTurnrateofmobileassets());
            t += Double.parseDouble(averageAccountsReceivableTurnoverRatioMapper.selectByPrimaryKey(new AverageAccountsReceivableTurnoverRatioKey(c.getStkcd(), "2017/9/30")).getAccrecturnrate());
            t += Double.parseDouble(averageAccountsReceivableTurnoverRatioMapper.selectByPrimaryKey(new AverageAccountsReceivableTurnoverRatioKey(c.getStkcd(), "2016/9/30")).getAccrecturnrate());
            t += Double.parseDouble(averageAccountsReceivableTurnoverRatioMapper.selectByPrimaryKey(new AverageAccountsReceivableTurnoverRatioKey(c.getStkcd(), "2015/9/30")).getAccrecturnrate());
        }catch (Exception e){
            //有数据缺失，设为默认值0.5
            t = 0.5;
        }

        int days = 0;
        try {
            days += Double.parseDouble(daysInInventoryMapper.selectByPrimaryKey(new DaysInInventoryKey(c.getStkcd(), "2017/9/30")).getInvturndays());
            days += Double.parseDouble(daysInInventoryMapper.selectByPrimaryKey(new DaysInInventoryKey(c.getStkcd(), "2016/9/30")).getInvturndays());
            days += Double.parseDouble(daysInInventoryMapper.selectByPrimaryKey(new DaysInInventoryKey(c.getStkcd(), "2015/9/30")).getInvturndays());
            days += Double.parseDouble(daysSalesOutstandingMapper.selectByPrimaryKey(new DaysSalesOutstandingKey(c.getStkcd(), "2017/9/30")).getSalesoutstandingdays());
            days += Double.parseDouble(daysSalesOutstandingMapper.selectByPrimaryKey(new DaysSalesOutstandingKey(c.getStkcd(), "2016/9/30")).getSalesoutstandingdays());
            days += Double.parseDouble(daysSalesOutstandingMapper.selectByPrimaryKey(new DaysSalesOutstandingKey(c.getStkcd(), "2015/9/30")).getSalesoutstandingdays());
        }catch (Exception e){
            //有数据缺失，设为默认值40
            days = 40;
        }

        c.setDefectprob(t);
        c.setInfecttime(days);
    }

    private static double infectProbCompute(Point comp, List<Edge> linkList, Map<String, Point> companyList){
        double prob = 0.0;
        for(Edge l : linkList){
            if (l.getStatus() == 0){
                if (l.getStkcda().equals(comp.getStkcd())){
                    prob += l.getPropagateproba() * companyList.get(l.getStkcdb()).getInfectprob();
                }
                else{
                    prob += l.getPropagateprobb() * companyList.get(l.getStkcda()).getInfectprob();
                }
            }
        }
        return prob;
    }

    private static void infectEdgeMark(List<Edge> linkList, Map<String, Point> companyList){
        for(Edge l : linkList){
            if(l.getStatus() == 0 && companyList.get(l.getStkcda()).getStatus() == 1
                    && companyList.get(l.getStkcdb()).getStatus() == 1) {
                l.setStatus((byte) 1);
            }
        }
    }

}