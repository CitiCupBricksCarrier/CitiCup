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
@RequestMapping("/BusinessAbility")
public class BusinessAbilityController {
    @Autowired
    private AverageAccountsReceivableTurnoverRatioMapper averageAccountsReceivableTurnoverRatioMapper;
    @Autowired
    private DaysSalesOutstandingMapper daysSalesOutstandingMapper;
    @Autowired
    private InventoryTurnoverRatioMapper inventoryTurnoverRatioMapper;
    @Autowired
    private DaysInInventoryMapper daysInInventoryMapper;
    @Autowired
    private TurnoverOfCurrentAssetsMapper turnoverOfCurrentAssetsMapper;
    @Autowired
    private EquityTurnoverMapper equityTurnoverMapper;

    /**
     * 应收账款周转率
     * @return
     */
    @RequestMapping("/yszkzzl")
    public String selectyszkzzl() {
        List<AverageAccountsReceivableTurnoverRatio> list = averageAccountsReceivableTurnoverRatioMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 应收账款周转天数
     * @return
     */
    @RequestMapping("/yszkzzts")
    public String selectyszkzzts() {
        List<DaysSalesOutstanding> list = daysSalesOutstandingMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 存货周转率
     * @return
     */
    @RequestMapping("/chzzl")
    public String selectchzzl() {
        List<InventoryTurnoverRatio> list = inventoryTurnoverRatioMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 存货周转天数
     * @return
     */
    @RequestMapping("/chzzts")
    public String selectchzzts() {
        List<DaysInInventory> list = daysInInventoryMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 流动资产周转率
     * @return
     */
    @RequestMapping("/ldzczzl")
    public String selectldzczzl() {
        List<TurnoverOfCurrentAssets> list = turnoverOfCurrentAssetsMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 股东权益周转率
     * @return
     */
    @RequestMapping("/gdqyzzl")
    public String selectgdqyzzl() {
        List<EquityTurnover> list = equityTurnoverMapper.getAll();
        return JSONObject.toJSONString(list);
    }

}
