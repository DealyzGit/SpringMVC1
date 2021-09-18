package com.kuang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        if (request.getRequestURI().contains("login")||request.getRequestURI().contains("goLogin")){
            return true;
        }
        if (session.getAttribute("userLoginInfo")!=null && session.getAttribute("passwordLoginInfo")!=null){
            return true;
        }

//        重定向
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
