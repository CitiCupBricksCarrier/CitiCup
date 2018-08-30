package com.citicup.util;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NewsAPIHelper {

    /**
     * 获取信息列表
     * @param compName 公司名称
     * @param stkcd 公司股票代码
     * @return 相关信息 json格式
     * @throws Exception
     */
    public String getNews(String compName, String stkcd) throws Exception {
        // 服务路径
        String servicePath = "http://www.digudata.com:8082/data/find";

        //关键字
//        String compName = "中国南玻集团股份有限公司";
//        String stkcd = "000012";
        String key = "\"" + compName + "\" or \"" + stkcd + "\"";

        // 设置参数
        Map params = new HashMap();
        params.put("token", "");
        params.put("platform", "News");
        params.put("startdate", "20170103");
        params.put("enddate", "20170203");
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
