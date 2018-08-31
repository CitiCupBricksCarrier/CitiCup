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
@RequestMapping("/industryData/capacity")
public class IndustryCapacityController {
    //乘用车
    @Autowired
    private ChineseDomesticManufacturingPassengerCarProductionMapper chineseDomesticManufacturingPassengerCarProductionMapper;
    @Autowired
    private ChineseDomesticManufacturingPassengerCarProductionDividedByTypeMapper chineseDomesticManufacturingPassengerCarProductionDividedByTypeMapper;

    /**
     * 中国国内制造乘用车产量
     * @return
     */
    @RequestMapping("/cyc/zggnzzcyccl")
    public String selectZggnzzcyccl() {
        List<ChineseDomesticManufacturingPassengerCarProduction> list = chineseDomesticManufacturingPassengerCarProductionMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 中国国内制造乘用车分车型产量
     * @return
     */
    @RequestMapping("/cyc/zggnzzcycfcxcl")
    public String selectZggnzzcycfcxcl() {
        List<ChineseDomesticManufacturingPassengerCarProductionDividedByType> list = chineseDomesticManufacturingPassengerCarProductionDividedByTypeMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    //商用车
    @Autowired
    private ChineseDomesticManufacturingProductionMapper chineseDomesticManufacturingProductionMapper;
    @Autowired
    private ChineseDomesticManufacturingProductionDividedByTypeMapper chineseDomesticManufacturingProductionDividedByTypeMapper;

    /**
     * 中国国内制造商用车产量
     * @return
     */
    @RequestMapping("/syc/zggnzzsyccl")
    public String selectZggnzzsyccl() {
        List<ChineseDomesticManufacturingProduction> list = chineseDomesticManufacturingProductionMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 中国国内制造商用车分车型产量
     * @return
     */
    @RequestMapping("/cyc/zggnzzsycfcxcl")
    public String selectZggnzzsycfcxcl() {
        List<ChineseDomesticManufacturingProductionDividedByType> list = chineseDomesticManufacturingProductionDividedByTypeMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    //新增产能
    @Autowired
    private ChineseAutoIndustryNewCapacityMapper chineseAutoIndustryNewCapacityMapper;
    /**
     * 中国汽车产业新增产能
     * @return
     */
    @RequestMapping("/xzcn/zgqccyxzcn")
    public String selectZgqccyxzcn() {
        List<ChineseAutoIndustryNewCapacity> list = chineseAutoIndustryNewCapacityMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    //中国汽车产量
    @Autowired
    private ChineseAutoProductionMapper chineseAutoProductionMapper;
    @Autowired
    private ChineseMajorAutomobileGroupProductionMapper chineseMajorAutomobileGroupProductionMapper;
    @Autowired
    private ChineseMajorAutomobileGroupBasicPassengerVehiclesProductionMapper chineseMajorAutomobileGroupBasicPassengerVehiclesProductionMapper;

    /**
     * 中国汽车产量
     * @return
     */
    @RequestMapping("/zgqccl/zgqccl")
    public String selectZgqccl() {
        List<ChineseAutoProduction> list = chineseAutoProductionMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 中国主要汽车集团产量
     * @return
     */
    @RequestMapping("/zgqccl/zgzyqcjtcl")
    public String selectZgzyqcjtcl() {
        List<ChineseMajorAutomobileGroupProduction> list = chineseMajorAutomobileGroupProductionMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    /**
     * 中国主要汽车集团基本型乘用车(轿车)产量
     * @return
     */
    @RequestMapping("/zgqccl/zgzyqcjtjbxcyccl")
    public String selectZgzyqcjtjbxcyccl() {
        List<ChineseMajorAutomobileGroupBasicPassengerVehiclesProduction> list = chineseMajorAutomobileGroupBasicPassengerVehiclesProductionMapper.getAll();
        return JSONObject.toJSONString(list);
    }

}
