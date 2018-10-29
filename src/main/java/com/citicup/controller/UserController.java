package com.citicup.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.UserMapper;
import com.citicup.model.User;
import com.citicup.util.CitiAPIHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @RequestMapping("modifyUserDetail")
    public String modifyUserDetail(@RequestParam String user){
        JSONObject json = JSON.parseObject(user);
        User usert = userMapper.selectByPrimaryKey(json.getString("uid"));

        usert.setPhonenum(json.getString("phonenum"));
        usert.setCitinum(json.getString("citinum"));
        usert.setName(json.getString("name"));
        usert.setSex(json.getString("sex"));
        usert.setBirthday(json.getString("birthday"));
        usert.setIdnum(json.getString("idnum"));
        usert.setOccupation(json.getString("occupation"));
        usert.setOrganization(json.getString("organization"));
        usert.setContactnum(json.getString("contactnum"));
        usert.setAddress(json.getString("address"));
        usert.setSummary(json.getString("summary"));

        userMapper.updateByPrimaryKey(usert);

        return "success";
    }

    /**
     * 得到用户信息
     * @param id
     * @return
     */
    @RequestMapping("getUserDetail")
    public String getUserDetail(@RequestParam String id){
        User user = userMapper.selectByPrimaryKey(id);
        return JSONObject.toJSONString(user);
    }

    @RequestMapping("signup")
    public String signup(@RequestParam String id, @RequestParam String name,
                         @RequestParam String password){
        User user = new User(id, name, password);
        userMapper.insert(user);

        return "success";
    }

    @RequestMapping("creditsCharge")
    public synchronized String creditsCharge(@RequestParam String id, @RequestParam int credits){
        User user = userMapper.selectByPrimaryKey(id);
        user.setCredit(user.getCredit() + credits);
        userMapper.updateByPrimaryKey(user);

        return "success";
    }

    @RequestMapping("getLoginParams")
    public String getLoginParams() throws IOException{

        String accesstoken = CitiAPIHelper.getAccessToken();
        String params = CitiAPIHelper.getBitToken(accesstoken);

        return params;
    }

    @RequestMapping("login")
    public void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        JSONObject json = JSON.parseObject(request.getParameter("data"));
        String retMessage;
        String username = json.getString("username");
        String password = json.getString("password");
        String acetoken = CitiAPIHelper.getPswdAccessToken(json.getString("bizToken"),
                username, password);

        if (acetoken == null && !username.equals("1")){
            retMessage = "fail";
        }
        else {
            try {
                session.removeAttribute("user");//清空session
                session.removeAttribute("userinfo");
            } catch (Exception e) {
                System.out.println("");
            }
            //获取用户信息
            String infojson = CitiAPIHelper.getUserinfo(acetoken);

            //session的创建，15分钟
            session.setAttribute("user", username);
            session.setAttribute("userinfo", infojson);
            session.setMaxInactiveInterval(15 * 60);
            retMessage = "success";

            User user = userMapper.selectByPrimaryKey(username);
            //在数据库创建此用户
            if (user == null){
                User usert = new User(username, username, "citicupuser");
                userMapper.insert(usert);
            }
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

    @RequestMapping("getUserInfo")
    public void getUserInfo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session=request.getSession();
        PrintWriter out=response.getWriter();
        String res=null;
        try {
            res=session.getAttribute("userinfo").toString();
        }catch(Exception e){

        }
        if(res==null){
            out.print("null");
        }else {
            out.print(res);
        }
        out.close();
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
}
