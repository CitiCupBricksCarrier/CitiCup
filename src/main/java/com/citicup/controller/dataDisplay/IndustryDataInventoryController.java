package com.citicup.controller.dataDisplay;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.ChinaAutoIndustryFinishedGoodsInventoryMapper;
import com.citicup.dao.ChineseCarDealerInventoryFactorMapper;
import com.citicup.dao.ChineseCarDealersEarlyWarningIndexMapper;
import com.citicup.model.ChinaAutoIndustryFinishedGoodsInventory;
import com.citicup.model.ChineseCarDealerInventoryFactor;
import com.citicup.model.ChineseCarDealersEarlyWarningIndex;
import com.citicup.model.ChinesePassengerCarSalesDividedByBrand;
import com.sun.javafx.logging.PulseLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/industryData/inventory")
public class IndustryDataInventoryController {

    @Autowired
    private ChineseCarDealerInventoryFactorMapper chineseCarDealerInventoryFactorMapper;
    @Autowired
    private ChineseCarDealersEarlyWarningIndexMapper chineseCarDealersEarlyWarningIndexMapper;
    @Autowired
    private ChinaAutoIndustryFinishedGoodsInventoryMapper chinaAutoIndustryFinishedGoodsInventoryMapper;

    @RequestMapping("/ccpch/qchyccpch")
    public String selectqchyccpch() {

        List<ChinaAutoIndustryFinishedGoodsInventory> list = chinaAutoIndustryFinishedGoodsInventoryMapper.getAll();
        return JSONObject.toJSONString(list);
    }

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
