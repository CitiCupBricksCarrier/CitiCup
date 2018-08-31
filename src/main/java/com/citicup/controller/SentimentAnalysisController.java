package com.citicup.controller;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.dataDisplay.CompanyBasicInformationMapper;
import com.citicup.util.NewsAPIHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SentimentAnalysisController {

    @Autowired
    private CompanyBasicInformationMapper companyBasicInformationMapper;

    @RequestMapping("/sentimentAnalysis")
    public String sentimentAnalysis(@RequestParam String stkid){
        NewsAPIHelper apiHelper = new NewsAPIHelper();
        String stkName = companyBasicInformationMapper.selectByPrimaryKey(stkid).getCompname();

        JSONObject retJson = apiHelper.getNewsProcess(stkid, stkName);
        return retJson.toJSONString();
    }



}
