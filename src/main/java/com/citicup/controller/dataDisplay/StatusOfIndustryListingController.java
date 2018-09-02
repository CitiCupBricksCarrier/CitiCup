package com.citicup.controller.dataDisplay;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.dataDisplay.*;
import com.citicup.model.dataDisplay.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/StatusOfIndustryListing")
public class StatusOfIndustryListingController {

    @Autowired
    private StatusOfIndustryListing_allMapper statusOfIndustryListing_allMapper;
    @Autowired
    private StatusOfIndustryListing_newThirdBoardMapper statusOfIndustryListing_newThirdBoardMapper;
    @Autowired
    private StatusOfIndustryListing_shanghaiAndShenzhenASharesMapper statusOfIndustryListing_shanghaiAndShenzhenASharesMapper;

    @RequestMapping("/StatusOfIndustryListing_all")
    public String selectStatusOfIndustryListing_all() {
        List<StatusOfIndustryListing_all> list = statusOfIndustryListing_allMapper.getAll();
        List<JSONObject> json = new ArrayList<>();

        List<String> pettm = new ArrayList<>();
        List<String> peyearfcast = new ArrayList<>();




        return JSONObject.toJSONString(json);
    }

    @RequestMapping("/StatusOfIndustryListing_newThirdBoard")
    public String selectStatusOfIndustryListing_newThirdBoard() {
        List<StatusOfIndustryListing_newThirdBoard> list = statusOfIndustryListing_newThirdBoardMapper.getAll();
        List<JSONObject> json = new ArrayList<>();




        return JSONObject.toJSONString(json);
    }

    @RequestMapping("/StatusOfIndustryListing_shanghaiAndShenzhenAShares")
    public String selectStatusOfIndustryListing_shanghaiAndShenzhenAShares() {
        List<StatusOfIndustryListing_shanghaiAndShenzhenAShares> list = statusOfIndustryListing_shanghaiAndShenzhenASharesMapper.getAll();
        List<JSONObject> json = new ArrayList<>();


        return JSONObject.toJSONString(json);
    }

}
