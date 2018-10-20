package com.citicup.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.correlationAnalysis.DisposedProfitMapper;
import com.citicup.dao.correlationAnalysis.stockPEMapper;
import com.citicup.dao.dataDisplay.CompanyBasicInformationMapper;
import com.citicup.model.correlationAnalysis.DisposedProfit;
import com.citicup.model.correlationAnalysis.DisposedProfitKey;
import com.citicup.model.correlationAnalysis.stockPE;
import com.citicup.model.dataDisplay.CompanyBasicInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/PEValuation")
public class PEValuationController {

    @Autowired
    private CompanyBasicInformationMapper companyBasicInformationMapper;
    @Autowired
    private DisposedProfitMapper disposedProfitMapper;
    @Autowired
    private stockPEMapper stockPEMapper;

    /**
     * 根据Stkcd(股票id)查找公司的PE值
     * @return
     */
    @RequestMapping("/getLatestPEValue")
    public String getLatestPEValueByStkcd(@RequestParam String stkcd) {
        stockPE stockPE = stockPEMapper.selectByPrimaryKey(stkcd);
        double pe = stockPE.getPe();
        return JSONObject.toJSONString(pe);
    }

    /**
     * 获取估值时间(获取当天时间)
     * @return
     */
    @RequestMapping("/getValuationTime")
    public String getValuationTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return JSON.toJSONString(sdf.format(date));
    }

    /**
     * 获取指定公司的PE值百分位
     * @return
     */
    @RequestMapping("/getPEValuationPercentile")
    public String getPEValuationPercentile(@RequestParam String stkcd) {
        return "";
    }

    /**
     * 获取指定公司的PE值估值评价
     * @return
     */
    @RequestMapping("/getPEValuationEstimate")
    public String getPEValuationEstimate(@RequestParam String stkcd) {
        return "";
    }

    /**
     * 获取公司PE值排序序列(默认降序)
     * @return
     */
    @RequestMapping("/getPEValuationOrderList")
    public String getPEValuationOrderList() {
        return "";
    }

    /**
     * 获取该公司的预测股价(目标价=PE倍数×EPS预测值)
     * @return
     */
    @RequestMapping("/getExpectedSharePrice")
    public String getExpectedSharePrice(@RequestParam String stkcd) {
        stockPE stockPE = stockPEMapper.selectByPrimaryKey(stkcd);
        double pe = stockPE.getPe();
        double expectedEPS = getExpectedEPS(stkcd);
        double expectedSharePrice = pe * expectedEPS;
        return JSONObject.toJSONString(expectedSharePrice);
    }

    /**
     * 获取该公司的历史PE走势图
     * @return
     */
    @RequestMapping("/getHistoryPE")
    public String getHistoryPE(@RequestParam String stkcd) {
        return "";
    }

    private double getExpectedEPS(String stkcd) {
        DisposedProfitKey key = new DisposedProfitKey();
        key.setStkcd(stkcd);
        key.setTime("2015-12-31");
        if(null != disposedProfitMapper.selectByPrimaryKey(key)) {
            DisposedProfit data2015 = disposedProfitMapper.selectByPrimaryKey(key);
            key.setTime("2016-12-31");
            DisposedProfit data2016 = disposedProfitMapper.selectByPrimaryKey(key);
            key.setTime("2017-12-31");
            DisposedProfit data2017 = disposedProfitMapper.selectByPrimaryKey(key);
        }
        else {

        }


        return 0.0;
    }


}
