package com.citicup.util;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

public class NewsAPIHelper {

    private static final String sep = System.getProperty("file.separator");

    public JSONObject getNewsProcess(String compName, String stkcd) {
        List<Double> posList = new ArrayList<>();  //正向指数列表
        String result = "";  //分词

        String data = null;
        try {
            data = getNews(compName, stkcd);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取新闻内容分条
        JSONObject newsJson = JSON.parseObject(data);
        JSONArray jsonArray = (JSONArray)newsJson.get("data");
        List<String> newsList = jsonArray.toJavaList(String.class);

        for (Object news : jsonArray){
            String s = ((JSONObject) news).getString("content");
            ((JSONObject) news).put("content", stripHtml(s));
        }

        //逐条处理
        for(String news: newsList) {
            String afterProcess = getMess(news);
            if(afterProcess != null && afterProcess != "") {
                String[] list = afterProcess.split("##");
                double postive = Double.valueOf(list[1]);
                posList.add(postive);
                result += list[0].replace("[|]", "");
            }
        }

        String[] wordList = result.split(",");  //分词列表

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("wordList", wordList);
        jsonObject.put("posList", posList);
        jsonObject.put("news", newsJson);

        return jsonObject;
    }

    /**
     * 去掉字符串里面的html代码。<br>
     * 要求数据要规范，比如大于小于号要配套,否则会被集体误杀。
     *
     * @param content
     * 内容
     * @return 去掉后的内容
     */
    public static String stripHtml(String content) {
        // <p>段落替换为换行
        content = content.replaceAll("<p .*?>", "\r\n");
        // <br><br/>替换为换行
        content = content.replaceAll("<br\\s*/?>", "\r\n");
        // 去掉其它的<>之间的东西
        content = content.replaceAll("\\<.*?>", "");
        // 还原HTML
        // content = HTMLDecoder.decode(content);
        return content;
    }

    private static String getMess(String news) {
        String title = JSON.parseObject(news).getString("title");
        String content = JSON.parseObject(news).getString("content");
        return callPyFunc(title + content);
    }

    private static String callPyFunc(String news) {
        news = stripHtml(news);
        String path = System.getProperty("user.dir")+sep+"src"+sep+"main"+sep+"java"+sep+"com"+sep+"citicup"+sep+"util"+sep+"NewsProcess.py";
        String[] arguments = new String[] {"python", path, news};
        String result = "";
        try {
            Process process = Runtime.getRuntime().exec(arguments);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(), "GB2312"));
            String line = "";
            while ((line = in.readLine()) != null) {
                result += line;
            }
            in.close();
            int re = process.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取信息列表
     * @param compName 公司名称
     * @param stkcd 公司股票代码
     * @return 相关信息 json格式
     * @throws Exception
     */
    private static String getNews(String compName, String stkcd) throws Exception {
        // 服务路径
        String servicePath = "http://www.digudata.com:8082/data/find";

        //关键字
        String key = "\"" + compName + "\" or \"" + stkcd + "\"";
        String[] timeGap = getTimeGap();
        String token = "b9edb973-c798-4a98-924f-f21c7a05a572";

        // 设置参数
        Map params = new HashMap();
        params.put("token", token);
        params.put("platform", "News");
        params.put("startdate", timeGap[0]);
        params.put("enddate", timeGap[1]);
        params.put("pageno", "1");
        params.put("rows", "100");
        params.put("isDedup", "true");
        params.put("sortType", "0");
        params.put("needSummary", "true");
        params.put("sortOrder", "0");
        params.put("searchTarget", "0");
        params.put("keys", key);

        String content = callServUrl(servicePath, params);
        return content;
    }

    private static String[] getTimeGap() {
        String[] result = new String[2];

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String now = format.format(date);
        result[1] = now;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -15);
        date = calendar.getTime();
        String pass = format.format(date);
        result[0] = pass;

        return result;
    }

    /**
     * 调用指定Http服务
     * @param servUrl 服务Url
     * @param params 参数Map
     * @return
     */
    private static String callServUrl(String servUrl, Map params) throws Exception {
        // 创建URL
        URL url = new URL(servUrl);
        // 创建Http连接对象
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.setUseCaches(false);
        conn.setRequestMethod("POST");
        // 设置Http连接对象的属性
        conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
        conn.setRequestProperty("Connection", "Keep-Alive");
        conn.setRequestProperty("Charset", "UTF-8");
        // 连接
        conn.connect();
        // 传输参数
        DataOutputStream out = new DataOutputStream(conn.getOutputStream());
        String paramStr = "";
        Iterator keyIter = params.keySet().iterator();
        while(keyIter.hasNext()) {
            String key = (String)keyIter.next();
            String value = (String)params.get(key);
            paramStr += key+"="+URLEncoder.encode(value, "UTF-8")+"&";
        }
        if (paramStr.length() > 0) paramStr = paramStr.substring(0, paramStr.length()-1);
        out.writeBytes(paramStr);
        out.flush();
        out.close();

        // 获得响应代码
        int resCode = conn.getResponseCode();
        if (HttpURLConnection.HTTP_OK == resCode) {// 连接成功
            //获取结果
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            //获取返回值
            StringBuffer retBuffer = new StringBuffer();
            String content = null;
            while((content=reader.readLine()) != null) {
                retBuffer.append(content+"\r\n");
            }
            // 返回结果
            return retBuffer.toString();
        }
        System.out.println("连接错误，响应代码为："+resCode);
        return null;
    }
}
