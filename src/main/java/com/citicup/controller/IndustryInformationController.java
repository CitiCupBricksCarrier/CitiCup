package com.citicup.controller;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.*;
import com.citicup.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/IndustryInformation")
public class IndustryInformationController {

    @Autowired
    private AutomobileIndustryBulletinInformationMapper automobileIndustryBulletinInformationMapper;
    @Autowired
    private AutomobileIndustryNewsMapper automobileIndustryNewsMapper;
    @Autowired
    private CarBusinessNewsMapper carBusinessNewsMapper;
    @Autowired
    private AutomobileIndustryPolicyTrendsMapper automobileIndustryPolicyTrendsMapper;

    /**
     * 汽车行业公告信息
     * @return
     */
    @RequestMapping("/qchyggxx")
    public String selectqchyggxx() {
        List<AutomobileIndustryBulletinInformation> list = automobileIndustryBulletinInformationMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 汽车行业新闻
     * @return
     */
    @RequestMapping("/qchyxw")
    public String selectqchyxw() {
        List<AutomobileIndustryNews> list = automobileIndustryNewsMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 汽车企业新闻速览
     * @return
     */
    @RequestMapping("/qcqyxwsl")
    public String selectqcqyxwsl() {
        List<CarBusinessNews> list = carBusinessNewsMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 汽车行业政策动态
     * @return
     */
    @RequestMapping("/qchyzcdt")
    public String selectqchyzcdt() {
        List<AutomobileIndustryPolicyTrends> list = automobileIndustryPolicyTrendsMapper.getAll();
        return JSONObject.toJSONString(list);
    }



}
