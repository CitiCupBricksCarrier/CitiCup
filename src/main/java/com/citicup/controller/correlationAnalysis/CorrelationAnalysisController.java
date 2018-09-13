package com.citicup.controller.correlationAnalysis;

import com.citicup.dao.correlationAnalysis.*;
import com.citicup.model.correlationAnalysis.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/CorrelationAnalysis")
public class CorrelationAnalysisController {
    @Autowired
    private InventoryTurnoverMapper inventoryTurnoverMapper;
    @Autowired
    private Quick_RatioMapper quick_ratioMapper;
    @Autowired
    private TurnoverOfTotalAssetsMapper turnoverOfTotalAssetsMapper;
    @Autowired
    private ROE_changeMapper roe_changeMapper;
    @Autowired
    private GPOA_changeMapper gpoa_changeMapper;
    @Autowired
    private ProfitGrowthRateMapper profitGrowthRateMapper;
    @Autowired
    private ConsistenceExpectationMapper consistenceExpectationMapper;
    @Autowired
    private ConsistenceExpectationPredictProfitMapper consistenceExpectationPredictProfitMapper;
    @Autowired
    private DealersNumChange_1MMapper dealersNumChange_1MMapper;
    @Autowired
    private DividendRateMapper dividendRateMapper;
    @Autowired
    private MarketSellingRateRecMapper marketSellingRateRecMapper;
    @Autowired
    private PE_RatioRecMapper pe_ratioRecMapper;
    @Autowired
    private TurnoverStd_6DMapper turnoverStd_6DMapper;
    @Autowired
    private TurnoverMean_6DMapper turnoverMean_6DMapper;
    @Autowired
    private TenoreRatio_20DMapper tenoreRatio_20DMapper;
    @Autowired
    private TenoreRatio_60DMapper tenoreRatio_60DMapper;
    @Autowired
    private CostProfitMarginCumuMapper costProfitMarginCumuMapper;
    @Autowired
    private IncometaxProfitPercentMapper incometaxProfitPercentMapper;


}
