package com.citicup.controller;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.dataDisplay.CompanyBasicInformationMapper;
import com.citicup.dao.dataDisplay.CompanyClassificationMapper;
import com.citicup.model.dataDisplay.CompanyBasicInformation;
import com.citicup.model.dataDisplay.CompanyClassification;
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
@RequestMapping("/generalInfo")
public class CompanyDataController {

    @Autowired
    private CompanyBasicInformationMapper companyBasicInformationMapper;
    @Autowired
    private CompanyClassificationMapper companyClassificationMapper;

    /**
     * 公司基本信息
     * @return
     */
    @RequestMapping("/companyDetail")
    public String selectcompanyDetail(@RequestParam String stkid) {

        CompanyBasicInformation companyBasicInformationWithBLOBs = companyBasicInformationMapper.selectByPrimaryKey(stkid);
        return JSONObject.toJSONString(companyBasicInformationWithBLOBs);
    }

    /**
     * 公司分类
     * @return
     */
    @RequestMapping("/companyList")
    public String selectcompanyList() {

        List<CompanyClassification> list = companyClassificationMapper.getAll();
        List<JSONObject> json = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        for(CompanyClassification clf : list){
            String stkcd = clf.getStkcd();
            String campanyName = "";

            if(!map.containsKey(stkcd)){
                CompanyBasicInformation info = companyBasicInformationMapper.selectByPrimaryKey(stkcd);
                map.put(stkcd, info.getCompnamesummary());
            }
            campanyName = map.get(stkcd);

            JSONObject t = new JSONObject();
            t.put("category", clf.getCategory());
            t.put("stkcd", clf.getStkcd());
            t.put("name", campanyName);
            json.add(t);
        }
        return JSONObject.toJSONString(json);
    }

    /**
     * 公司基本信息列表
     * @return
     */
    @RequestMapping("/companyDetailList")
    public String selectcompanyDetail() {

        List<CompanyBasicInformation> companyBasicInformationWithBLOBsList = companyBasicInformationMapper.getAll();
        return JSONObject.toJSONString(companyBasicInformationWithBLOBsList);
    }

    /**
     * 根据partStkcd(股票id)模糊查找公司信息
     * @return
     */
    @RequestMapping("/searchByStkcd")
    public String searchByStkcd(@RequestParam String partStkcd) {

        List<CompanyBasicInformation> list = companyBasicInformationMapper.searchByStkcd(partStkcd);
        return JSONObject.toJSONString(list);
    }

    /**
     * 根据name(公司名称)模糊查找公司信息
     * @return
     */
    @RequestMapping("/searchByName")
    public String searchByName(@RequestParam String partName) {

        List<CompanyBasicInformation> list = companyBasicInformationMapper.searchByName(partName);
        return JSONObject.toJSONString(list);
    }
}
