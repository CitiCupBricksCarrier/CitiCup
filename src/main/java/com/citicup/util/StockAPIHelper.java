package com.citicup.util;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StockAPIHelper {
    private static final String sep = System.getProperty("file.separator");

    public JSONObject getNewsProcess(String compName, String stkcd) {
        return null;
    }

    private static String callPyFunc(String year, String season) {
        String path = System.getProperty("user.dir")+sep+"src"+sep+"main"+sep+"java"+sep+"com"+sep+"citicup"+sep+"util"+sep+"StockEPS.py";
        String[] arguments = new String[] {"python", path, year, season};
        String result = "";
        try {
            Process process = Runtime.getRuntime().exec(arguments);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(), "GB2312"));
            String line = "";
            while ((line = in.readLine()) != null) {
                result += (line + "\n");
            }
            in.close();
            int re = process.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
