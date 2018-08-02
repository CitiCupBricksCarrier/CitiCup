package com.citicup.controller;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.*;
import com.citicup.model.*;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.dc.pr.PRError;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/industryData/sellNum")
public class IndustryDataSellNumController {

    //乘用车销量
    @Autowired
    private ChinesePassengerCarSalesDividedByBrandMapper chinesePassengerCarSalesDividedByBrandMapper;
    @Autowired
    private ChinesePassengerCarSalesMapper chinesePassengerCarSalesMapper;
    @Autowired
    private ChinesePassengerCarSalesDividedByFuelMapper chinesePassengerCarSalesDividedByFuelMapper;
    @Autowired
    private ChinesePassengerCarSalesDividedByTypeMapper chinesePassengerCarSalesDividedByTypeMapper;
    @Autowired
    private ChineseDomesticManufacturingPassengerCarSalesMapper chineseDomesticManufacturingPassengerCarSalesMapper;
    @Autowired
    private ChineseDomesticManufacturingPassengerCarSalesDividedByTypeMapper chineseDomesticManufacturingPassengerCarSalesDividedByTypeMapper;

    /**
     * 乘用车分品牌销量
     * @return
     */
    @RequestMapping("/cycxl/cycfppxl")
    public String selectCycfppxl() {

        List<ChinesePassengerCarSalesDividedByBrand> list = chinesePassengerCarSalesDividedByBrandMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/cycxl/cycfcxxl")
    public String selectCycfcxxl() {

        List<ChinesePassengerCarSalesDividedByType> list = chinesePassengerCarSalesDividedByTypeMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/cycxl/cycfxl")
    public String selectCycfxl() {

        List<ChinesePassengerCarSales> list = chinesePassengerCarSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/cycxl/cycfrllxxl")
    public String selectCycfrllxxl() {

        List<ChinesePassengerCarSalesDividedByFuel> list = chinesePassengerCarSalesDividedByFuelMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/cycxl/gnzzcycxl")
    public String selectGnzzcycxl() {

        List<ChineseDomesticManufacturingPassengerCarSales> list = chineseDomesticManufacturingPassengerCarSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/cycxl/gnzzcycfcxxl")
    public String selectGnzzcycfcxxl() {

        List<ChineseDomesticManufacturingPassengerCarSalesDividedByType> list = chineseDomesticManufacturingPassengerCarSalesDividedByTypeMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    //全球汽车销量
    @Autowired
    private GermanCarSalesMapper germanCarSalesMapper;
    @Autowired
    private AmericanCarSalesMapper americanCarSalesMapper;
    @Autowired
    private TheJapaneseCarSalesMapper theJapaneseCarSalesMapper;
    @Autowired
    private TheGlobalPassengerCarSalesMapper theGlobalPassengerCarSalesMapper;
    @Autowired
    private TheGlobalCommercialVehicleSalesMapper theGlobalCommercialVehicleSalesMapper;

    @RequestMapping("/qqqcxl/dgqcxl")
    public String selectdgqcxl() {

        List<GermanCarSales> list = germanCarSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/qqqcxl/mgqcxl")
    public String selectmgqcxl() {

        List<AmericanCarSales> list = americanCarSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/qqqcxl/rbqcxl")
    public String selectrbqcxl() {

        List<TheJapaneseCarSales> list = theJapaneseCarSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/qqqcxl/qqcycxl")
    public String selectqqcycxl() {

        List<TheGlobalPassengerCarSales> list = theGlobalPassengerCarSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/qqqcxl/qqsycxl")
    public String selectqqsycxl() {

        List<TheGlobalCommercialVehicleSales> list = theGlobalCommercialVehicleSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    //中国汽车销量
    @Autowired
    private ChineseCarSalesMapper chineseCarSalesMapper;

    @RequestMapping("/zgqcxl/zgqcxl")
    public String selectzgqcxl() {

        List<ChineseCarSales> list = chineseCarSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    //商用车销量
    @Autowired
    private ChineseDomesticManufacturingCommercialVehicleSalesMapper chineseDomesticManufacturingCommercialVehicleSalesMapper;
    @Autowired
    private ChineseDomesticManufacturingCommercialVehicleSalesByFuelMapper chineseDomesticManufacturingCommercialVehicleSalesByFuelMapper;
    @Autowired
    private ChineseDomesticManufacturingCommercialVehicleSalesByTypeMapper chineseDomesticManufacturingCommercialVehicleSalesByTypeMapper;
    @Autowired
    private ChineseCommercialVehicleSalesMapper chineseCommercialVehicleSalesMapper;
    @Autowired
    private ChineseCommercialVehicleSalesDividedByFuelMapper chineseCommercialVehicleSalesDividedByFuelMapper;
    @Autowired
    private ChineseCommercialVehicleSalesDividedByTypeMapper chineseCommercialVehicleSalesDividedByTypeMapper;

    @RequestMapping("/sycxl/gnzzsycfcxxl")
    public String selectgnzzsycfcxxl() {

        List<ChineseDomesticManufacturingCommercialVehicleSalesByType> list = chineseDomesticManufacturingCommercialVehicleSalesByTypeMapper.getAll();
        return JSONObject.toJSONString(list);
    }


    @RequestMapping("/sycxl/gnzzsycfrllxxl")
    public String selectgnzzsycfrllxxl() {

        List<ChineseDomesticManufacturingCommercialVehicleSalesByFuel> list = chineseDomesticManufacturingCommercialVehicleSalesByFuelMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/sycxl/gnzzsycxl")
    public String selectgnzzsycxl() {

        List<ChineseDomesticManufacturingCommercialVehicleSales> list = chineseDomesticManufacturingCommercialVehicleSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/sycxl/sycfcxxl")
    public String selectsycfcxxl() {

        List<ChineseCommercialVehicleSalesDividedByType> list = chineseCommercialVehicleSalesDividedByTypeMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/sycxl/sycfrllxxl")
    public String selectsycfrllxxl() {

        List<ChineseCommercialVehicleSalesDividedByFuel> list = chineseCommercialVehicleSalesDividedByFuelMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    @RequestMapping("/sycxl/sycxl")
    public String selectsycxl() {

        List<ChineseCommercialVehicleSales> list = chineseCommercialVehicleSalesMapper.getAll();
        return JSONObject.toJSONString(list);
    }
}
