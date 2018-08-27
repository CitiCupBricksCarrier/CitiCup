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
@RequestMapping("/economicData")
public class EconomicDataController {

    //企业绩效
    @Autowired
    private AverageGrowthRateOfTheThreeYearSalesOfChineseAutoEnterprisesMapper averageGrowthRateOfTheThreeYearSalesOfChineseAutoEnterprisesMapper;
    @Autowired
    private CashFlowLiabilityRatioOfAutomobileEnterprisesInChinaMapper cashFlowLiabilityRatioOfAutomobileEnterprisesInChinaMapper;
    @Autowired
    private ProfitMarginOfAutomobileSalesInChinaMapper profitMarginOfAutomobileSalesInChinaMapper;
    @Autowired
    private AssetLiabilityRatioOfAutomobileEnterprisesInChinaMapper assetLiabilityRatioOfAutomobileEnterprisesInChinaMapper;
//    @Autowired
//    private CashFlowLiabilityRatioOfAutomobileEnterprisesInChinaMapper cashFlowLiabilityRatioOfAutomobileEnterprisesInChinaMapper;

    @RequestMapping("/qyjx/snxspjzzl")
    public String selectsnxspjzzl() {
        List<AverageGrowthRateOfTheThreeYearSalesOfChineseAutoEnterprises> list = averageGrowthRateOfTheThreeYearSalesOfChineseAutoEnterprisesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/qyjx/xjldfzbl")
    public String selectxjldfzbl() {
        List<CashFlowLiabilityRatioOfAutomobileEnterprisesInChina> list = cashFlowLiabilityRatioOfAutomobileEnterprisesInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/qyjx/xslrl")
    public String selectxslrl() {
        List<ProfitMarginOfAutomobileSalesInChina> list = profitMarginOfAutomobileSalesInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/qyjx/zcfzl")
    public String selectzcfzl() {
        List<AssetLiabilityRatioOfAutomobileEnterprisesInChina> list = assetLiabilityRatioOfAutomobileEnterprisesInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/qyjx/qbcyrypjrs")
    public String selectZgqcbyl() {
        List<CashFlowLiabilityRatioOfAutomobileEnterprisesInChina> list = cashFlowLiabilityRatioOfAutomobileEnterprisesInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    //行业财务及固定资产投资
    @Autowired
    private NumberOfEnterprisesAndLossEnterprisesInAutoIndustryInChinaMapper numberOfEnterprisesAndLossEnterprisesInAutoIndustryInChinaMapper;
    @Autowired
    private ChinasAutoIndustryAccountsForTheProportionOfGdpMapper chinasAutoIndustryAccountsForTheProportionOfGdpMapper;
    @Autowired
    private TotalDebtOfAutoIndustryInChinaMapper totalDebtOfAutoIndustryInChinaMapper;
    @Autowired
    private GraphicsAndDataDeriveTotalProfitsFromChinasAutoIndustryMapper graphicsAndDataDeriveTotalProfitsFromChinasAutoIndustryMapper;
    @Autowired
    private MainBusinessCostOfAutoIndustryInChinaMapper mainBusinessCostOfAutoIndustryInChinaMapper;
    @Autowired
    private TotalAssetsOfAutoIndustryInChinaMapper totalAssetsOfAutoIndustryInChinaMapper;
    @Autowired
    private FixedAssetsInvestmentOfAutoIndustryInChinaMapper fixedAssetsInvestmentOfAutoIndustryInChinaMapper;
    @Autowired
    private FixedAssetInvestmentInChinasAutoIndustryAccountsForTheProportionOfInvestmentInChinaMapper fixedAssetInvestmentInChinasAutoIndustryAccountsForTheProportionOfInvestmentInChinaMapper;

    @RequestMapping("/hycw/hygk/qyhksqysl")
    public String selectqyhksqysl() {
        List<NumberOfEnterprisesAndLossEnterprisesInAutoIndustryInChina> list = numberOfEnterprisesAndLossEnterprisesInAutoIndustryInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/hycw/hygk/srzgdpbz")
    public String selectsrzgdpbz() {
        List<ChinasAutoIndustryAccountsForTheProportionOfGdp> list = chinasAutoIndustryAccountsForTheProportionOfGdpMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/hycw/cwsj/fzzj")
    public String fzzj() {
        List<TotalDebtOfAutoIndustryInChina> list = totalDebtOfAutoIndustryInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/hycw/cwsj/lrze")
    public String lrze() {
        List<GraphicsAndDataDeriveTotalProfitsFromChinasAutoIndustry> list = graphicsAndDataDeriveTotalProfitsFromChinasAutoIndustryMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/hycw/cwsj/zyywcb")
    public String zyywcb() {
        List<MainBusinessCostOfAutoIndustryInChina> list = mainBusinessCostOfAutoIndustryInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/hycw/cwsj/zczj")
    public String zczj() {
        List<TotalAssetsOfAutoIndustryInChina> list = totalAssetsOfAutoIndustryInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/qyjx/gdzctz/gdzttze")
    public String gdzttze() {
        List<FixedAssetsInvestmentOfAutoIndustryInChina> list = fixedAssetsInvestmentOfAutoIndustryInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/qyjx/gdzctz/gdzctzzqgtzbz")
    public String gdzctzzqgtzbz() {
        List<FixedAssetInvestmentInChinasAutoIndustryAccountsForTheProportionOfInvestmentInChina> list = fixedAssetInvestmentInChinasAutoIndustryAccountsForTheProportionOfInvestmentInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    //行业上下游数据
    @Autowired
    private SteelPriceInChinaMapper steelPriceInChinaMapper;
    @Autowired
    private HighwayPassengerTurnoverInChinaMapper highwayPassengerTurnoverInChinaMapper;
    @Autowired
    private FixedAssetsInvestmentPriceIndexInChinaMapper fixedAssetsInvestmentPriceIndexInChinaMapper;
    @Autowired
    private ConsumptionExpenditureOfChineseResidentsMapper consumptionExpenditureOfChineseResidentsMapper;
    @Autowired
    private CoachProductionInChinaMapper coachProductionInChinaMapper;
    @Autowired
    private PerCapitaGdpIndexInChinaMapper perCapitaGdpIndexInChinaMapper;
    @Autowired
    private MonthlyAverageMarketPriceOfNaturalRubberInChinaMapper monthlyAverageMarketPriceOfNaturalRubberInChinaMapper;
    @Autowired
    private HeavyTruckProductionInChinaMapper heavyTruckProductionInChinaMapper;

    @RequestMapping("/hysxysj/zggcjg")
    public String zggcjg() {
        List<SteelPriceInChina> list = steelPriceInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/hysxysj/zggllkzzl")
    public String zggllkzzl() {
        List<HighwayPassengerTurnoverInChina> list = highwayPassengerTurnoverInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/hysxysj/zggdzctzjgzs")
    public String zggdzctzjgzs() {
        List<FixedAssetsInvestmentPriceIndexInChina> list = fixedAssetsInvestmentPriceIndexInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/hysxysj/zgjmxfzc")
    public String zgjmxfzc() {
        List<ConsumptionExpenditureOfChineseResidents> list = consumptionExpenditureOfChineseResidentsMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/hysxysj/zgkcxl")
    public String zgkcxl() {
        List<CoachProductionInChina> list = coachProductionInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/hysxysj/zgrjgdpzs")
    public String zgrjgdpzs() {
        List<PerCapitaGdpIndexInChina> list = perCapitaGdpIndexInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/hysxysj/zgtrxjyjscj")
    public String zgtrxjyjscj() {
        List<MonthlyAverageMarketPriceOfNaturalRubberInChina> list = monthlyAverageMarketPriceOfNaturalRubberInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }
    @RequestMapping("/hysxysj/zgzkcl")
    public String zgzkcl() {
        List<HeavyTruckProductionInChina> list = heavyTruckProductionInChinaMapper.getAll();
        return JSONObject.toJSONString(list);
    }

}
