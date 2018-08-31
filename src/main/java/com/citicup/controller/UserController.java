package com.citicup.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.UserMapper;
import com.citicup.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("login")
    public void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        JSONObject json = JSON.parseObject(request.getParameter("data"));
        String retMessage = "";

        User user = userMapper.selectByPrimaryKey(json.getString("username"));

        if (user == null){
            retMessage = "fail";
        }
        else if(!user.getPassword().equals(json.get("password"))){
            retMessage = "fail";
        }
        else{
            try{
                session.removeAttribute("user");//清空session
            }catch(Exception e){
                System.out.println("");
            }
            //session的创建，15分钟
            session.setAttribute("user",json.get("username").toString());
            session.setMaxInactiveInterval(15*60);
            retMessage = "success";
        }

        PrintWriter out = response.getWriter();
        out.print(retMessage);
        out.close();

    }
    @RequestMapping("logout")
    public void logout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        try {
            session.removeAttribute("user");
            PrintWriter out = response.getWriter();
            out.print("success");
            out.close();
        }catch(Exception e){

        }
    }
    @RequestMapping("getSession")
    public void getUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session=request.getSession();
        PrintWriter out=response.getWriter();
        String res=null;
        try {
            res=session.getAttribute("user").toString();
        }catch(Exception e){

        }
        if(res==null){
            out.print("null");
        }else {
            out.print(res);
        }
        out.close();
    }

//    @RequestMapping("getUserDetail")
//    public void getUserType(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        IDService idService=new ID();
//        HttpSession session=request.getSession();
//        String username=session.getAttribute("user").toString();
//        UserInfo userInfo=idService.getUserByName(username);
//        String type=userInfo.getType();
//        String credits=userInfo.getCredits()+"";
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("name",username);
//        jsonObject.put("type",type);
//        jsonObject.put("credit",credits);
//        PrintWriter out=response.getWriter();
//        out.print(jsonObject);
//        out.close();
//    }
//
//    @RequestMapping("getVisitUserDetail")
//    public void getVisitUserDetail(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        IDService idService=new ID();
//        String username = request.getParameter("userName");
//        UserInfo userInfo=idService.getUserByName(username);
//        String type=userInfo.getType();
//        String credits=userInfo.getCredits()+"";
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("name",username);
//        jsonObject.put("type",type);
//        jsonObject.put("credit",credits);
//        PrintWriter out=response.getWriter();
//        out.print(jsonObject);
//        out.close();
//    }
}
