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
@RequestMapping("/ContrastOfMarketPerformance")
public class ContrastOfMarketPerformanceController {

    @Autowired
    private ContrastOfMarketPerformance_allMapper contrastOfMarketPerformance_allMapper;
    @Autowired
    private ContrastOfMarketPerformance_newThirdBoardMapper contrastOfMarketPerformance_newThirdBoardMapper;
    @Autowired
    private ContrastOfMarketPerformance_shanghaiAndShenzhenASharesMapper contrastOfMarketPerformance_shanghaiAndShenzhenASharesMapper;

    @RequestMapping("/ContrastOfMarketPerformance_all")
    public String selectContrastOfMarketPerformance_all() {
        List<ContrastOfMarketPerformance_all> list = contrastOfMarketPerformance_allMapper.getAll();
        List<JSONObject> json = new ArrayList<>();

        List<String> indstnam = new ArrayList<>();
        List<String> nearawkrisefal = new ArrayList<>();
        List<String> nearamthrisefal = new ArrayList<>();
        List<String> nearthrmthrisefal = new ArrayList<>();
        List<String> ydtrisefal = new ArrayList<>();
        List<String> nearayearrisefal = new ArrayList<>();

        for(ContrastOfMarketPerformance_all cmp : list) {
            indstnam.add(cmp.getIndstnam());
            nearawkrisefal.add(cmp.getNearawkrisefal());
            nearamthrisefal.add(cmp.getNearamthrisefal());
            nearthrmthrisefal.add(cmp.getNearthrmthrisefal());
            ydtrisefal.add(cmp.getYdtrisefal());
            nearayearrisefal.add(cmp.getNearayearrisefal());
        }

        JSONObject indstnamJson = new JSONObject();
        indstnamJson.put("indstnam", indstnam);
        JSONObject nearawkrisefalJson = new JSONObject();
        nearawkrisefalJson.put("nearawkrisefal", nearawkrisefal);
        JSONObject nearamthrisefalJson = new JSONObject();
        nearamthrisefalJson.put("nearamthrisefal", nearamthrisefal);
        JSONObject nearthrmthrisefalJson = new JSONObject();
        nearthrmthrisefalJson.put("nearthrmthrisefal", nearthrmthrisefal);
        JSONObject ydtrisefalJson = new JSONObject();
        ydtrisefalJson.put("ydtrisefal", ydtrisefal);
        JSONObject nearayearrisefalJson = new JSONObject();
        nearayearrisefalJson.put("nearayearrisefal", nearayearrisefal);

        json.add(indstnamJson);
        json.add(nearawkrisefalJson);
        json.add(nearamthrisefalJson);
        json.add(nearthrmthrisefalJson);
        json.add(ydtrisefalJson);
        json.add(nearayearrisefalJson);

        return JSONObject.toJSONString(json);
    }

    @RequestMapping("/ContrastOfMarketPerformance_newThirdBoard")
    public String selectContrastOfMarketPerformance_newThirdBoard() {
        List<ContrastOfMarketPerformance_newThirdBoard> list = contrastOfMarketPerformance_newThirdBoardMapper.getAll();
        List<JSONObject> json = new ArrayList<>();

        List<String> indstnam = new ArrayList<>();
        List<String> nearawkrisefal = new ArrayList<>();
        List<String> nearamthrisefal = new ArrayList<>();
        List<String> nearthrmthrisefal = new ArrayList<>();
        List<String> ydtrisefal = new ArrayList<>();
        List<String> nearayearrisefal = new ArrayList<>();

        for(ContrastOfMarketPerformance_newThirdBoard cmp : list) {
            indstnam.add(cmp.getIndstnam());
            nearawkrisefal.add(cmp.getNearawkrisefal());
            nearamthrisefal.add(cmp.getNearamthrisefal());
            nearthrmthrisefal.add(cmp.getNearthrmthrisefal());
            ydtrisefal.add(cmp.getYdtrisefal());
            nearayearrisefal.add(cmp.getNearayearrisefal());
        }

        JSONObject indstnamJson = new JSONObject();
        indstnamJson.put("indstnam", indstnam);
        JSONObject nearawkrisefalJson = new JSONObject();
        nearawkrisefalJson.put("nearawkrisefal", nearawkrisefal);
        JSONObject nearamthrisefalJson = new JSONObject();
        nearamthrisefalJson.put("nearamthrisefal", nearamthrisefal);
        JSONObject nearthrmthrisefalJson = new JSONObject();
        nearthrmthrisefalJson.put("nearthrmthrisefal", nearthrmthrisefal);
        JSONObject ydtrisefalJson = new JSONObject();
        ydtrisefalJson.put("ydtrisefal", ydtrisefal);
        JSONObject nearayearrisefalJson = new JSONObject();
        nearayearrisefalJson.put("nearayearrisefal", nearayearrisefal);

        json.add(indstnamJson);
        json.add(nearawkrisefalJson);
        json.add(nearamthrisefalJson);
        json.add(nearthrmthrisefalJson);
        json.add(ydtrisefalJson);
        json.add(nearayearrisefalJson);

        return JSONObject.toJSONString(json);
    }

    @RequestMapping("/ContrastOfMarketPerformance_shanghaiAndShenzhenAShares")
    public String selectContrastOfMarketPerformance_shanghaiAndShenzhenAShares() {
        List<ContrastOfMarketPerformance_shanghaiAndShenzhenAShares> list = contrastOfMarketPerformance_shanghaiAndShenzhenASharesMapper.getAll();
        List<JSONObject> json = new ArrayList<>();

        List<String> indstnam = new ArrayList<>();
        List<String> nearawkrisefal = new ArrayList<>();
        List<String> nearamthrisefal = new ArrayList<>();
        List<String> nearthrmthrisefal = new ArrayList<>();
        List<String> ydtrisefal = new ArrayList<>();
        List<String> nearayearrisefal = new ArrayList<>();

        for(ContrastOfMarketPerformance_shanghaiAndShenzhenAShares cmp : list) {
            indstnam.add(cmp.getIndstnam());
            nearawkrisefal.add(cmp.getNearawkrisefal());
            nearamthrisefal.add(cmp.getNearamthrisefal());
            nearthrmthrisefal.add(cmp.getNearthrmthrisefal());
            ydtrisefal.add(cmp.getYdtrisefal());
            nearayearrisefal.add(cmp.getNearayearrisefal());
        }

        JSONObject indstnamJson = new JSONObject();
        indstnamJson.put("indstnam", indstnam);
        JSONObject nearawkrisefalJson = new JSONObject();
        nearawkrisefalJson.put("nearawkrisefal", nearawkrisefal);
        JSONObject nearamthrisefalJson = new JSONObject();
        nearamthrisefalJson.put("nearamthrisefal", nearamthrisefal);
        JSONObject nearthrmthrisefalJson = new JSONObject();
        nearthrmthrisefalJson.put("nearthrmthrisefal", nearthrmthrisefal);
        JSONObject ydtrisefalJson = new JSONObject();
        ydtrisefalJson.put("ydtrisefal", ydtrisefal);
        JSONObject nearayearrisefalJson = new JSONObject();
        nearayearrisefalJson.put("nearayearrisefal", nearayearrisefal);

        json.add(indstnamJson);
        json.add(nearawkrisefalJson);
        json.add(nearamthrisefalJson);
        json.add(nearthrmthrisefalJson);
        json.add(ydtrisefalJson);
        json.add(nearayearrisefalJson);

        return JSONObject.toJSONString(json);
    }

}
