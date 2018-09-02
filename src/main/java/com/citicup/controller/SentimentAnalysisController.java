package com.citicup.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.dataDisplay.CompanyBasicInformationMapper;
import com.citicup.util.NewsAPIHelper;
import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class SentimentAnalysisController {

    @Autowired
    private CompanyBasicInformationMapper companyBasicInformationMapper;

    @RequestMapping("/sentimentAnalysis")
    public String sentimentAnalysis(@RequestParam String stkid){
        NewsAPIHelper apiHelper = new NewsAPIHelper();
        String stkName = companyBasicInformationMapper.selectByPrimaryKey(stkid).getCompname();

        JSONObject retJson = apiHelper.getNewsProcess(stkid, stkName);
        JSONArray posList = retJson.getJSONArray("posList");
        JSONArray wordList = retJson.getJSONArray("wordList");


        int posMap[] = new int[5];
        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < posList.size(); i++) {
            Double t = posList.getDouble(i);
            if (t>=0.8) posMap[0] += 1;
            else if (t>=0.6) posMap[1] += 1;
            else if (t>=0.4) posMap[2] += 1;
            else if (t>=0.2) posMap[3] += 1;
            else if (t>=0.0) posMap[4] += 1;
        }

        for (int i = 0; i < wordList.size(); i++) {
            String s = wordList.getString(i);
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
        returnJson.put("sitimentIndex", sitimentIndex);
        returnJson.put("wordCloud", wordCloud);
        returnJson.put("news", retJson.getJSONObject("news"));

        return returnJson.toJSONString();
    }



}
