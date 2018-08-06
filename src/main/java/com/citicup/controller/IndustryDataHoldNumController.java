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
@RequestMapping("/industryData/holdNum")
public class IndustryDataHoldNumController {

    //汽车保有量
    @Autowired
    private ChineseCarOwnershipMapper ChineseCarOwnershipMapper;
    @Autowired
    private ChineseCarOwnershipPerOneThousandPeople chineseCarOwnershipPerOneThousandPeople;

    /**
     * 中国汽车保有量
     * @return
     */
    @RequestMapping("/qcbyl/zgqcbyl")
    public String selectZgqcbyl() {
        List<ChineseCarOwnership> list = ChineseCarOwnershipMapper.getAll();
        return JSONObject.toJSONString(list);
    }
    /**
     * 中国汽车每千人保有量
     * @return
     */
    @RequestMapping("/qcbyl/zgqcmqrbyl")
    public String selectZgqcmqrbyl() {
        List<ChineseCarOwnership> list = ChineseCarOwnershipMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    //汽车注册
    @Autowired
    private ChineseNewRegisteredCivilCarsMapper chineseNewRegisteredCivilCarsMapper;

    /**
     * 中国新注册民用汽车数量
     * @return
     */
    @RequestMapping("/qczc/zgxzcmyqcsl")
    public String selectZgxzcmyqcsl() {
        List<ChineseNewRegisteredCivilCars> list = chineseNewRegisteredCivilCarsMapper.getAll();
        return JSONObject.toJSONString(list);
    }

    // 全球汽车保有量
    @Autowired
    private TheGlobalCarOwnershipMapper theGlobalCarOwnershipMapper;
    @Autowired
    private TheGlobalCarOwnershipPerOneThousandPeopleMapper theGlobalCarOwnershipPerOneThousandPeopleMapper;

    /**
     * 全球汽车保有量
     * @return
     */
    @RequestMapping("/qqqcbyl/qqqcbyl")
    public String selectQqqcbyl() {
        List<TheGlobalCarOwnership> list = theGlobalCarOwnershipMapper.getAll();
        return JSONObject.toJSONString(list);
    }
    /**
     * 全球每千人汽车保有量
     * @return
     */
    @RequestMapping("/qqqcbyl/qqmqrqcbyl")
    public String selectQqmqrqcbyl() {
        List<TheGlobalCarOwnershipPerOneThousandPeople> list = theGlobalCarOwnershipPerOneThousandPeopleMapper.getAll();
        return JSONObject.toJSONString(list);
    }

}
