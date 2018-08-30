package com.citicup.controller.dataDisplay;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.*;
import com.citicup.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/industryData/price")
public class IndustryDataPriceController {

    //乘用车整体价格变化指数
    @Autowired
    private GainPassengerCarOverallPriceChangeIndexMapper gainPassengerCarOverallPriceChangeIndexMapper;
    //乘用车整体终端优惠指数
    @Autowired
    private GainPassengerCarOverallEndPreferentialIndexMapper gainPassengerCarOverallEndPreferentialIndexMapper;


    /**
     * 乘用车整体价格变化指数
     * @return
     */
    @RequestMapping("/cycztjgbhzs/cycztjgbhzs")
    public String selectCycztjgbhzs() {
        List<GainPassengerCarOverallPriceChangeIndex> list = gainPassengerCarOverallPriceChangeIndexMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 乘用车整体终端优惠指数
     * @return
     */
    @RequestMapping("/cycztjgbhzs/cycztzdyhzs")
    public String selectCycztzdyhzs() {
        List<GainPassengerCarOverallEndPreferentialIndex> list = gainPassengerCarOverallEndPreferentialIndexMapper.getAll();
        return JSONObject.toJSONString(list);
    }

}
