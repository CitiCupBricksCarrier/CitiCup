package com.citicup.controller;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.*;
import com.citicup.model.*;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.dc.pr.PRError;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/industryData/sellNum")
public class IndustryDataSellNumController {

    //乘用车销量
    @Autowired
    private ChinesePassengerCarSalesDividedByBrandMapper chinesePassengerCarSalesDividedByBrandMapper;
    @Autowired
    private ChinesePassengerCarSalesMapper chinesePassengerCarSalesMapper;
    @Autowired
    private ChinesePassengerCarSalesDividedByFuelMapper chinesePassengerCarSalesDividedByFuelMapper;
    @Autowired
    private ChinesePassengerCarSalesDividedByTypeMapper chinesePassengerCarSalesDividedByTypeMapper;
    @Autowired
    private ChineseDomesticManufacturingPassengerCarSalesMapper chineseDomesticManufacturingPassengerCarSalesMapper;
    @Autowired
    private ChineseDomesticManufacturingPassengerCarSalesDividedByTypeMapper chineseDomesticManufacturingPassengerCarSalesDividedByTypeMapper;

    /**
     * 乘用车分品牌销量
     * @return
     */
    @RequestMapping("/cycxl/cycfppxl")
    public String selectCycfppxl() {

        List<ChinesePassengerCarSalesDividedByBrand> list = chinesePassengerCarSalesDividedByBrandMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/cycxl/cycfcxxl")
    public String selectCycfcxxl() {

        List<ChinesePassengerCarSalesDividedByType> list = chinesePassengerCarSalesDividedByTypeMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/cycxl/cycfxl")
    public String selectCycfxl() {

        List<ChinesePassengerCarSales> list = chinesePassengerCarSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/cycxl/cycfrllxxl")
    public String selectCycfrllxxl() {

        List<ChinesePassengerCarSalesDividedByFuel> list = chinesePassengerCarSalesDividedByFuelMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/cycxl/gnzzcycxl")
    public String selectGnzzcycxl() {

        List<ChineseDomesticManufacturingPassengerCarSales> list = chineseDomesticManufacturingPassengerCarSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/cycxl/gnzzcycfcxxl")
    public String selectGnzzcycfcxxl() {

        List<ChineseDomesticManufacturingPassengerCarSalesDividedByType> list = chineseDomesticManufacturingPassengerCarSalesDividedByTypeMapper.getAll();
        return JSONObject.toJSONString(list);
    }

}
