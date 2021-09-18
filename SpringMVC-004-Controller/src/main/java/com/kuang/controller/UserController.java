package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    private String user1(@RequestParam("username") String name, Model model){
        //接受前端的数据
        System.out.println("nsg"+name);
//        将返回的结果输出到前端
        model.addAttribute("msg",name);
        return "test";
    }

    @GetMapping("/t2")
    private String user2(User user, Model model){
        //接受前端的数据
        System.out.println("nsg"+user);
//        将返回的结果输出到前端
        model.addAttribute("msg",user);
        return "test";
    }




}
