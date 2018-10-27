package com.citicup.controller.peValuation;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.dataDisplay.CompanyBasicInformationMapper;
import com.citicup.dao.peValuation.*;
import com.citicup.model.dataDisplay.CompanyBasicInformation;
import com.citicup.model.peValuation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("/PEValuation")
public class PEValuationController {
    @Autowired
    private DisposedProfitMapper disposedProfitMapper;
    @Autowired
    private stockPEMapper stockPEMapper;
    @Autowired
    private PE_historyMapper pe_historyMapper;
    @Autowired
    private CompanyBasicInformationMapper companyBasicInformationMapper;

    @RequestMapping("/demo")
    public String getPEValuationInfo(@RequestParam String stkcd) {
       double pe = Double.parseDouble(getLatestPEValueByStkcd(stkcd));
       String pePercentile = getPEValuationPercentile(stkcd);
       String valuationTime = getValuationTime();
       String evaluation = getPEValuationEstimate(stkcd);
       double forecast = Double.parseDouble(getExpectedSharePrice(stkcd));
       List<CompanyPeInfo> list = getPERank(0); // 默认获取第一页顺序序列
       return JSONObject.toJSONString(new PeInfoUnit(pe, pePercentile, evaluation, valuationTime, forecast, list));
    }

    /**
     * 获取该公司的历史PE走势图,近两年（2016.10.24-2018.10.19）的数据
     * 时间段：近半年、近一年、近两年
     * @return
     */
    @RequestMapping("/getHistoryPE")
    public String getHistoryPE(@RequestParam String stkcd, @RequestParam String timeInterval) {
        Map<String, Double> histPe = new LinkedHashMap<>();

        String beginDate = ""; //数据初始日期
        String finalDate = "2018-10-19"; //数据最后日期
        switch (timeInterval) {
            case "半年": beginDate = "2018-04-19"; break;
            case "一年": beginDate = "2017-10-19"; break;
            case "两年": beginDate = "2016-10-24"; break;
            default:
                return "错误时间段";
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String out = "";
        for(int i = 0; !out.equals(finalDate); i++) {
            // 将字符串的日期转为Date类型，ParsePosition(0)表示从第一个字符开始解析
            Date date = sdf.parse(beginDate, new ParsePosition(0));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DATE, i);
            Date date1 = calendar.getTime();
            out = sdf.format(date1);
            PE_historyKey key = new PE_history();
            key.setSymbol(stkcd);
            key.setTradingdate(out);
            if(null == pe_historyMapper.selectByPrimaryKey(key)){ //若无该日期数据则跳过
                continue;
            }
            PE_history pe = pe_historyMapper.selectByPrimaryKey(key);
            histPe.put(out.substring(2), Double.parseDouble(pe.getPe()));
        }

        return JSONObject.toJSONString(histPe);
    }

    /**
     * 根据Stkcd(股票id)查找公司的PE值
     * @return
     */
    @RequestMapping("/getPEValue")
    public String getLatestPEValueByStkcd(@RequestParam String stkcd) {
        int code = Integer.parseInt(stkcd);
        stockPE stockPE = stockPEMapper.selectByPrimaryKey(String.valueOf(code));
        double pe = Double.parseDouble(stockPE.getPe());
        return String.format("%.2f", pe);
    }

    /**
     * 获取估值时间(获取当天时间)
     * @return
     */
    @RequestMapping("/getValuationTime")
    public String getValuationTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return sdf.format(date);
    }

    /**
     * 获取指定公司的PE值百分位(默认升序)
     * @return
     */
    @RequestMapping("/getPEValuationPercentile")
    public String getPEValuationPercentile(@RequestParam String stkcd) {
        int code = Integer.parseInt(stkcd);
        List<stockPE> list = stockPEMapper.getSorted();
        int index = 0;
        for(int i = 0; i<list.size(); i++) {
            if(list.get(i).getStkcd().equals(String.valueOf(code))) {
                index = i;
                break;
            }
        }
        double percentile = (index + 1.0) / list.size();
        String result = String.format("%.2f", percentile * 100) + "%";
        return result;
    }

    /**
     * 获取指定公司的PE值估值评价(默认升序)
     * @return
     */
    @RequestMapping("getPEValuationEstimate")
    public String getPEValuationEstimate(@RequestParam String stkcd) {
        int code = Integer.parseInt(stkcd);
        List<stockPE> list = stockPEMapper.getSorted();
        int index = 0;
        for(int i = 0; i<list.size(); i++) {
            if(list.get(i).getStkcd().equals(String.valueOf(code))) {
                index = i;
                break;
            }
        }
        double percentile = (index + 1.0) / list.size();
        if(0 <= percentile && percentile < 0.33) {
            return "估值较低";
        }
        else if(0.33 <= percentile && percentile < 0.66) {
            return "估值适中";
        }
        else {
            return "估值较高";
        }
    }

    /**
     * 获取公司PE值排序序列(默认升序)
     * @return
     */
    @RequestMapping("/getPERank")
    public List<CompanyPeInfo> getPERank(@RequestParam int page) {
        List<stockPE> rankList = stockPEMapper.getSorted();
        List<CompanyPeInfo> list  = new ArrayList<>();
        final int pageSize = 20;
        //long startTime=System.nanoTime();
        for(int i = page*20; i < (page+1)*pageSize && i<rankList.size(); i++) {
            stockPE stockPE = rankList.get(i);
            String stkcd = stockPE.getStkcd();
            int len = stkcd.length();
            if(len < 6) {
                for(int j = 0; j<6-len; j++) {
                    stkcd = "0" + stkcd;
                }
            }

            String compName = companyBasicInformationMapper.selectByPrimaryKey(stkcd).getCompname();
            CompanyPeInfo cmp = new CompanyPeInfo(compName, stkcd, Double.parseDouble(stockPE.getPe()), getPEValuationEstimate(stkcd));
            list.add(cmp);
        }
//        long endTime=System.nanoTime();
//        System.out.println("当前程序耗时："+(endTime-startTime)+"ns");
        return list;
    }

    /**
     * 获取该公司的预测股价(目标价=PE倍数×EPS预测值)
     * @return
     */
    @RequestMapping("/getExpectedSharePrice")
    public String getExpectedSharePrice(@RequestParam String stkcd) {
        int code = Integer.parseInt(stkcd);
        stockPE stockPE = stockPEMapper.selectByPrimaryKey(String.valueOf(code));
        if(null == stockPE) {
            return "无该公司相关数据";
        }
        double pe = Double.parseDouble(stockPE.getPe());
        if(getExpectedEPS(stkcd) == -1.0) {
            return "无该公司相关数据";
        }
        double expectedEPS = getExpectedEPS(stkcd);
        double expectedSharePrice = pe * expectedEPS;
        return String.format("%.4f", expectedSharePrice);
    }

    private double getExpectedEPS(String stkcd) {
        DisposedProfitKey key = new DisposedProfitKey();
        key.setStkcd(stkcd);
        key.setTime("2015-12-31");
        if(null == disposedProfitMapper.selectByPrimaryKey(key)) {
            System.out.println("表中无该数据");
            return -1.0;
        }
        DisposedProfit data2015 = disposedProfitMapper.selectByPrimaryKey(key);
        key.setTime("2016-12-31");
        DisposedProfit data2016 = disposedProfitMapper.selectByPrimaryKey(key);
        key.setTime("2017-12-31");
        DisposedProfit data2017 = disposedProfitMapper.selectByPrimaryKey(key);

        //营业收入，营业成本，营业税金及附加、投资净收益、营业外收入 求出已知年份每年的增长率（今年值/去年值）求均值进行计算
        double expectedIncome = getExpectedIncome(Double.parseDouble(data2015.getIncome()),
                Double.parseDouble(data2016.getIncome()),
                Double.parseDouble(data2017.getIncome()));
        if(expectedIncome == -1.0) { return -1.0; }
        double expectedCost = getExpectedCost(Double.parseDouble(data2015.getCost()),
                Double.parseDouble(data2016.getCost()),
                Double.parseDouble(data2017.getCost()));
        if(expectedCost == -1.0) { return -1.0; }
        double expectedTaxandadditional = getExpectedTaxandadditional(Double.parseDouble(data2015.getTaxandadditional()),
                Double.parseDouble(data2016.getTaxandadditional()),
                Double.parseDouble(data2017.getTaxandadditional()));
        if(expectedTaxandadditional == -1.0) { return -1.0; }
        double expectedInvestmentincome = getExpectedInvestmentIncome(Double.parseDouble(data2015.getInvestmentincome()),
                Double.parseDouble(data2016.getInvestmentincome()),
                Double.parseDouble(data2017.getInvestmentincome()));
        if(expectedInvestmentincome == -1.0) { return -1.0; }
        double expectedNonoperatingIncome = getExpectedNonoperatingincome(Double.parseDouble(data2015.getNonoperatingincome()),
                Double.parseDouble(data2016.getNonoperatingincome()),
                Double.parseDouble(data2017.getNonoperatingincome()));
        if(expectedNonoperatingIncome == -1.0) { return -1.0; }

        //销售费用/营业收入、管理费用/营业收入、财务费用/营业收入 求三者的两年均值作为预测值 通过2019年的营业收入×三个比例算出三个值（销售费用、管理费用、财务费用）
        double expectedSellingexpenses = ((Double.parseDouble(data2015.getSellingexpensesRevenue())
                + Double.parseDouble(data2016.getSellingexpensesRevenue())
                + Double.parseDouble(data2017.getSellingexpensesRevenue())) / 3) * expectedIncome;
        double expectedManagementcost = ((Double.parseDouble(data2015.getManagementcostRevenue())
                + Double.parseDouble(data2016.getManagementcostRevenue())
                + Double.parseDouble(data2017.getManagementcostRevenue())) / 3) * expectedIncome;
        double expectedFinancialcost = ((Double.parseDouble(data2015.getFinancialcostRevenue())
                + Double.parseDouble(data2016.getFinancialcostRevenue())
                + Double.parseDouble(data2017.getFinancialcostRevenue())) / 3) * expectedIncome;
        //公允价值变动收益、其他业务成本、少数股东损益 求均值
        double averageOfFairvaluechangeincome = (Double.parseDouble(data2015.getFairvaluechangeincome())
                + Double.parseDouble(data2016.getFinancialcostRevenue())
                + Double.parseDouble(data2017.getFinancialcostRevenue())/ 3);
        double averageOfOtherbusinesscosts = (Double.parseDouble(data2015.getOtherbusinesscosts())
                + Double.parseDouble(data2016.getOtherbusinesscosts())
                + Double.parseDouble(data2017.getOtherbusinesscosts())/ 3);
        double averageOfMinorityinterest = (Double.parseDouble(data2015.getMinorityinterest())
                + Double.parseDouble(data2016.getMinorityinterest())
                + Double.parseDouble(data2017.getMinorityinterest())/ 3);
        //营业利润减出来
        double expectedOperatingprofit = expectedIncome - (expectedCost + expectedTaxandadditional + expectedSellingexpenses
                + expectedManagementcost + expectedFinancialcost + expectedInvestmentincome + averageOfFairvaluechangeincome
                + averageOfOtherbusinesscosts);
        //利润总额加出来
        double expectedTotalprofit = expectedOperatingprofit + expectedNonoperatingIncome;
        //所得税1.2*2017年所得税
        double expectedIncometaxexpense = 1.2 * Double.parseDouble(data2017.getIncometaxexpense());
        //净利润减出来
        double expectedNetprofit = expectedTotalprofit - expectedIncometaxexpense;
        //归母净利润减出来
        double expectedParentcompanynetprofit = expectedNetprofit - averageOfMinorityinterest;

        double expectedEPS = expectedParentcompanynetprofit /
                (Double.parseDouble(data2017.getParentcompanynetprofit()) / Double.parseDouble(data2017.getEps()));
        return expectedEPS;
    }

    private double getExpectedIncome (double income2015, double income2016, double income2017) {
        double expectedIncome = 0.0;
        if(income2015 != 0 && income2016 != 0 && income2017 !=0) {
            double incomeIncRate2015To2016 = income2016 / income2015;
            double incomeIncRate2016To2017 = income2017 / income2016;
            double meanOfIncomeIncRate = (incomeIncRate2015To2016 + incomeIncRate2016To2017) / 2;
            expectedIncome = income2017 * meanOfIncomeIncRate;
        }
        else if(income2015 == 0 && income2016 != 0 && income2017 !=0) {
            double incomeIncRate2016To2017 = income2017 / income2016;
            expectedIncome = income2017 * incomeIncRate2016To2017;
        }
        else if(income2015 != 0 && income2016 != 0 && income2017 == 0) {
            double incomeIncRate2015To2016 = income2016 / income2015;
            expectedIncome = income2016 * incomeIncRate2015To2016;
        }
        else if(income2016 == 0 && income2017 !=0) {
            expectedIncome = income2017;
        }
        else if(income2015 == 0 && income2016 == 0 && income2017 == 0) {
            return -1.0;
        }
        return expectedIncome;
    }

    private double getExpectedCost(double cost2015, double cost2016, double cost2017) {
        double expectedCost = 0.0;
        if(cost2015 != 0 && cost2016 != 0 && cost2017 !=0) {
            double costIncRate2015To2016 = cost2016 / cost2015;
            double costIncRate2016To2017 = cost2017 / cost2016;
            double meanOfCostIncRate = (costIncRate2015To2016 + costIncRate2016To2017) / 2;
            expectedCost = cost2017 * meanOfCostIncRate;
        }
        else if(cost2015 == 0 && cost2016 != 0 && cost2017 !=0) {
            double costIncRate2016To2017 = cost2017 / cost2016;
            expectedCost = cost2017 * costIncRate2016To2017;
        }
        else if(cost2015 != 0 && cost2016 != 0 && cost2017 == 0) {
            double costIncRate2015To2016 = cost2016 / cost2015;
            expectedCost = cost2016 * costIncRate2015To2016;
        }
        else if(cost2016 == 0 && cost2017 !=0) {
            expectedCost = cost2017;
        }
        else if(cost2015 == 0 && cost2016 == 0 && cost2017 == 0) {
            return -1.0;
        }
        return expectedCost;
    }

    private double getExpectedTaxandadditional(double tax2015, double tax2016, double tax2017) {
        double expectedTaxandadditional = 0.0;
        if(tax2015 != 0 && tax2016 != 0 && tax2017 !=0) {
            double costIncRate2015To2016 = tax2016 / tax2015;
            double costIncRate2016To2017 = tax2017 / tax2016;
            double meanOfIncRate = (costIncRate2015To2016 + costIncRate2016To2017) / 2;
            expectedTaxandadditional = tax2017 * meanOfIncRate;
        }
        else if(tax2015 == 0 && tax2016 != 0 && tax2017 !=0) {
            double costIncRate2016To2017 = tax2017 / tax2016;
            expectedTaxandadditional = tax2017 * costIncRate2016To2017;
        }
        else if(tax2015 != 0 && tax2016 != 0 && tax2017 == 0) {
            double costIncRate2015To2016 = tax2016 / tax2015;
            expectedTaxandadditional = tax2016 * costIncRate2015To2016;
        }
        else if(tax2016 == 0 && tax2017 !=0) {
            expectedTaxandadditional = tax2017;
        }
        else if(tax2015 == 0 && tax2016 == 0 && tax2017 == 0) {
            return -1.0;
        }
        return expectedTaxandadditional;
    }

    private double getExpectedInvestmentIncome(double invest2015, double invest2016, double invest2017) {
        double expectedInvestmentIncome = 0.0;
        if(invest2015 != 0 && invest2016 != 0 && invest2017 !=0) {
            double costIncRate2015To2016 = invest2016 / invest2015;
            double costIncRate2016To2017 = invest2017 / invest2016;
            double meanOfIncRate = (costIncRate2015To2016 + costIncRate2016To2017) / 2;
            expectedInvestmentIncome = invest2017 * meanOfIncRate;
        }
        else if(invest2015 == 0 && invest2016 != 0 && invest2017 !=0) {
            double costIncRate2016To2017 = invest2017 / invest2016;
            expectedInvestmentIncome = invest2017 * costIncRate2016To2017;
        }
        else if(invest2015 != 0 && invest2016 != 0 && invest2017 == 0) {
            double costIncRate2015To2016 = invest2016 / invest2015;
            expectedInvestmentIncome = invest2016 * costIncRate2015To2016;
        }
        else if(invest2016 == 0 && invest2017 !=0) {
            expectedInvestmentIncome = invest2017;
        }
        else if(invest2015 == 0 && invest2016 == 0 && invest2017 == 0) {
            return -1.0;
        }
        return expectedInvestmentIncome;
    }

    private double getExpectedNonoperatingincome(double nonoperating2015, double nonoperating2016, double nonoperating2017) {
        double expectedNonoperatingIncome = 0.0;
        if(nonoperating2015 != 0 && nonoperating2016 != 0 && nonoperating2017 !=0) {
            double costIncRate2015To2016 = nonoperating2016 / nonoperating2015;
            double costIncRate2016To2017 = nonoperating2017 / nonoperating2016;
            double meanOfIncRate = (costIncRate2015To2016 + costIncRate2016To2017) / 2;
            expectedNonoperatingIncome = nonoperating2017 * meanOfIncRate;
        }
        else if(nonoperating2015 == 0 && nonoperating2016 != 0 && nonoperating2017 !=0) {
            double costIncRate2016To2017 = nonoperating2017 / nonoperating2016;
            expectedNonoperatingIncome = nonoperating2017 * costIncRate2016To2017;
        }
        else if(nonoperating2015 != 0 && nonoperating2016 != 0 && nonoperating2017 == 0) {
            double costIncRate2015To2016 = nonoperating2016 / nonoperating2015;
            expectedNonoperatingIncome = nonoperating2016 * costIncRate2015To2016;
        }
        else if(nonoperating2016 == 0 && nonoperating2017 !=0) {
            expectedNonoperatingIncome = nonoperating2017;
        }
        else if(nonoperating2015 == 0 && nonoperating2016 == 0 && nonoperating2017 == 0) {
            return -1.0;
        }
        return expectedNonoperatingIncome;
    }

}
