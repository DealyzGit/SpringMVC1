package com.kuang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@GetMapping("/test1")
    public String test(){
        System.out.println("TestController===>执行了");
        return "ok";
    }
}
