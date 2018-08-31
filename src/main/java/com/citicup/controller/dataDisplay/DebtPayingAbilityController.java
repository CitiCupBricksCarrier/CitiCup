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
@RequestMapping("/DebtPayingAbility")
public class DebtPayingAbilityController {

    @Autowired
    private CurrentRatioMapper currentRatioMapper;
    @Autowired
    private QuickRatioMapper quickRatioMapper;
    @Autowired
    private WorkingCapitalAndLoanRatioMapper workingCapitalAndLoanRatioMapper;
    @Autowired
    private InterestCoverageRatioMapper interestCoverageRatioMapper;
    @Autowired
    private CashFlowLiabilityRatioOfAutomobileEnterprisesInChinaMapper cashFlowLiabilityRatioOfAutomobileEnterprisesInChinaMapper;
    @Autowired
    private AssetLiabilityRatioMapper assetLiabilityRatioMapper;

    /**
     * 流动比率
     * @return
     */
    @RequestMapping("/ldbl")
    public String selectldbl() {
        List<CurrentRatio> list = currentRatioMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 速动比率
     * @return
     */
    @RequestMapping("/subl")
    public String selectsdbl() {
        List<QuickRatio> list = quickRatioMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 营运资金与借款比
     * @return
     */
    @RequestMapping("/yyzjyjkb")
    public String selectyyzjyjkb() {
        List<WorkingCapitalAndLoanRatio> list = workingCapitalAndLoanRatioMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 利息保障倍数
     * @return
     */
    @RequestMapping("/lxbzbs")
    public String selectlxbzbs() {
        List<InterestCoverageRatio> list = interestCoverageRatioMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 经营活动产生的现金流量净额除以流动负债
     * 中国汽车企业现金流动负债比率
     * @return
     */
    @RequestMapping("/zgqcqyxjldfzbl")
    public String selectzgqcqyxjldfzbl() {
        List<CashFlowLiabilityRatioOfAutomobileEnterprisesInChina> list = cashFlowLiabilityRatioOfAutomobileEnterprisesInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 资产负债率
     * @return
     */
    @RequestMapping("/zcfzl")
    public String selectzcfzl() {
        List<AssetLiabilityRatio> list = assetLiabilityRatioMapper.getAll();
        return JSONObject.toJSONString(list);
    }


}
