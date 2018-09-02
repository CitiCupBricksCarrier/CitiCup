package com.citicup.controller.dataDisplay;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.dataDisplay.*;
import com.citicup.model.dataDisplay.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/ComparisonOfIndustryHistory")
public class ComparisonOfIndustryHistoryController {

    @Autowired
    private ComparisonOfIndustryHistory_allMapper comparisonOfIndustryHistory_allMapper;
    @Autowired
    private ComparisonOfIndustryHistory_shanghaiAndShenzhenASharesMapper comparisonOfIndustryHistory_shanghaiAndShenzhenASharesMapper;
    @Autowired
    private ComparisonOfIndustryHistory_newThirdBoardMapper comparisonOfIndustryHistory_newThirdBoardMapper;
    @Autowired
    private ComparisonOfIndustryHistory_allASharesMapper comparisonOfIndustryHistory_allASharesMapper;

    @RequestMapping("/ComparisonOfIndustryHistory_all")
    public String selectComparisonOfIndustryHistory_all() {
        List<ComparisonOfIndustryHistory_all> list = comparisonOfIndustryHistory_allMapper.getAll();
        List<JSONObject> json = new ArrayList<>();

        List<String> time = new ArrayList<>();
        List<String> pe = new ArrayList<>();
        List<String> pb = new ArrayList<>();
        List<String> ps = new ArrayList<>();
        List<String> sinquarrevenpro = new ArrayList<>();
        List<String> sinquarnetpro = new ArrayList<>();
        List<String> sinquarnetinrate = new ArrayList<>();
        List<String> sinquarroe = new ArrayList<>();
        List<String> sinquarroa = new ArrayList<>();

        for(ComparisonOfIndustryHistory_all cih : list) {
            time.add(cih.getTime());
            pe.add(cih.getPe());
            pb.add(cih.getPb());
            ps.add(cih.getPs());
            sinquarrevenpro.add(cih.getSinquarrevenpro());
            sinquarnetpro.add(cih.getSinquarnetpro());
            sinquarnetinrate.add(cih.getSinquarnetinrate());
            sinquarroe.add(cih.getSinquarroe());
            sinquarroa.add(cih.getSinquarroa());
        }

        JSONObject timeJson = new JSONObject();
        timeJson.put("time", time);
        JSONObject peJson = new JSONObject();
        peJson.put("pe", pe);
        JSONObject pbJson = new JSONObject();
        pbJson.put("pb", pb);
        JSONObject psJson = new JSONObject();
        psJson.put("ps", ps);
        JSONObject sinquarrevenproJson = new JSONObject();
        sinquarrevenproJson.put("sinquarrevenpro", sinquarrevenpro);
        JSONObject sinquarnetproJson = new JSONObject();
        sinquarnetproJson.put("sinquarnetpro", sinquarnetpro);
        JSONObject sinquarnetinrateJson = new JSONObject();
        sinquarnetinrateJson.put("sinquarnetinrate", sinquarnetinrate);
        JSONObject sinquarroeJson = new JSONObject();
        sinquarroeJson.put("sinquarroe", sinquarroe);
        JSONObject sinquarroaJson = new JSONObject();
        sinquarroaJson.put("sinquarroa", sinquarroa);

        json.add(timeJson);
        json.add(peJson);
        json.add(pbJson);
        json.add(psJson);
        json.add(sinquarrevenproJson);
        json.add(sinquarnetproJson);
        json.add(sinquarnetinrateJson);
        json.add(sinquarroeJson);
        json.add(sinquarroaJson);

        return JSONObject.toJSONString(json);
    }

    @RequestMapping("/ComparisonOfIndustryHistory_shanghaiAndShenzhenAShares")
    public String selectComparisonOfIndustryHistory_shanghaiAndShenzhenAShares() {
        List<ComparisonOfIndustryHistory_shanghaiAndShenzhenAShares> list = comparisonOfIndustryHistory_shanghaiAndShenzhenASharesMapper.getAll();
        List<JSONObject> json = new ArrayList<>();

        List<String> time = new ArrayList<>();
        List<String> pe = new ArrayList<>();
        List<String> pb = new ArrayList<>();
        List<String> ps = new ArrayList<>();
        List<String> sinquarrevenpro = new ArrayList<>();
        List<String> sinquarnetpro = new ArrayList<>();
        List<String> sinquarnetinrate = new ArrayList<>();
        List<String> sinquarroe = new ArrayList<>();
        List<String> sinquarroa = new ArrayList<>();

        for(ComparisonOfIndustryHistory_shanghaiAndShenzhenAShares cih : list) {
            time.add(cih.getTime());
            pe.add(cih.getPe());
            pb.add(cih.getPb());
            ps.add(cih.getPs());
            sinquarrevenpro.add(cih.getSinquarrevenpro());
            sinquarnetpro.add(cih.getSinquarnetpro());
            sinquarnetinrate.add(cih.getSinquarnetinrate());
            sinquarroe.add(cih.getSinquarroe());
            sinquarroa.add(cih.getSinquarroa());
        }

        JSONObject timeJson = new JSONObject();
        timeJson.put("time", time);
        JSONObject peJson = new JSONObject();
        peJson.put("pe", pe);
        JSONObject pbJson = new JSONObject();
        pbJson.put("pb", pb);
        JSONObject psJson = new JSONObject();
        psJson.put("ps", ps);
        JSONObject sinquarrevenproJson = new JSONObject();
        sinquarrevenproJson.put("sinquarrevenpro", sinquarrevenpro);
        JSONObject sinquarnetproJson = new JSONObject();
        sinquarnetproJson.put("sinquarnetpro", sinquarnetpro);
        JSONObject sinquarnetinrateJson = new JSONObject();
        sinquarnetinrateJson.put("sinquarnetinrate", sinquarnetinrate);
        JSONObject sinquarroeJson = new JSONObject();
        sinquarroeJson.put("sinquarroe", sinquarroe);
        JSONObject sinquarroaJson = new JSONObject();
        sinquarroaJson.put("sinquarroa", sinquarroa);

        json.add(timeJson);
        json.add(peJson);
        json.add(pbJson);
        json.add(psJson);
        json.add(sinquarrevenproJson);
        json.add(sinquarnetproJson);
        json.add(sinquarnetinrateJson);
        json.add(sinquarroeJson);
        json.add(sinquarroaJson);

        return JSONObject.toJSONString(json);
    }

    @RequestMapping("/ComparisonOfIndustryHistory_newThirdBoard")
    public String selectComparisonOfIndustryHistory_newThirdBoard() {
        List<ComparisonOfIndustryHistory_newThirdBoard> list = comparisonOfIndustryHistory_newThirdBoardMapper.getAll();
        List<JSONObject> json = new ArrayList<>();

        List<String> time = new ArrayList<>();
        List<String> pe = new ArrayList<>();
        List<String> pb = new ArrayList<>();
        List<String> ps = new ArrayList<>();
        List<String> sinquarrevenpro = new ArrayList<>();
        List<String> sinquarnetpro = new ArrayList<>();
        List<String> sinquarnetinrate = new ArrayList<>();
        List<String> sinquarroe = new ArrayList<>();
        List<String> sinquarroa = new ArrayList<>();

        for(ComparisonOfIndustryHistory_newThirdBoard cih : list) {
            time.add(cih.getTime());
            pe.add(cih.getPe());
            pb.add(cih.getPb());
            ps.add(cih.getPs());
            sinquarrevenpro.add(cih.getSinquarrevenpro());
            sinquarnetpro.add(cih.getSinquarnetpro());
            sinquarnetinrate.add(cih.getSinquarnetinrate());
            sinquarroe.add(cih.getSinquarroe());
            sinquarroa.add(cih.getSinquarroa());
        }

        JSONObject timeJson = new JSONObject();
        timeJson.put("time", time);
        JSONObject peJson = new JSONObject();
        peJson.put("pe", pe);
        JSONObject pbJson = new JSONObject();
        pbJson.put("pb", pb);
        JSONObject psJson = new JSONObject();
        psJson.put("ps", ps);
        JSONObject sinquarrevenproJson = new JSONObject();
        sinquarrevenproJson.put("sinquarrevenpro", sinquarrevenpro);
        JSONObject sinquarnetproJson = new JSONObject();
        sinquarnetproJson.put("sinquarnetpro", sinquarnetpro);
        JSONObject sinquarnetinrateJson = new JSONObject();
        sinquarnetinrateJson.put("sinquarnetinrate", sinquarnetinrate);
        JSONObject sinquarroeJson = new JSONObject();
        sinquarroeJson.put("sinquarroe", sinquarroe);
        JSONObject sinquarroaJson = new JSONObject();
        sinquarroaJson.put("sinquarroa", sinquarroa);

        json.add(timeJson);
        json.add(peJson);
        json.add(pbJson);
        json.add(psJson);
        json.add(sinquarrevenproJson);
        json.add(sinquarnetproJson);
        json.add(sinquarnetinrateJson);
        json.add(sinquarroeJson);
        json.add(sinquarroaJson);

        return JSONObject.toJSONString(json);
    }

    @RequestMapping("/ComparisonOfIndustryHistory_allAShares")
    public String selectComparisonOfIndustryHistory_allAShares() {
        List<ComparisonOfIndustryHistory_allAShares> list = comparisonOfIndustryHistory_allASharesMapper.getAll();
        List<JSONObject> json = new ArrayList<>();
        List<String> time = new ArrayList<>();
        List<String> pe = new ArrayList<>();
        List<String> pb = new ArrayList<>();
        List<String> ps = new ArrayList<>();
        List<String> sinquarrevenpro = new ArrayList<>();
        List<String> sinquarnetpro = new ArrayList<>();
        List<String> sinquarnetinrate = new ArrayList<>();
        List<String> sinquarroe = new ArrayList<>();
        List<String> sinquarroa = new ArrayList<>();

        for(ComparisonOfIndustryHistory_allAShares cih : list) {
            time.add(cih.getTime());
            pe.add(cih.getPe());
            pb.add(cih.getPb());
            ps.add(cih.getPs());
            sinquarrevenpro.add(cih.getSinquarrevenpro());
            sinquarnetpro.add(cih.getSinquarnetpro());
            sinquarnetinrate.add(cih.getSinquarnetinrate());
            sinquarroe.add(cih.getSinquarroe());
            sinquarroa.add(cih.getSinquarroa());
        }

        JSONObject timeJson = new JSONObject();
        timeJson.put("time", time);
        JSONObject peJson = new JSONObject();
        peJson.put("pe", pe);
        JSONObject pbJson = new JSONObject();
        pbJson.put("pb", pb);
        JSONObject psJson = new JSONObject();
        psJson.put("ps", ps);
        JSONObject sinquarrevenproJson = new JSONObject();
        sinquarrevenproJson.put("sinquarrevenpro", sinquarrevenpro);
        JSONObject sinquarnetproJson = new JSONObject();
        sinquarnetproJson.put("sinquarnetpro", sinquarnetpro);
        JSONObject sinquarnetinrateJson = new JSONObject();
        sinquarnetinrateJson.put("sinquarnetinrate", sinquarnetinrate);
        JSONObject sinquarroeJson = new JSONObject();
        sinquarroeJson.put("sinquarroe", sinquarroe);
        JSONObject sinquarroaJson = new JSONObject();
        sinquarroaJson.put("sinquarroa", sinquarroa);

        json.add(timeJson);
        json.add(peJson);
        json.add(pbJson);
        json.add(psJson);
        json.add(sinquarrevenproJson);
        json.add(sinquarnetproJson);
        json.add(sinquarnetinrateJson);
        json.add(sinquarroeJson);
        json.add(sinquarroaJson);

        return JSONObject.toJSONString(json);
    }

}
