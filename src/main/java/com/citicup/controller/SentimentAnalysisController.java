package com.citicup.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.dataDisplay.*;
import com.citicup.model.dataDisplay.*;
import com.citicup.util.NewsAPIHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@EnableAutoConfiguration
public class SentimentAnalysisController {

    /**
     * 得到日期列表
     * @return { timeList : [...] }
     */
    @RequestMapping("/competitorAnalysisTimeList")
    public String competitorAnalysisTimeList(){
        final String[] timeList= {
                "2013-03-31", "2013-06-30", "2013-09-30", "2013-12-31",
                "2014-03-31", "2014-06-30", "2014-09-30", "2014-12-31",
                "2015-03-31", "2015-06-30", "2015-09-30", "2015-12-31",
                "2016-03-31", "2016-06-30", "2016-09-30", "2016-12-31",
                "2017-03-31", "2017-06-30", "2017-09-30", "2017-12-31",
                "2018-03-31"
        };
        return new JSONObject(){{
            put("timeList", timeList);
        }}.toString();
    }

    /**
     * 竞争者分析
     * @param stkidA 公司A
     * @param stkidB 公司B
     * @param time 时间
     * @return {
     *     stkidA : {...}
     *     stkidB : {...}
     * }
     */
    @RequestMapping("/competitorAnalysis")
    public String competitorAnalysis(@RequestParam String stkidA, @RequestParam String stkidB, @RequestParam String time){
        return new JSONObject(){
            {
            put("stkidA", loadCompetitorData(stkidA, time));
            put("stkidB", loadCompetitorData(stkidB, time));
            }
        }.toJSONString();
    }

    //经营能力
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

    //债偿能力
    @Autowired
    private CurrentRatioMapper currentRatioMapper;
    @Autowired
    private QuickRatioMapper quickRatioMapper;
    @Autowired
    private WorkingCapitalAndLoanRatioMapper workingCapitalAndLoanRatioMapper;
    @Autowired
    private InterestCoverageRatioMapper interestCoverageRatioMapper;
    @Autowired
    private AssetLiabilityRatioMapper assetLiabilityRatioMapper;

    //发展能力
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

    //盈利能力
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

    private JSONObject loadCompetitorData(String stkid, String time){

        JSONObject json = new JSONObject();
        AverageAccountsReceivableTurnoverRatioKey averageAccountsReceivableTurnoverRatioKey = new AverageAccountsReceivableTurnoverRatio();
        averageAccountsReceivableTurnoverRatioKey.setStkcd(stkid);
        averageAccountsReceivableTurnoverRatioKey.setAcceper(time);
        json.put("AverageAccountsReceivableTurnoverRatio", Optional.ofNullable(averageAccountsReceivableTurnoverRatioMapper.selectByPrimaryKey(averageAccountsReceivableTurnoverRatioKey).getAccrecturnrate()).orElse(""));

        DaysSalesOutstandingKey daysSalesOutstandingKey = new DaysSalesOutstanding();
        daysSalesOutstandingKey.setStkcd(stkid);
        daysSalesOutstandingKey.setAcceper(time);
        json.put("DaysSalesOutstanding", Optional.ofNullable(daysSalesOutstandingMapper.selectByPrimaryKey(daysSalesOutstandingKey).getSalesoutstandingdays()).orElse(""));

        InventoryTurnoverRatioKey inventoryTurnoverRatioKey = new InventoryTurnoverRatio();
        inventoryTurnoverRatioKey.setStkcd(stkid);
        inventoryTurnoverRatioKey.setAcceper(time);
        json.put("InventoryTurnoverRatio", Optional.ofNullable(inventoryTurnoverRatioMapper.selectByPrimaryKey(inventoryTurnoverRatioKey).getInvturnrate()).orElse(""));

        DaysInInventoryKey daysInInventoryKey = new DaysInInventory();
        daysInInventoryKey.setStkcd(stkid);
        daysInInventoryKey.setAcceper(time);
        json.put("DaysInInventory", Optional.ofNullable(daysInInventoryMapper.selectByPrimaryKey(daysInInventoryKey).getInvturndays()).orElse(""));

        TurnoverOfCurrentAssetsKey turnoverOfCurrentAssetsKey = new TurnoverOfCurrentAssets();
        turnoverOfCurrentAssetsKey.setStkcd(stkid);
        turnoverOfCurrentAssetsKey.setAcceper(time);
        json.put("TurnoverOfCurrentAssets", Optional.ofNullable(turnoverOfCurrentAssetsMapper.selectByPrimaryKey(turnoverOfCurrentAssetsKey).getTurnrateofmobileassets()).orElse(""));

        EquityTurnoverKey equityTurnoverKey = new EquityTurnover();
        equityTurnoverKey.setStkcd(stkid);
        equityTurnoverKey.setAcceper(time);
        json.put("EquityTurnover", Optional.ofNullable(equityTurnoverMapper.selectByPrimaryKey(equityTurnoverKey).getEquityturn()).orElse(""));

        CurrentRatioKey currentRatioKey = new CurrentRatio();
        currentRatioKey.setStkcd(stkid);
        currentRatioKey.setAcceper(time);
        json.put("CurrentRatio", Optional.ofNullable(currentRatioMapper.selectByPrimaryKey(currentRatioKey).getCurratio()).orElse(""));

        QuickRatioKey quickRatioKey = new QuickRatio();
        quickRatioKey.setStkcd(stkid);
        quickRatioKey.setAcceper(time);
        json.put("QuickRatio", Optional.ofNullable(quickRatioMapper.selectByPrimaryKey(quickRatioKey).getQuiritio()).orElse(""));

        WorkingCapitalAndLoanRatioKey workingCapitalAndLoanRatioKey = new WorkingCapitalAndLoanRatio();
        workingCapitalAndLoanRatioKey.setStkcd(stkid);
        workingCapitalAndLoanRatioKey.setAcceper(time);
        json.put("WorkingCapitalAndLoanRatio", Optional.ofNullable(workingCapitalAndLoanRatioMapper.selectByPrimaryKey(workingCapitalAndLoanRatioKey).getWorkcapandloanratio()).orElse(""));

        InterestCoverageRatioKey interestCoverageRatioKey = new InterestCoverageRatio();
        interestCoverageRatioKey.setStkcd(stkid);
        interestCoverageRatioKey.setAcceper(time);
        json.put("InterestCoverageRatio", Optional.ofNullable(interestCoverageRatioMapper.selectByPrimaryKey(interestCoverageRatioKey).getIntercovratio()).orElse(""));

        AssetLiabilityRatioKey assetLiabilityRatioKey = new AssetLiabilityRatio();
        assetLiabilityRatioKey.setStkcd(stkid);
        assetLiabilityRatioKey.setAcceper(time);
        json.put("AssetLiabilityRatio", Optional.ofNullable(assetLiabilityRatioMapper.selectByPrimaryKey(assetLiabilityRatioKey).getAssetabiratio()).orElse(""));

        NetProfitGrowthRateKey netProfitGrowthRateKey = new NetProfitGrowthRate();
        netProfitGrowthRateKey.setStkcd(stkid);
        netProfitGrowthRateKey.setFiscalyear(time);
        json.put("NetProfitGrowthRate", Optional.ofNullable(netProfitGrowthRateMapper.selectByPrimaryKey(netProfitGrowthRateKey).getNetprogrowthrate()).orElse(""));

        TotalProfitGrowthRateKey totalProfitGrowthRateKey = new TotalProfitGrowthRate();
        totalProfitGrowthRateKey.setStkcd(stkid);
        totalProfitGrowthRateKey.setFiscalyear(time);
        json.put("TotalProfitGrowthRate", Optional.ofNullable(totalProfitGrowthRateMapper.selectByPrimaryKey(totalProfitGrowthRateKey).getTotalprogrowthrate()).orElse(""));

        RevenueGrowthKey revenueGrowthKey = new RevenueGrowth();
        revenueGrowthKey.setStkcd(stkid);
        revenueGrowthKey.setFiscalyear(time);
        json.put("RevenueGrowth", Optional.ofNullable(revenueGrowthMapper.selectByPrimaryKey(revenueGrowthKey).getGrowthrateofoperincome()).orElse(""));

        TotalOperatingCostGrowthRateKey totalOperatingCostGrowthRateKey = new TotalOperatingCostGrowthRate();
        totalOperatingCostGrowthRateKey.setStkcd(stkid);
        totalOperatingCostGrowthRateKey.setFiscalyear(time);
        json.put("TotalOperatingCostGrowthRate", Optional.ofNullable(totalOperatingCostGrowthRateMapper.selectByPrimaryKey(totalOperatingCostGrowthRateKey).getTotalopercostgrowthrate()).orElse(""));

        GrowthRateOfOwnersEquityKey growthRateOfOwnersEquityKey = new GrowthRateOfOwnersEquity();
        growthRateOfOwnersEquityKey.setStkcd(stkid);
        growthRateOfOwnersEquityKey.setFiscalyear(time);
        json.put("GrowthRateOfOwnersEquity", Optional.ofNullable(growthRateOfOwnersEquityMapper.selectByPrimaryKey(growthRateOfOwnersEquityKey).getGrowthrateofowner()).orElse(""));

        TotalAssetsGrowthRateKey totalAssetsGrowthRateKey = new TotalAssetsGrowthRate();
        totalAssetsGrowthRateKey.setStkcd(stkid);
        totalAssetsGrowthRateKey.setFiscalyear(time);
        json.put("TotalAssetsGrowthRate", Optional.ofNullable(totalAssetsGrowthRateMapper.selectByPrimaryKey(totalAssetsGrowthRateKey).getTotalassetgrowthrate()).orElse(""));

        OperatingProfitGrowthKey operatingProfitGrowthKey = new OperatingProfitGrowth();
        operatingProfitGrowthKey.setStkcd(stkid);
        operatingProfitGrowthKey.setFiscalyear(time);
        json.put("OperatingProfitGrowth", Optional.ofNullable(operatingProfitGrowthMapper.selectByPrimaryKey(operatingProfitGrowthKey).getGrowthrateofoperpro()).orElse(""));

        NetProfitAndTotalProfitRatioKey netProfitAndTotalProfitRatioKey = new NetProfitAndTotalProfitRatio();
        netProfitAndTotalProfitRatioKey.setStkcd(stkid);
        netProfitAndTotalProfitRatioKey.setAcceper(time);
        json.put("NetProfitAndTotalProfitRatio", Optional.ofNullable(netProfitAndTotalProfitRatioMapper.selectByPrimaryKey(netProfitAndTotalProfitRatioKey).getNetproandtotalproratio()).orElse(""));

        TotalProfitPreTaxProfitRatioKey totalProfitPreTaxProfitRatioKey = new TotalProfitPreTaxProfitRatio();
        totalProfitPreTaxProfitRatioKey.setStkcd(stkid);
        totalProfitPreTaxProfitRatioKey.setAcceper(time);
        json.put("TotalProfitPreTaxProfitRatio", Optional.ofNullable(totalProfitPreTaxProfitRatioMapper.selectByPrimaryKey(totalProfitPreTaxProfitRatioKey).getTotalprocomparedtopretaxpro()).orElse(""));

        OperatingMarginKey operatingMarginKey = new OperatingMargin();
        operatingMarginKey.setStkcd(stkid);
        operatingMarginKey.setAcceper(time);
        json.put("OperatingMargin", Optional.ofNullable(operatingMarginMapper.selectByPrimaryKey(operatingMarginKey).getBusigrossinterrate()).orElse(""));

        OperatingCostRatioKey operatingCostRatioKey = new OperatingCostRatio();
        operatingCostRatioKey.setStkcd(stkid);
        operatingCostRatioKey.setAcceper(time);
        json.put("OperatingCostRatio", Optional.ofNullable(operatingCostRatioMapper.selectByPrimaryKey(operatingCostRatioKey).getOpercostrate()).orElse(""));

        ProfitMarginOfTheCostAndExpenseKey profitMarginOfTheCostAndExpenseKey = new ProfitMarginOfTheCostAndExpense();
        profitMarginOfTheCostAndExpenseKey.setStkcd(stkid);
        profitMarginOfTheCostAndExpenseKey.setAcceper(time);
        json.put("ProfitMarginOfTheCostAndExpense", Optional.ofNullable(profitMarginOfTheCostAndExpenseMapper.selectByPrimaryKey(profitMarginOfTheCostAndExpenseKey).getCostpromargin()).orElse(""));

        RateOfReturnOnInvestmentKey rateOfReturnOnInvestmentKey = new RateOfReturnOnInvestment();
        rateOfReturnOnInvestmentKey.setStkcd(stkid);
        rateOfReturnOnInvestmentKey.setAcceper(time);
        json.put("RateOfReturnOnInvestment", Optional.ofNullable(rateOfReturnOnInvestmentMapper.selectByPrimaryKey(rateOfReturnOnInvestmentKey).getReturnoninvest()).orElse(""));

        return json;
    }

    @Autowired
    private CompanyBasicInformationMapper companyBasicInformationMapper;

    @RequestMapping("/sentimentAnalysis")
    public String sentimentAnalysis(@RequestParam String stkid){
        NewsAPIHelper apiHelper = new NewsAPIHelper();
        String stkName = companyBasicInformationMapper.selectByPrimaryKey(stkid).getCompname();

        JSONObject retJson = apiHelper.getNewsProcess(stkid, stkName);
        JSONArray posList = retJson.getJSONArray("posList");
        JSONArray wordList = retJson.getJSONArray("wordList");
        List<String> sentimentIndexList = new ArrayList<>();

        int posMap[] = new int[5];
        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < posList.size(); i++) {
            Double t = posList.getDouble(i);
            if (t>=0.8){
                posMap[0] += 1;
                sentimentIndexList.add("非常积极");
            }
            else if (t>=0.6){
                posMap[1] += 1;
                sentimentIndexList.add("积极");
            }
            else if (t>=0.4){
                posMap[2] += 1;
                sentimentIndexList.add("中立");
            }
            else if (t>=0.2){
                posMap[3] += 1;
                sentimentIndexList.add("消极");
            }
            else if (t>=0.0){
                posMap[4] += 1;
                sentimentIndexList.add("非常消极");
            }
        }

        for (int i = 0; i < wordList.size(); i++) {
            String s = wordList.getString(i);

            s=s.replaceAll("[^\u4E00-\u9FA5]", "");

            if (s.equals(""))
                continue;

            if (!wordMap.containsKey(s)){
                wordMap.put(s, 1);
            }else{
                wordMap.put(s, wordMap.get(s)+1);
            }
        }

        List<JSONObject> sitimentIndex = new ArrayList<>();
        List<JSONObject> wordCloud = new ArrayList<>();

        JSONObject j1 = new JSONObject();
        j1.put("name", "非常积极");
        j1.put("value", posMap[0]);
        sitimentIndex.add(j1);

        j1 = new JSONObject();
        j1.put("name", "积极");
        j1.put("value", posMap[1]);
        sitimentIndex.add(j1);

        j1 = new JSONObject();
        j1.put("name", "中立");
        j1.put("value", posMap[2]);
        sitimentIndex.add(j1);

        j1 = new JSONObject();
        j1.put("name", "消极");
        j1.put("value", posMap[3]);
        sitimentIndex.add(j1);

        j1 = new JSONObject();
        j1.put("name", "非常消极");
        j1.put("value", posMap[4]);
        sitimentIndex.add(j1);

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()){
            JSONObject json = new JSONObject();
            json.put("name", entry.getKey());
            json.put("value", entry.getValue());
            wordCloud.add(json);
        }

        JSONObject returnJson = new JSONObject();
        returnJson.put("sentimentIndex", sitimentIndex);
        returnJson.put("wordCloud", wordCloud);
        returnJson.put("sentimentIndexList", sentimentIndexList);
        returnJson.put("news", retJson.getJSONObject("news"));

        return returnJson.toJSONString();
    }

    /**
     * 去掉字符串里面的html代码。<br>
     * 要求数据要规范，比如大于小于号要配套,否则会被集体误杀。
     *
     * @param content
     * 内容
     * @return 去掉后的内容
     */
    public static String stripHtml(String content) {
        // <p>段落替换为换行
        content = content.replaceAll("<p .*?>", "\r\n");
        // <br><br/>替换为换行
        content = content.replaceAll("<br\\s*/?>", "\r\n");
        // 去掉其它的<>之间的东西
        content = content.replaceAll("\\<.*?>", "");
        // 还原HTML
        // content = HTMLDecoder.decode(content);
        return content;
    }
}
