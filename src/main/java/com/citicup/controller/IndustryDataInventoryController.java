package com.citicup.controller;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.ChineseCarDealerInventoryFactorMapper;
import com.citicup.dao.ChineseCarDealersEarlyWarningIndexMapper;
import com.citicup.model.ChineseCarDealerInventoryFactor;
import com.citicup.model.ChineseCarDealersEarlyWarningIndex;
import com.citicup.model.ChinesePassengerCarSalesDividedByBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/industryData/inventory")
public class IndustryDataInventoryController {

    //todo 没有产成品存货

    @Autowired
    private ChineseCarDealerInventoryFactorMapper chineseCarDealerInventoryFactorMapper;
    @Autowired
    private ChineseCarDealersEarlyWarningIndexMapper chineseCarDealersEarlyWarningIndexMapper;

    @RequestMapping("/kcxs/qcjxskcxs")
    public String selectqcjxskcxs() {

        List<ChineseCarDealerInventoryFactor> list = chineseCarDealerInventoryFactorMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/kcyjzs/qcjxskcyjzs")
    public String selectqcjxskcyjzs() {

        List<ChineseCarDealersEarlyWarningIndex> list = chineseCarDealersEarlyWarningIndexMapper.getAll();
        return JSONObject.toJSONString(list);
    }
}
