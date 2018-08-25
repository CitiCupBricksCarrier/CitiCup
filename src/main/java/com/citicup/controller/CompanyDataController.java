package com.citicup.controller;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.CompanyBasicInformationMapper;
import com.citicup.dao.CompanyClassificationMapper;
import com.citicup.model.ChinesePassengerCarSalesDividedByBrand;
import com.citicup.model.CompanyBasicInformation;
import com.citicup.model.CompanyClassification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        return JSONObject.toJSONString(list);
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
    public String searchByName(@RequestParam String name) {

        List<CompanyBasicInformation> list = companyBasicInformationMapper.searchByName(name);
        return JSONObject.toJSONString(list);
    }
}
