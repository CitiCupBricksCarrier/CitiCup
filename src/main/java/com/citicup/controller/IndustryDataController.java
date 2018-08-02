package com.citicup.controller;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.ChinesePassengerCarSalesDividedByBrandMapper;
import com.citicup.model.ChinesePassengerCarSalesDividedByBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/industryData")
public class IndustryDataController {

    @Autowired
    private ChinesePassengerCarSalesDividedByBrandMapper chinesePassengerCarSalesDividedByBrandMapper;

    @RequestMapping("/sellNum/cycxl/cycfppxl")
    public String selectCycfppxl() {

        List<ChinesePassengerCarSalesDividedByBrand> list = chinesePassengerCarSalesDividedByBrandMapper.getAll();
        return JSONObject.toJSONString(list);
    }

}
