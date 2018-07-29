package com.citicup.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.CarSubBrandSalesMapper;
import com.citicup.entity.CarSubBrandSales;
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
    private CarSubBrandSalesMapper carSubBrandSalesMapper;

    @RequestMapping("/sellNum/cycxl/cycfppxl")
    public String selectCycfppxl() {

        List<CarSubBrandSales> list = carSubBrandSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

}
