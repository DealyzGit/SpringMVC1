package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResFulController {
//    http://localhost:8080/SpringMVC_004_Controller/add?a=1&b=2
    @RequestMapping("/add")
    public String test(int a, int b , Model model){
        int res=a+b;
        model.addAttribute("msg","result:"+res);
        return "test";
    }
//    http://localhost:8080/SpringMVC_004_Controller/add/2/15
    @RequestMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b,Model model){
        int res=a+b;
        model.addAttribute("msg","result:"+res);
        return "test";
    }
}
