package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(HttpSession session,String username,String password){
        session.setAttribute("userLoginInfo",username);
        /*session.setAttribute("passwordLoginInfo",password);*/
        return  "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session){
        session.invalidate();
        return "login";
    }
}
