package com.citicup.controller;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.*;
import com.citicup.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@EnableAutoConfiguration
@RequestMapping("/similarRecommandation")
public class SimilarRecommendationController {

    @Autowired
    private BookValueMapper bookValueMapper;

    @Autowired
    private CirculationMarketValueAndTotalMarketValueMapper CirculationMarketValueAndTotalMarketValueMapper;

    @Autowired
    private CompanySizeRankMapper companySizeRankMapper;

    @Autowired
    private TotalAssetsMapper totalAssetsMapper;

    @Autowired
    private CompanyBasicInformationMapper companyBasicInformationMapper;

    /**
     * 得到该公司所在行业其他相似公司（至多4个）
     * @param stkid 股票id
     * @return { campany : stkid,
     *          categories : [行业1, 行业2, ...],
     *          行业1 : [],
     *          行业2 ：[],
     *          ...
     *          }
     */
    @RequestMapping("")
    public String getSimilarCompany(@RequestParam String stkid) {
        List<String> categories = companySizeRankMapper.getAllCategory(stkid);
        Map<String, Double> table = new HashMap<>();
        double[] stkFourVal = getFourVal(stkid);
        JSONObject json = new JSONObject();

        json.put("company", companyBasicInformationMapper.selectByPrimaryKey(stkid));
        json.put("categories", categories);
        if(categories == null || categories.isEmpty()) return "";

        //找到每个行业最相似的4个
        for (String category : categories){
            List<String> peerStocks = companySizeRankMapper.getAllStkcd(category);
            TreeMap<String, Double> map = new TreeMap<>();
            for (String stock : peerStocks){
                if (table.containsKey(stock)){
                    map.put(stock, table.get(stock));
                }
                else{
                    double[] tStkFourVal = getFourVal(stock);
                    double similarity = countSimilarity(stkFourVal, tStkFourVal);
                    map.put(stock, similarity);
                    table.put(stock, similarity);
                }
            }

            //降序比较器
            Comparator<Map.Entry<String, Double>> valueComparator = new Comparator<Map.Entry<String, Double>>() {
                @Override
                public int compare(Map.Entry<String, Double> o1,
                                   Map.Entry<String, Double> o2) {
                    return (int) (o2.getValue()-o1.getValue());
                }
            };
            List<Map.Entry<String, Double>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list,valueComparator);

            List<CompanyBasicInformationWithBLOBs> resStocks = list
                    .stream()
                    .map(entry -> companyBasicInformationMapper.selectByPrimaryKey(entry.getKey()))
                    .limit(4)
                    .collect(Collectors.toList());

            json.put(category, resStocks);
        }

        return json.toJSONString();
    }

    //相似度计算
    private double countSimilarity(double[] m1, double[] m2){

        double c1 = 0, c2 = 0, c3 = 0;
        for (int i=0; i<m1.length; i++){
            c1 += m1[i]*m2[i];
            c2 += m1[i]*m1[i];
            c3 += m2[i]*m2[i];
        }

        if (Math.sqrt(c2)*Math.sqrt(c3)==0) return 0;
        return  c1 / (Math.sqrt(c2)*Math.sqrt(c3));
    }

    //得到股票排序需要的4维数据
    private double[] getFourVal(String stkid){
        double[] res = new double[4];

        try{
            //当前股票4项属性
            double totalAssets = Double.parseDouble(totalAssetsMapper.selectByPrimaryKey(new TotalAssetsKey(stkid, "2017")).getTotalassets());
            CirculationMarketValueAndTotalMarketValue val = CirculationMarketValueAndTotalMarketValueMapper.selectByPrimaryKey(new CirculationMarketValueAndTotalMarketValueKey(stkid, "2017"));
            double circulationMarketValue = Double.parseDouble(val.getCirculationmarketvalue());
            double totalMarketValue = Double.parseDouble(val.getTotalmarketvalue());
            double bookValue = Double.parseDouble(bookValueMapper.selectByPrimaryKey(new BookValueKey(stkid, "12/31/17")).getBookvalue());

            res[0] = totalAssets;
            res[1] = circulationMarketValue;
            res[2] = totalMarketValue;
            res[3] = bookValue;
        }catch (Exception e){
            e.printStackTrace();
        }

        return res;
    }
}
