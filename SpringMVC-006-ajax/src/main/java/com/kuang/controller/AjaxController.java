package com.kuang.controller;

import com.kuang.pojo.user;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "test";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if ("admin".equals(name)){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public ArrayList<user> a2(){
        ArrayList<user> arrayList = new ArrayList<>();
        arrayList.add(new user("Dealyz",1,"男"));
        arrayList.add(new user("Dealyz2",2,"男"));
        arrayList.add(new user("Dealyz3",3,"女"));
        return arrayList;
    }
    @RequestMapping("/a3")
    public String a3(String name ,String pwd){
        String msg="";

        if (name != null) {
//            admin 本应该是数据 库中查找
            if ("admin".equals(name)) {
                msg = "ok";
            } else {
                msg = "user error";
            }
        }

        if (pwd != null) {
//            admin 本应该是数据 库中查找
            if ("123456".equals(pwd)) {
                msg = "ok";
            } else {
                msg = "pwd error";
            }
        }
        return msg;
    }
}
