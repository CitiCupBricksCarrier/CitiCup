package com.citicup.controller.dataDisplay;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.dataDisplay.*;
import com.citicup.model.dataDisplay.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/Profitability")
public class ProfitabilityController {
    @Autowired
    private NetProfitAndTotalProfitRatioMapper netProfitAndTotalProfitRatioMapper;
    @Autowired
    private TotalProfitPreTaxProfitRatioMapper totalProfitPreTaxProfitRatioMapper;
    @Autowired
    private OperatingMarginMapper operatingMarginMapper;
    @Autowired
    private OperatingCostRatioMapper operatingCostRatioMapper;
    @Autowired
    private ProfitMarginOfTheCostAndExpenseMapper profitMarginOfTheCostAndExpenseMapper;
    @Autowired
    private RateOfReturnOnInvestmentMapper rateOfReturnOnInvestmentMapper;

    /**
     * 净利润与利润总额比
     * @return
     */
    @RequestMapping("/jlrylrzeb")
    public String selectjlrylrzeb() {
        List<NetProfitAndTotalProfitRatio> list = netProfitAndTotalProfitRatioMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 利润总额与息税前利润相比
     * @return
     */
    @RequestMapping("/lrzeyxsqlrxb")
    public String selectlrzeyxsqlrxb() {
        List<TotalProfitPreTaxProfitRatio> list = totalProfitPreTaxProfitRatioMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 营业毛利率
     * @return
     */
    @RequestMapping("/yymll")
    public String selectyymll() {
        List<OperatingMargin> list = operatingMarginMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 营业成本率
     * @return
     */
    @RequestMapping("/yycbl")
    public String selectyycbl() {
        List<OperatingCostRatio> list = operatingCostRatioMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 成本费用利润率
     * @return
     */
    @RequestMapping("/cbfylrl")
    public String selectcbfylrl() {
        List<ProfitMarginOfTheCostAndExpense> list = profitMarginOfTheCostAndExpenseMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 投资收益率
     * @return
     */
    @RequestMapping("/tzsyl")
    public String selecttzsyl() {
        List<RateOfReturnOnInvestment> list = rateOfReturnOnInvestmentMapper.getAll();
        return JSONObject.toJSONString(list);
    }

}
