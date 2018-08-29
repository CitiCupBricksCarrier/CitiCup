package com.citicup.controller;
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
@RequestMapping("/DevelopmentAbility")
public class DevelopmentAbilityController {
    @Autowired
    private NetProfitGrowthRateMapper netProfitGrowthRateMapper;
    @Autowired
    private TotalProfitGrowthRateMapper totalProfitGrowthRateMapper;
    @Autowired
    private RevenueGrowthMapper revenueGrowthMapper;
    @Autowired
    private TotalOperatingCostGrowthRateMapper totalOperatingCostGrowthRateMapper;
    @Autowired
    private GrowthRateOfOwnersEquityMapper growthRateOfOwnersEquityMapper;
    @Autowired
    private TotalAssetsGrowthRateMapper totalAssetsGrowthRateMapper;
    @Autowired
    private OperatingProfitGrowthMapper operatingProfitGrowthMapper;

    /**
     * 净利润增长率
     * @return
     */
    @RequestMapping("/jlrzzl")
    public String selectjlrzzl() {
        List<NetProfitGrowthRate> list = netProfitGrowthRateMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 利润总额增长率
     * @return
     */
    @RequestMapping("/lrzezzl")
    public String selectlrzezzl() {
        List<TotalProfitGrowthRate> list = totalProfitGrowthRateMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 营业收入增长率
     * @return
     */
    @RequestMapping("/yysrzzl")
    public String selectyysrzzl() {
        List<RevenueGrowth> list = revenueGrowthMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 营业总成本增长率
     * @return
     */
    @RequestMapping("/yyzcbzzl")
    public String selectyyzcbzzl() {
        List<TotalOperatingCostGrowthRate> list = totalOperatingCostGrowthRateMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 所有者权益增长率
     * @return
     */
    @RequestMapping("/syzqyzzl")
    public String selectsyzqyzzl() {
        List<GrowthRateOfOwnersEquity> list = growthRateOfOwnersEquityMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 总资产增长率
     * @return
     */
    @RequestMapping("/zzczzl")
    public String selectzzczzl() {
        List<TotalAssetsGrowthRate> list = totalAssetsGrowthRateMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 营业利润增长率
     * @return
     */
    @RequestMapping("/yylrzzl")
    public String selectyylrzzl() {
        List<OperatingProfitGrowth> list = operatingProfitGrowthMapper.getAll();
        return JSONObject.toJSONString(list);
    }

}
