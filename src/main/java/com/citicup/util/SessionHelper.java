package com.citicup.util;

import javax.servlet.http.HttpSession;

public class SessionHelper {

    public static String getUserFromSession(HttpSession session){
        String username = null;
        if (session == null) return null;
        try {
            username=session.getAttribute("user").toString();
        }catch(Exception e){
            e.printStackTrace();
        }
        return username;
    }
}
