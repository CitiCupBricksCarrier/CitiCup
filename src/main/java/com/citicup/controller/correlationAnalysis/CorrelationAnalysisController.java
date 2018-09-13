package com.citicup.controller.correlationAnalysis;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.correlationAnalysis.*;
import com.citicup.model.Index;
import com.citicup.model.correlationAnalysis.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

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

    private static final String[] indexsName = new String[]{"ConsistenceExpectation", "ConsistenceExpectationPredictProfit",
            "CostProfitMarginCumu", "DealersNumChange_1M", "DividendRate", "GPOA_change", "IncometaxProfitPercent",
            "InventoryTurnover", "MarketSellingRateRec", "PE_RatioRec", "ProfitGrowthRate", "Quick_Ratio", "ROE_change",
            "TenoreRatio_20D", "TenoreRatio_60D", "TurnoverMean_6D", "TurnoverOfTotalAssets", "TurnoverStd_6D"};
    private static final int dayGap = 2;

    /**
     * 单个指标当天增加一次访问量
     * @return
     */
    private void increaseIndexClicks(String analysisIndex){
        Date today = new Date(); // 获取当日日期
        AnalysisIndexVisitorKey key = new AnalysisIndexVisitorKey();
        key.setAnalysisindex(analysisIndex);
        key.setDate(today);
        if(null == analysisIndexVisitorMapper.selectByPrimaryKey(key)) {
            AnalysisIndexVisitor analysisIndexVisitor = new AnalysisIndexVisitor();
            analysisIndexVisitor.setAnalysisindex(analysisIndex);
            analysisIndexVisitor.setDate(today);
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
     * 各指标最近3天的选择人数（所有指标一起）
     * @return
     */
    @RequestMapping("/IndexClicks")
    public String selectIndexClicks() {
        List<JSONObject> json = new ArrayList<>();

        Date today = new Date(); // 获取当日日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        for(String idx : indexsName) {
            int counter = 0;
            for(int i = dayGap; i >= 0; i--) { //获取往前两天的日期
                calendar.add(Calendar.DATE, -i);
                Date date = calendar.getTime();
                AnalysisIndexVisitorKey key = new AnalysisIndexVisitorKey();
                key.setAnalysisindex(idx);
                key.setDate(date);
                counter += analysisIndexVisitorMapper.selectByPrimaryKey(key).getVistornumber(); //统计前三天的访问量
            }

            JSONObject t = new JSONObject();
            t.put(idx, counter);
            json.add(t);
        }

        return JSONObject.toJSONString(json);
    }

    @RequestMapping("/AnalysisIndustry")
    public String selectAnalysisIndustry(String index, String analysisMethod) {
        return null;
    }

    /**
     * 标准化
     * @return
     */
    private List<String> standardize(List<Index> list) {
        List<String> series = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
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
     * @return
     */
    private double getIC(List<Double> list) {
        int size = list.size() / 10; //表示行业股票池中，10%股票的数目
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
        double result = (a - (b*c)/size) / (stdOfTop * stdOfBot);

        return result;
    }

    /**
     * 计算 IC-mean 指标
     * @return
     */
    @RequestMapping("/IC_Mean")
    public String getIC_Mean(@RequestParam String index) {
        increaseIndexClicks(index);
        List<stockEPS> stockEPSList = stockEPSMapper.getAll();
        int periodNumber = 0; // 周期数
        for(int i = 0; i < stockEPSList.size(); i++ ) { //计算非空有效数据的周期数（按季度为单位）
            if(stockEPSList.get(i).getValue() != null || !stockEPSList.get(i).getValue().equals("")) {
                periodNumber++;
            }
            else {
                stockEPSList.remove(i);
                i--;
            }
        }

        switch(index){
            case "安全性-存货周转率":
                List<InventoryTurnover> list = inventoryTurnoverMapper.getAll();
                for(int i = 0; i < list.size(); i++) {
                    if(list.get(i).getValue() == null || list.get(i).getValue().equals("")) {
                        list.remove(i);
                        i--;
                    }
                }
                break;
            case "安全性类-速动比率":
                break;
            case "安全性类-总资产周转率":
                break;
            case "成长-ROE变动":
                break;
            case "成长类-GPOA变动":
                break;
            case "成长类-毛利润增长率":
                break;
            case "分析师类-一致预期PB":
                break;
            case "分析师类-一致预期预测营业收入":
                break;
            case "分析师类-最近一个月券商覆盖数量（券商家数）变化":
                break;
            case "估值类-股息率":
                break;
            case "估值类-市销率的倒数":
                break;
            case "估值类-市盈率的倒数":
                break;
            case "价量-6日成交额标准差":
                break;
            case "价量-6日成交额均值（千元）":
                break;
            case "价量-20日特诺雷比率":
                break;
            case "价量-60日特诺雷比率":
                break;
            case "盈利质量-累计成本费用利润率":
                break;
            case "盈利质量-所得税占盈利总额百分比":
                break;
            default:
                return "查找错误";
        }



        return null;
    }

    /**
     * 计算 IC-std 指标
     * @return
     */
    @RequestMapping("/IC_Mean")
    public String getIC_std(@RequestParam String index) {
        return "hello";
    }



}
