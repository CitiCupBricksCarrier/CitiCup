package com.citicup.controller.correlationAnalysis;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.correlationAnalysis.*;
import com.citicup.dao.dataDisplay.CompanyBasicInformationMapper;
import com.citicup.dao.peValuation.stockPriceMapper;
import com.citicup.model.Index;
import com.citicup.model.correlationAnalysis.*;
import com.citicup.model.dataDisplay.CompanyBasicInformation;
import com.citicup.model.peValuation.stockPrice;
import com.citicup.model.peValuation.stockPriceKey;
import org.apache.commons.math3.fitting.GaussianCurveFitter;
import org.apache.commons.math3.fitting.WeightedObservedPoints;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
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
    @Autowired
    private AnalysisIndexVisitorMapper analysisIndexVisitorMapper;
    @Autowired
    private stockEPSMapper stockEPSMapper;
    @Autowired
    private stockPriceMapper stockPriceMapper;

    private static final String[] indexsName = new String[]{"ConsistenceExpectation", "ConsistenceExpectationPredictProfit",
            "CostProfitMarginCumu", "DealersNumChange_1M", "DividendRate", "GPOA_change", "IncometaxProfitPercent",
            "InventoryTurnover", "MarketSellingRateRec", "PE_RatioRec", "ProfitGrowthRate", "Quick_Ratio", "ROE_change",
            "TenoreRatio_20D", "TenoreRatio_60D", "TurnoverMean_6D", "TurnoverOfTotalAssets", "TurnoverStd_6D"};
    private static final int dayGap = 3;

    /**
     * 获取各指标最近3天的选择人数（所有指标一起）
     * @return 各指标最近3天的选择人数
     */
    @RequestMapping("/IndexClicks")
    public String selectIndexClicks() {
        Map<String, Integer> idxClks = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date(); // 获取当日日期
        for(String idx : indexsName) {
            int counter = 0;
            for(int i = 0; i < dayGap; i++) { //获取往前两天的日期
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(today);
                calendar.add(Calendar.DATE, -i);
                Date date = calendar.getTime();
                String d = sdf.format(date);
                AnalysisIndexVisitorKey key = new AnalysisIndexVisitorKey();
                key.setAnalysisindex(idx);
                key.setDate(d);
                if(null == analysisIndexVisitorMapper.selectByPrimaryKey(key)) {
                    counter += 0;
                }
                else {
                    counter += analysisIndexVisitorMapper.selectByPrimaryKey(key).getVistornumber(); //统计前三天的访问量
                }
            }
            idxClks.put(idx, counter);
        }

        return JSONObject.toJSONString(idxClks);
    }

    private List<Index> getIndexList(String index) {
        List<Index> list = new ArrayList<>();
        switch (index){
            case "安全性-存货周转率":
                List<InventoryTurnover> inv = inventoryTurnoverMapper.getAll();
                for (InventoryTurnover anInv : inv) {
                    if (anInv.getValue() != null && !anInv.getValue().equals("")) {
                        list.add(new Index(anInv.getStkcd(), anInv.getDate(), anInv.getValue()));
                    }
                }

                break;
            case "安全性类-速动比率":
                List<Quick_Ratio> qui = quick_ratioMapper.getAll();
                for(Quick_Ratio q : qui) {
                    if (q.getValue() != null && !q.getValue().equals("")) {
                        list.add(new Index(q.getStkcd(), q.getDate(), q.getValue()));
                    }
                }

                break;
            case "安全性类-总资产周转率":
                List<TurnoverOfTotalAssets> turn = turnoverOfTotalAssetsMapper.getAll();
                for(TurnoverOfTotalAssets total : turn) {
                    if(total.getValue() != null && !total.getValue().equals("")) {
                        list.add(new Index(total.getStkcd(), total.getDate(), total.getValue()));
                    }
                }

                break;
            case "成长-ROE变动":
                List<ROE_change> roe = roe_changeMapper.getAll();
                for(ROE_change r : roe) {
                    if(r.getValue() != null && !r.getValue().equals("")) {
                        list.add(new Index(r.getStkcd(), r.getDate(), r.getValue()));
                    }
                }

                break;
            case "成长类-GPOA变动":
                List<GPOA_change> gpoa_change = gpoa_changeMapper.getAll();
                for(GPOA_change gpoa : gpoa_change) {
                    if(gpoa.getValue() != null && !gpoa.getValue().equals("")) {
                        list.add(new Index(gpoa.getStkcd(), gpoa.getDate(), gpoa.getValue()));
                    }
                }

                break;
            case "成长类-毛利润增长率":
                List<ProfitGrowthRate> profit = profitGrowthRateMapper.getAll();
                for(ProfitGrowthRate p : profit) {
                    if(p.getValue() != null &&  !p.getValue().equals("")) {
                        list.add(new Index(p.getStkcd(), p.getDate(), p.getValue()));
                    }
                }

                break;
            case "分析师类-一致预期PB":
                List<ConsistenceExpectation> conExp = consistenceExpectationMapper.getAll();
                for(ConsistenceExpectation con : conExp) {
                    if(con.getValue() != null && !con.getValue().equals("")) {
                        list.add(new Index(con.getStkcd(), con.getDate(), con.getValue()));
                    }
                }

                break;
            case "分析师类-一致预期预测营业收入":
                List<ConsistenceExpectationPredictProfit> conExpPrePro = consistenceExpectationPredictProfitMapper.getAll();
                for(ConsistenceExpectationPredictProfit con : conExpPrePro) {
                    if(con.getValue() != null && !con.getValue().equals("")) {
                        list.add(new Index(con.getStkcd(), con.getDate(), con.getValue()));
                    }
                }

                break;
            case "分析师类-最近一个月券商覆盖数量（券商家数）变化":
                List<DealersNumChange_1M> dealers = dealersNumChange_1MMapper.getAll();
                for(DealersNumChange_1M deal : dealers) {
                    if(deal.getValue() != null && !deal.getValue().equals("")) {
                        list.add(new Index(deal.getStkcd(), deal.getDate(), deal.getValue()));
                    }
                }

                break;
            case "估值类-股息率":
                List<DividendRate> dividendRates = dividendRateMapper.getAll();
                for(DividendRate dividend : dividendRates) {
                    if(dividend.getValue() != null && !dividend.getValue().equals("")) {
                        list.add(new Index(dividend.getStkcd(), dividend.getDate(), dividend.getValue()));
                    }
                }

                break;
            case "估值类-市销率的倒数":
                List<MarketSellingRateRec> marketSellingRateRecs = marketSellingRateRecMapper.getAll();
                for(MarketSellingRateRec market : marketSellingRateRecs) {
                    if(market.getValue() != null && !market.getValue().equals("")) {
                        list.add(new Index(market.getStkcd(), market.getDate(), market.getValue()));
                    }
                }

                break;
            case "估值类-市盈率的倒数":
                List<PE_RatioRec> pe_ratioRec = pe_ratioRecMapper.getAll();
                for(PE_RatioRec pe : pe_ratioRec) {
                    if(pe.getValue() != null && !pe.getValue().equals("")) {
                        list.add(new Index(pe.getStkcd(), pe.getDate(), pe.getValue()));
                    }
                }

                break;
            case "价量-6日成交额标准差":
                List<TurnoverStd_6D> turnoverStd_6D = turnoverStd_6DMapper.getAll();
                for(TurnoverStd_6D std : turnoverStd_6D) {
                    if(std.getValue() != null && !std.getValue().equals("")) {
                        list.add(new Index(std.getStkcd(), std.getDate(), std.getValue()));
                    }
                }

                break;
            case "价量-6日成交额均值（千元）":
                List<TurnoverMean_6D> turnoverMean_6D = turnoverMean_6DMapper.getAll();
                for(TurnoverMean_6D mean : turnoverMean_6D) {
                    if(mean.getValue() != null && !mean.getValue().equals("")) {
                        list.add(new Index(mean.getStkcd(), mean.getDate(), mean.getValue()));
                    }
                }

                break;
            case "价量-20日特诺雷比率":
                List<TenoreRatio_20D> tenoreRatio_20D = tenoreRatio_20DMapper.getAll();
                for(TenoreRatio_20D t : tenoreRatio_20D) {
                    if(t.getValue() != null && !t.getValue().equals("")) {
                        list.add(new Index(t.getStkcd(), t.getDate(), t.getValue()));
                    }
                }

                break;
            case "价量-60日特诺雷比率":
                List<TenoreRatio_60D> tenoreRatio_60D = tenoreRatio_60DMapper.getAll();
                for(TenoreRatio_60D t : tenoreRatio_60D) {
                    if(t.getValue() != null && !t.getValue().equals("")) {
                        list.add(new Index(t.getStkcd(), t.getDate(), t.getValue()));
                    }
                }

                break;
            case "盈利质量-累计成本费用利润率":
                List<CostProfitMarginCumu> cost = costProfitMarginCumuMapper.getAll();
                for(CostProfitMarginCumu c : cost) {
                    if(c.getValue() != null && !c.getValue().equals("")) {
                        list.add(new Index(c.getStkcd(), c.getDate(), c.getValue()));
                    }
                }

                break;
            case "盈利质量-所得税占盈利总额百分比":
                List<IncometaxProfitPercent> income = incometaxProfitPercentMapper.getAll();
                for(IncometaxProfitPercent percent : income) {
                    if(percent.getValue() != null && !percent.getValue().equals("")) {
                        list.add(new Index(percent.getStkcd(), percent.getDate(), percent.getValue()));
                    }
                }

                break;
            default:
                return new ArrayList<>();
        }
        return list;
    }

    /**
     * 指标对行业的分析
     * @return 分析结果
     */
    @RequestMapping("/AnalysisIndustry")
    public String selectAnalysisIndustry(@RequestParam String index, @RequestParam String analysisMethod) {
        increaseIndexClicks(index);
        List<Index> list = getIndexList(index);
        if(list == null || list.size() == 0) { System.out.println("list长度为0"); return "查找指标为空";}
        String reply = getAnalysis(list, analysisMethod);
        return JSONObject.toJSONString(reply);
    }

    /**
     * 复合因子的IC对行业的分析
     * @return 分析结果
     */
    @RequestMapping("/Multi_FactorsAnalysis")
    public String selectMulti_FactorsAnalysis(@RequestParam List<String> indexes, @RequestParam String analysisMethod,
                                                   @RequestParam List<Integer> ratio) {

        if(indexes.size() != ratio.size()) { System.out.println("指标数与权重数不一致"); }

        List<List<Index>> composite = new ArrayList<>();
        int ceiling = 0;
        for(int r : ratio) {
            ceiling += r;
        }

        for(int i = 0; i<indexes.size(); i++) {
            String index = indexes.get(i);
            increaseIndexClicks(index);
            List<Index> list = new ArrayList<>();
            switch (index){
                case "安全性-存货周转率":
                    List<InventoryTurnover> inv = inventoryTurnoverMapper.getAll();
                    for (InventoryTurnover anInv : inv) {
                        if (anInv.getValue() != null && !anInv.getValue().equals("")) {
                            double newValue = Double.parseDouble(anInv.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(anInv.getStkcd(), anInv.getDate(), newValue+""));
                        }
                    }
                    break;
                case "安全性类-速动比率":
                    List<Quick_Ratio> qui = quick_ratioMapper.getAll();
                    for(Quick_Ratio q : qui) {
                        if (q.getValue() != null && !q.getValue().equals("")) {
                            double newValue = Double.parseDouble(q.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(q.getStkcd(), q.getDate(), newValue+""));
                        }
                    }
                    break;
                case "安全性类-总资产周转率":
                    List<TurnoverOfTotalAssets> turn = turnoverOfTotalAssetsMapper.getAll();
                    for(TurnoverOfTotalAssets total : turn) {
                        if(total.getValue() != null && !total.getValue().equals("")) {
                            double newValue = Double.parseDouble(total.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(total.getStkcd(), total.getDate(), newValue+""));
                        }
                    }
                    break;
                case "成长-ROE变动":
                    List<ROE_change> roe = roe_changeMapper.getAll();
                    for(ROE_change r : roe) {
                        if(r.getValue() != null && !r.getValue().equals("")) {
                            double newValue = Double.parseDouble(r.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(r.getStkcd(), r.getDate(), newValue+""));
                        }
                    }
                    break;
                case "成长类-GPOA变动":
                    List<GPOA_change> gpoa_change = gpoa_changeMapper.getAll();
                    for(GPOA_change gpoa : gpoa_change) {
                        if(gpoa.getValue() != null && !gpoa.getValue().equals("")) {
                            double newValue = Double.parseDouble(gpoa.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(gpoa.getStkcd(), gpoa.getDate(), newValue+""));
                        }
                    }
                    break;
                case "成长类-毛利润增长率":
                    List<ProfitGrowthRate> profit = profitGrowthRateMapper.getAll();
                    for(ProfitGrowthRate p : profit) {
                        if(p.getValue() != null &&  !p.getValue().equals("")) {
                            double newValue = Double.parseDouble(p.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(p.getStkcd(), p.getDate(), newValue+""));
                        }
                    }
                    break;
                case "分析师类-一致预期PB":
                    List<ConsistenceExpectation> conExp = consistenceExpectationMapper.getAll();
                    for(ConsistenceExpectation con : conExp) {
                        if(con.getValue() != null && !con.getValue().equals("")) {
                            double newValue = Double.parseDouble(con.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(con.getStkcd(), con.getDate(), newValue+""));
                        }
                    }
                    break;
                case "分析师类-一致预期预测营业收入":
                    List<ConsistenceExpectationPredictProfit> conExpPrePro = consistenceExpectationPredictProfitMapper.getAll();
                    for(ConsistenceExpectationPredictProfit con : conExpPrePro) {
                        if(con.getValue() != null && !con.getValue().equals("")) {
                            double newValue = Double.parseDouble(con.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(con.getStkcd(), con.getDate(), newValue+""));
                        }
                    }
                    break;
                case "分析师类-最近一个月券商覆盖数量（券商家数）变化":
                    List<DealersNumChange_1M> dealers = dealersNumChange_1MMapper.getAll();
                    for(DealersNumChange_1M deal : dealers) {
                        if(deal.getValue() != null && !deal.getValue().equals("")) {
                            double newValue = Double.parseDouble(deal.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(deal.getStkcd(), deal.getDate(), newValue+""));
                        }
                    }
                    break;
                case "估值类-股息率":
                    List<DividendRate> dividendRates = dividendRateMapper.getAll();
                    for(DividendRate dividend : dividendRates) {
                        if(dividend.getValue() != null && !dividend.getValue().equals("")) {
                            double newValue = Double.parseDouble(dividend.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(dividend.getStkcd(), dividend.getDate(), newValue+""));
                        }
                    }
                    break;
                case "估值类-市销率的倒数":
                    List<MarketSellingRateRec> marketSellingRateRecs = marketSellingRateRecMapper.getAll();
                    for(MarketSellingRateRec market : marketSellingRateRecs) {
                        if(market.getValue() != null && !market.getValue().equals("")) {
                            double newValue = Double.parseDouble(market.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(market.getStkcd(), market.getDate(), newValue+""));
                        }
                    }
                    break;
                case "估值类-市盈率的倒数":
                    List<PE_RatioRec> pe_ratioRec = pe_ratioRecMapper.getAll();
                    for(PE_RatioRec pe : pe_ratioRec) {
                        if(pe.getValue() != null && !pe.getValue().equals("")) {
                            double newValue = Double.parseDouble(pe.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(pe.getStkcd(), pe.getDate(), newValue+""));
                        }
                    }
                    break;
                case "价量-6日成交额标准差":
                    List<TurnoverStd_6D> turnoverStd_6D = turnoverStd_6DMapper.getAll();
                    for(TurnoverStd_6D std : turnoverStd_6D) {
                        if(std.getValue() != null && !std.getValue().equals("")) {
                            double newValue = Double.parseDouble(std.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(std.getStkcd(), std.getDate(), newValue+""));
                        }
                    }
                    break;
                case "价量-6日成交额均值（千元）":
                    List<TurnoverMean_6D> turnoverMean_6D = turnoverMean_6DMapper.getAll();
                    for(TurnoverMean_6D mean : turnoverMean_6D) {
                        if(mean.getValue() != null && !mean.getValue().equals("")) {
                            double newValue = Double.parseDouble(mean.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(mean.getStkcd(), mean.getDate(), newValue+""));
                        }
                    }
                    break;
                case "价量-20日特诺雷比率":
                    List<TenoreRatio_20D> tenoreRatio_20D = tenoreRatio_20DMapper.getAll();
                    for(TenoreRatio_20D t : tenoreRatio_20D) {
                        if(t.getValue() != null && !t.getValue().equals("")) {
                            double newValue = Double.parseDouble(t.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(t.getStkcd(), t.getDate(), newValue+""));
                        }
                    }
                    break;
                case "价量-60日特诺雷比率":
                    List<TenoreRatio_60D> tenoreRatio_60D = tenoreRatio_60DMapper.getAll();
                    for(TenoreRatio_60D t : tenoreRatio_60D) {
                        if(t.getValue() != null && !t.getValue().equals("")) {
                            double newValue = Double.parseDouble(t.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(t.getStkcd(), t.getDate(), newValue+""));
                        }
                    }
                    break;
                case "盈利质量-累计成本费用利润率":
                    List<CostProfitMarginCumu> cost = costProfitMarginCumuMapper.getAll();
                    for(CostProfitMarginCumu c : cost) {
                        if(c.getValue() != null && !c.getValue().equals("")) {
                            double newValue = Double.parseDouble(c.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(c.getStkcd(), c.getDate(), newValue+""));
                        }
                    }
                    break;
                case "盈利质量-所得税占盈利总额百分比":
                    List<IncometaxProfitPercent> income = incometaxProfitPercentMapper.getAll();
                    for(IncometaxProfitPercent percent : income) {
                        if(percent.getValue() != null && percent.getValue().equals("")) {
                            double newValue = Double.parseDouble(percent.getValue()) * ratio.get(i) / ceiling;
                            list.add(new Index(percent.getStkcd(), percent.getDate(), newValue+""));
                        }
                    }
                    break;
                default:
                    return "查找错误";
            }
            composite.add(list);
        }

        // 加权计算
        List<Index> compositeList = composite.get(0);
        for(int i = 1; i<composite.size(); i++) {
            for (int j = 0; j<composite.get(i).size(); j++) {
                for (int k = 0; k<compositeList.size(); k++) {
                    Index idxk = compositeList.get(k);
                    Index idxj = composite.get(i).get(j);
                    if(idxk.getStkcd().equals(idxj.getStkcd()) && idxk.getDate().equals(idxj.getDate())) {
                        double value = Double.parseDouble(idxk.getValue()) + Double.parseDouble(idxj.getValue());
                        Index idx = new Index(idxk.getStkcd(), idxk.getDate(), value+"");
                        compositeList.set(k, idx);
                    }
                }
            }
        }

        if(compositeList.size() == 0) { System.out.println("list长度为0"); return "查找指标为空";}
        String reply = getAnalysis(compositeList, analysisMethod);
        return JSONObject.toJSONString(reply);
    }

    /**
     * 指标值与股价散点图
     * 数据从2016-05到2018-03
     * @return 散点图
     */
    @RequestMapping("/ScatterChart")
    public String getIndexAndPriceScatterChart(@RequestParam String index,
                                               @RequestParam(name="stkcd",required=false,defaultValue="000012") String stkcd) {
        int length = 23;
        String[] months = new String[length];
        double[] indexValues = new double[length];
        double[] price = new double[length];
        List<Index> list = getIndexList(index);
        String beginDate = "2016-05-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(beginDate, new ParsePosition(0)));
        String month = beginDate.substring(0, 7);
        for(int i = 0; i<length; i++){
            int code = Integer.parseInt(stkcd);
            String stockCode = String.valueOf(code);

            for(Index idx : list) {
                if(idx.getStkcd().equals(stockCode) && idx.getDate().substring(0,7).equals(month)){
                    indexValues[i] = Double.parseDouble(idx.getValue());

                }
            }

            for(int d = 1; d<=31; d++) {
                String y = month.substring(0, 4); //year
                int m = Integer.parseInt(month.substring(5));//month
                String date = y + "/" + m + "/" + d;
                stockPriceKey key = new stockPriceKey();
                key.setStkcd(stockCode);
                key.setDate(date);
                if(null != stockPriceMapper.selectByPrimaryKey(key)){
                    stockPrice p = stockPriceMapper.selectByPrimaryKey(key);
                    price[i] = Double.parseDouble(p.getValue());
                    break;
                }
            }

            months[i] = month;
            calendar.add(Calendar.MONTH, 1);
            month = sdf.format(calendar.getTime()).substring(0,7);
        }

        JSONObject scatterChart = new JSONObject();
        scatterChart.put("xAxis", months);
        scatterChart.put("yIndex", indexValues);
        scatterChart.put("yPrice", price);
        return scatterChart.toJSONString();
    }

    /**
     * 指标IC的相关图
     * @return
     */
    @RequestMapping("/IcRelevantChart")
    public String getIcRelevantChart(@RequestParam String index) {
        JSONObject wholeCharts = new JSONObject();

        wholeCharts.put("OriginalChart", getIcSequence(index));
        wholeCharts.put("NormalDistribution", getNormalDistribution(index));
        wholeCharts.put("QQChart", getQQChart(index));
        wholeCharts.put("ThermodynamicChart", getThermodynamicChart(index));

        Map<String, Double> icSequence = getIcSequence(getIndexList(index));
        double sumOfIC = 0.0;
        double sumOfPowIC = 0.0;
        for(double ic : icSequence.values()) {
            sumOfIC += ic;
            sumOfPowIC += Math.pow(ic, 2);
        }
        double mean = sumOfIC / icSequence.size();
        double std = Math.sqrt(sumOfPowIC - ((Math.pow(sumOfIC, 2) / icSequence.size())));;
        wholeCharts.put("mean", mean);
        wholeCharts.put("std", std);

        return wholeCharts.toJSONString();
    }

    /**
     * 多空收益序列直线图
     * @return 直线图
     */
    @RequestMapping("/RsSequenceDiagram")
    public String getRsSequence(@RequestParam String index) {
        Map<String, Double> rsSequence = getRsSequence(getIndexList(index));
        String[] rsSqeX = new String[rsSequence.size()];
        double[] rsSqeY = new double[rsSequence.size()];
        int i = 0;
        for(Map.Entry<String, Double> entry : rsSequence.entrySet()) {
            rsSqeX[i] = entry.getKey();
            rsSqeY[i] = entry.getValue();
            i++;
        }
        JSONObject rsSqeChart = new JSONObject();
        rsSqeChart.put("xAxis", rsSqeX);
        rsSqeChart.put("yAxis", rsSqeY);
        return rsSqeChart.toJSONString();
    }

    private JSONObject getIcSequence(String index) {
        Map<String, Double> icSequence = getIcSequence(getIndexList(index));
        String[] icSqeX = new String[icSequence.size()];
        double[] icSqeY = new double[icSequence.size()];
        int i = 0;
        for (Map.Entry<String, Double> entry : icSequence.entrySet()) {
            icSqeX[i] = entry.getKey();
            icSqeY[i] = entry.getValue();
            i++;
        }
        JSONObject icSqeChart = new JSONObject();
        icSqeChart.put("xAxis", icSqeX);
        icSqeChart.put("yAxis", icSqeY);

        return icSqeChart;
    }

    private JSONObject getNormalDistribution(String index) {
        return null;
    }

    private JSONObject getQQChart(String index) {

        return null;
    }

    private JSONObject getThermodynamicChart(String index) {
        //x axis
        String[] year = {"2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018"};
        //y axis
        String[] quarter = {"01", "02", "03", "04"};
        JSONArray cells = new JSONArray();

        Map<String, Double> icSequence = getIcSequence(getIndexList(index));
        for (String aQuarter : quarter) {
            for (String aYear : year) {
                JSONObject cell = new JSONObject();
                cell.put("x", aYear);
                cell.put("y", aQuarter);
                cell.put("value", icSequence.get(aYear + "-" + aQuarter));
                cells.add(cell);
            }
        }

        JSONObject thermodynamicChart = new JSONObject();
        thermodynamicChart.put("xAxis", year);
        thermodynamicChart.put("yAxis", quarter);
        thermodynamicChart.put("dataArray", cells);

        return thermodynamicChart;
    }

    /**
     * 单个指标当天增加一次访问量
     *
     */
    private void increaseIndexClicks(String analysisIndex){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date(); // 获取当日日期
        AnalysisIndexVisitorKey key = new AnalysisIndexVisitorKey();
        key.setAnalysisindex(analysisIndex);
        key.setDate(sdf.format(today));
        if(null == analysisIndexVisitorMapper.selectByPrimaryKey(key)) {
            AnalysisIndexVisitor analysisIndexVisitor = new AnalysisIndexVisitor();
            analysisIndexVisitor.setAnalysisindex(analysisIndex);
            analysisIndexVisitor.setDate(sdf.format(today));
            analysisIndexVisitor.setVistornumber(1);
            analysisIndexVisitorMapper.insert(analysisIndexVisitor);
        }
        else {
            AnalysisIndexVisitor analysisIndexVisitor = analysisIndexVisitorMapper.selectByPrimaryKey(key);
            int newValue = analysisIndexVisitor.getVistornumber() + 1;
            analysisIndexVisitor.setVistornumber(newValue);
            analysisIndexVisitorMapper.updateByPrimaryKeySelective(analysisIndexVisitor);
        }
    }

    /**
     * 标准化
     * @return 索引为排名，内容为股票代码
     */
    private List<String> standardize(List<Index> list) {
        List<String> series = new ArrayList<>();
        for (int i = 0; i<list.size(); i++) {
            if(list.get(i) == null || list.get(i).getValue() == null || list.get(i).getValue().equals("inf")) {
                list.remove(i);
                i--;
                continue;
            }
            series.add(list.get(i).getStkcd());
        }

        for(int i = 0; i<list.size()-1; i++) {
            for(int j = 0; j<list.size()-1; j++) {
                double a = Double.parseDouble(list.get(j).getValue());
                double b = Double.parseDouble(list.get(j+1).getValue());
                if(a > b) {
                    String tmp = series.get(j);
                    series.set(j, series.get(j+1));
                    series.set(j+1, tmp);
                }
            }
        }

        return series;
    }

    /**
     * 计算 某一周期 IC值
     * @return IC值
     */
    private double getIC(List<Double> list) {
        int size = list.size() / 10; //表示行业股票池中，10%股票的数目
        if(size == 0) {size = 3; System.out.println("list.size() = "+list.size());}
        List<Double> top = new ArrayList<>();
        List<Double> bottom = new ArrayList<>();
        for(int i = 0, j = list.size() - size; i<size && j<list.size(); i++, j++) {
            top.add(list.get(i));
            bottom.add(list.get(j));
        }

        double a = 0.0, b = 0.0, c = 0.0;
        double aveOfTop = 0.0, aveOfBot = 0.0, stdOfTop = 0.0, stdOfBot = 0.0;
        for(int i = 0; i<size; i++) {
            a += top.get(i) * bottom.get(i);
            b += top.get(i);
            c += bottom.get(i);
        }
        aveOfTop = b / size;
        aveOfBot = c / size;
        for(int i = 0; i<size; i++) {
            stdOfTop += Math.pow(top.get(i) - aveOfTop, 2);
            stdOfBot += Math.pow(bottom.get(i) - aveOfBot, 2);
        }
        stdOfTop = Math.sqrt(stdOfTop / size);
        stdOfBot = Math.sqrt(stdOfBot / size);
        if(stdOfTop * stdOfBot == 0) { System.out.println("除零错误"); }
        double result = (a - (b*c)/size) / (stdOfTop * stdOfBot);
        result -=  Math.floor(result);
        return result;
    }

    /**
     * 获取IC序列
     * @return IC序列
     */
    private Map<String, Double> getIcSequence(List<Index> list) {
        Map<String, Double> icSequence = new LinkedHashMap<>();
        List<stockEPS> stockEPSList = stockEPSMapper.getAll();
        Map<String, List<Index>> epsPerQuarter = new LinkedHashMap<>();
        for(stockEPS s : stockEPSList){
            if(s == null || s.getValue() == null || s.getValue().equals("inf")) {
                continue;
            }
            String date = s.getDate();
            Index index = new Index(s.getStkcd(),s.getDate(),s.getValue());
            if(epsPerQuarter.containsKey(date)) {
                epsPerQuarter.get(date).add(index);
            }
            else {
                List<Index> listOfIndexes = new ArrayList<>();
                listOfIndexes.add(index);
                epsPerQuarter.put(date, listOfIndexes);
            }
        }
        if(epsPerQuarter.size() <= 0) { System.out.println("股票收益内容为空");}

        for(String quarter : epsPerQuarter.keySet()) {
            List<Index> tmp = new ArrayList<>();
            for(Index idx : list) {
                String[] date = idx.getDate().split("-");
                if(quarter.substring(0,4).equals(date[0])){ // 匹配年份
                    switch (quarter.substring(4,6)){ // 匹配月份和季度
                        case "01": // 第一季度
                            if(date[1].equals("02")){
                                tmp.add(idx);
                            }
                            break;
                        case "02": // 第二季度
                            if(date[1].equals("05")){
                                tmp.add(idx);
                            }
                            break;
                        case "03": // 第三季度
                            if(date[1].equals("08")){
                                tmp.add(idx);
                            }
                            break;
                        case "04": // 第四季度
                            if(date[1].equals("11")){
                                tmp.add(idx);
                            }
                            break;
                    }
                }
            }

            List<String> standardizedIndexes = standardize(tmp);
            List<String> standardizedEps = standardize(epsPerQuarter.get(quarter));
            List<Double> series = new ArrayList<>();
            for (String standardizedIndex : standardizedIndexes) {
                for (int j = 0; j < standardizedEps.size(); j++) {
                    if (standardizedIndex.equals(standardizedEps.get(j))) {
                        series.add((double) j);
                    }
                }
            }
            String date = quarter.substring(0,4) + "-" + quarter.substring(4,6);
            icSequence.put(date, getIC(series));
        }
        return icSequence;
    }

    /**
     * 计算 IC-mean 指标
     * @return IC-mean 指标
     */
    private double getIC_Mean(List<Index> list) {
        Map<String, Double> icSequence = getIcSequence(list);
        double sumOfIC = 0.0;
        for(double ic : icSequence.values()) {
            sumOfIC += ic;
        }
        double IC_Mean = sumOfIC / icSequence.size();

        return IC_Mean;
    }

    /**
     * 计算 IC-Std 指标
     * @return IC-Std 指标
     */
    private double getIC_Std(List<Index> list) {
        Map<String, Double> icSequence = getIcSequence(list);
        double sumOfIC = 0.0;
        double sumOfPowIC = 0.0;
        for(double ic : icSequence.values()) {
            sumOfIC += ic;
            sumOfPowIC += Math.pow(ic, 2);
        }

        double IC_std = Math.sqrt(sumOfPowIC - ((Math.pow(sumOfIC, 2) / icSequence.size())));
        return IC_std;
    }

    /**
     * 计算 IC-IR 指标
     * @return IC-IR 指标
     */
    private double getIC_IR(List<Index> list) {
        Map<String, Double> icSequence = getIcSequence(list);
        double sumOfIC = 0.0;
        double sumOfPowIC = 0.0;
        for(double ic : icSequence.values()) {
            sumOfIC += ic;
            sumOfPowIC += Math.pow(ic, 2);
        }

        double IC_std = Math.sqrt(sumOfPowIC - ((Math.pow(sumOfIC, 2) / icSequence.size())));
        double IC_IR = (sumOfIC / icSequence.size()) / IC_std;

        return IC_IR;
    }

    /**
     * 计算 IC-T 指标
     * @return IC-T 指标
     */
    private double getIC_T(List<Index> list) {
        Map<String, Double> icSequence = getIcSequence(list);
        double sumOfIC = 0.0;
        double sumOfPowIC = 0.0;
        for(double ic : icSequence.values()) {
            sumOfIC += ic;
            sumOfPowIC += Math.pow(ic, 2);
        }

        double IC_Var = sumOfPowIC - Math.pow((sumOfIC / icSequence.size()), 2);
        double IC_Mean = sumOfIC / icSequence.size();
        double IC_T = (IC_Mean - 0) / (Math.sqrt((IC_Var / icSequence.size())));

        return IC_T;
    }

    /**
     * 获取RS序列
     * @return RS序列
     */
    private Map<String, Double> getRsSequence(List<Index> list) {
        List<stockEPS> stockEPSList = stockEPSMapper.getAll();
        Map<String, List<Index>> epsPerQuarter = new LinkedHashMap<>();
        Map<String, Double> rsSequence = new LinkedHashMap<>();

        for(stockEPS s : stockEPSList){
            if(s == null || s.getValue() == null || s.getValue().equals("inf")) {
                continue;
            }
            String date = s.getDate();
            Index index =  new Index(s.getStkcd(),s.getDate(),s.getValue());
            if(epsPerQuarter.containsKey(date)) {
                epsPerQuarter.get(date).add(index);
            }
            else {
                List<Index> listOfIndexes = new ArrayList<>();
                listOfIndexes.add(index);
                epsPerQuarter.put(date, listOfIndexes);
            }
        }

        if(epsPerQuarter.size() <= 0) { System.out.println("股票收益内容为空"); System.exit(0);}

        for(String quarter : epsPerQuarter.keySet()) {
            List<Index> tmp = new ArrayList<>();
            for(Index idx : list) {
                String[] date = idx.getDate().split("-");
                if(quarter.substring(0,4).equals(date[0])){ // 匹配年份
                    switch (quarter.substring(4,6)){ // 匹配月份和季度
                        case "01": // 第一季度
                            if(date[1].equals("02")){
                                tmp.add(idx);
                            }
                            break;
                        case "02": // 第二季度
                            if(date[1].equals("05")){
                                tmp.add(idx);
                            }
                            break;
                        case "03": // 第三季度
                            if(date[1].equals("08")){
                                tmp.add(idx);
                            }
                            break;
                        case "04": // 第四季度
                            if(date[1].equals("11")){
                                tmp.add(idx);
                            }
                            break;
                    }
                }
            }
            List<String> standardizedIndexes = standardize(tmp);
            List<Double> series = new ArrayList<>();
            for (String standardizedIndex : standardizedIndexes) {
                for (int j = 0; j < epsPerQuarter.get(quarter).size(); j++) {
                    if (standardizedIndex.equals(epsPerQuarter.get(quarter).get(j).getStkcd())) {
                        series.add(Double.parseDouble(epsPerQuarter.get(quarter).get(j).getValue()));
                    }
                }
            }
            String date = quarter.substring(0, 4) + "-" + quarter.substring(4, 6);
            rsSequence.put(date, getRS(series));
        }
        return rsSequence;
    }

    /**
     * 计算 多空收益 指标
     * @return 多空收益 指标
     */
    private double getLong_Short_Earnings(List<Index> list) {
        Map<String, Double> rsSequence = getRsSequence(list);
        double sumOfRS = 0.0;
        for(double ic : rsSequence.values()) {
            sumOfRS += ic;
        }

        double RS = sumOfRS / rsSequence.size();
        return RS;
    }

    /**
     * 计算 单周期多空收益
     * @return 单周期多空收益
     */
    private double getRS(List<Double> list) {
        int size = list.size() / 10; //表示行业股票池中，10%股票的数目
        if(size == 0) {size = 2; }
        List<Double> top = new ArrayList<>();
        List<Double> bottom = new ArrayList<>();
        for(int i = 0, j = list.size() - size; i<size && j<list.size(); i++, j++) {
            top.add(list.get(i));
            bottom.add(list.get(j));
        }

        double a = 0.0, b = 0.0;
        double aveOfTop = 0.0, aveOfBot = 0.0;
        for(int i = 0; i<size; i++) {
            a += top.get(i);
            b += bottom.get(i);
        }
        aveOfTop = a / size;
        aveOfBot = b / size;
        double result = aveOfTop - aveOfBot;
        return result;
    }

    private String getAnalysis(List<Index> list, String analysisMethod) {
        String reply = "";
        double result = 0.0;
        switch (analysisMethod) {
            case "IC-mean":
                result = Math.abs(getIC_Mean(list));
                if(result > 0.1) {
                    reply = "您所选择的指标和行业股票的收益率之间有较强的相关性。";
                }
                else if(0.1 >=result && result > 0.05) {
                    reply = "您所选择的指标和行业股票的收益率之间有相关性。";
                }
                else if(0.05 >= result && result >0.02) {
                    reply = "您所选择的指标和行业股票的收益率之间相关性较弱。";
                }
                else {
                    reply = "您所选择的指标和行业股票的收益率之间几乎没有相关性。";
                }
                reply = reply + "IC-mean值为：" + String.format("%.4f", result);
                break;
            case "IC-IR":
                result = Math.abs(getIC_IR(list));
                if(result > 0.7) {
                    reply = "您所选择的指标和行业股票的收益率之间有较强的相关性，且相关性稳定。";
                }
                else if(0.7 >=result && result > 0.5) {
                    reply = "您所选择的指标和行业股票的收益率之间有相关性，且相关性较稳定。";
                }
                else if(0.5 >= result && result >0.2) {
                    reply = "您所选择的指标和行业股票的收益率之间相关性较弱，且相关性不太稳定。";
                }
                else {
                    reply = "您所选择的指标和行业股票的收益率之间几乎没有相关性。";
                }
                reply = reply + "IC-IR值为：" + String.format("%.4f", result);
                break;
            case "IC-T":
                result = Math.abs(getIC_T(list));
                if(result > 0.7) {
                    reply = "您所选择的指标和行业股票的收益率之间几乎没有相关性。";
                }
                else if(0.7 >=result && result > 0.5) {
                    reply = "您所选择的指标和行业股票的收益率之间相关性较不显著。";
                }
                else if(0.5 >= result && result >0.2) {
                    reply = "您所选择的指标和行业股票的收益率之间有相关性。";
                }
                else {
                    reply = "您所选择的指标和行业股票的收益率之间有较显著的相关性。";
                }
                reply = reply + "IC-T值为：" + String.format("%.4f", result);
                break;
            case "多空收益":
                result = getLong_Short_Earnings(list);
                reply = "多空收益可用来探究您选择的因子对整个行业股票收益率的影响；你所选择的因子对应的多空收益为：" + String.format("%.4f", result);
                break;
            default:
                return "无此方法";
        }
        return reply;
    }

//    public static void main(String[] args) {
//        WeightedObservedPoints obs = new WeightedObservedPoints();
//        obs.add(0, 25);
//        obs.add(1, 68);
//        obs.add(2, 144);
//        obs.add(3, 220);
//        obs.add(4, 335);
//        obs.add(5, 199);
//        obs.add(6, 52);
//        obs.add(7, 14);
//        obs.add(8, 5);
//        obs.add(9, 2);
//
//        double[] parameters = GaussianCurveFitter.create().fit(obs.toList());
//        for (double i : parameters) {
//            System.out.println(i);
//        }
//    }

}
