package com.citicup.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.apache.commons.codec.binary.Base64;

import java.io.IOException;
import java.util.UUID;

public class CitiAPIHelper {

    private static String clinetID = "5aab764c-c8da-46f1-9cf2-1ae1901d1865";
    private static String clinetSecret = "N0tO6bN5xQ4fA7iM6tK5dB1mM0cM7tP2hY3nX7sT6fQ8eB1uT2";
    private static String encode_key = clinetID + ":" + clinetSecret;
    private static String authorization = "Basic " + Base64.encodeBase64String(encode_key.getBytes());

    public static String getUserinfo(String acstoken) throws IOException{
        String authorization = "Bearer " + acstoken;
        System.out.println("authorization:"+authorization);

        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://sandbox.apihub.citi.com/gcb/api/v1/accounts")
                .get()
                .addHeader("accept", "application/json")
                .addHeader("authorization", authorization)
                .addHeader("client_id", clinetID)
                .addHeader("uuid", uuid)
                .addHeader("content-type", "application/x-www-form-urlencoded")
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String getPswdAccessToken(String biztoken, String username, String password) throws IOException{
        String uuid = UUID.randomUUID().toString().replaceAll("-","");

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody requestBody = RequestBody.create(mediaType, "grant_type=password&scope=/api&username="+username+"&password="+password);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://sandbox.apihub.citi.com/gcb/api/password/oauth2/token/au/gcb")
                .post(requestBody)
                .addHeader("accept", "application/json")
                .addHeader("authorization", authorization)
                .addHeader("bizToken", biztoken)
                .addHeader("uuid", uuid)
                .addHeader("content-type", "application/x-www-form-urlencoded")
                .build();

        Response response = client.newCall(request).execute();
        if (response.isSuccessful()){
        }
        String message = response.message();
        String body = response.body().string();
//		System.out.println(body);
        JSONObject json = JSON.parseObject(body);
        return json.getString("access_token");
    }

    public static String getBitToken(String accessToken) throws IOException {

        String authorization = "Bearer " + accessToken;
        System.out.println("authorization:"+authorization);
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://sandbox.apihub.citi.com/gcb/api/security/e2eKey")
                .get()
                .addHeader("accept", "application/json")
                .addHeader("authorization", authorization)
                .addHeader("client_id", clinetID)
                .addHeader("uuid", uuid)
                .addHeader("content-type", "application/x-www-form-urlencoded")
                .build();

        Response response = client.newCall(request).execute();
        String bizToken = response.header("bizToken");
        String eventid = response.header("eventid");

        String body = response.body().string();
        JSONObject bodyJson = JSON.parseObject(body);

        JSONObject json = new JSONObject();
        json.put("bizToken", bizToken);
        json.put("eventid", eventid);
        json.put("modulus", bodyJson.getString("modulus"));
        json.put("exponent", bodyJson.getString("exponent"));

        return json.toJSONString();
    }

    public static String getAccessToken() throws IOException{
        String encode_key = "5aab764c-c8da-46f1-9cf2-1ae1901d1865" + ":" + "N0tO6bN5xQ4fA7iM6tK5dB1mM0cM7tP2hY3nX7sT6fQ8eB1uT2";
        String authorization = "Basic " + Base64.encodeBase64String(encode_key.getBytes());

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody requestBody = RequestBody.create(mediaType, "grant_type=client_credentials&scope=/api");
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://sandbox.apihub.citi.com/gcb/api/clientCredentials/oauth2/token/au/gcb")
                .post(requestBody)
                .addHeader("accept", "application/json")
                .addHeader("authorization", authorization)
                .addHeader("content-type", "application/x-www-form-urlencoded")
                .build();

        Response response = client.newCall(request).execute();
        if (response.isSuccessful()){
        }
        String body = response.body().string();
//		System.out.println(body);
        JSONObject json = JSON.parseObject(body);
        return json.getString("access_token");
    }
}
