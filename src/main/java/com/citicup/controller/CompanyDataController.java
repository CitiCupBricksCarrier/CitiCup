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
}
