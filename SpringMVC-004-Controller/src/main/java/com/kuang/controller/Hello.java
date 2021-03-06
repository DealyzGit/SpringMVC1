package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
    @RequestMapping("/haa")
    public String Haaaa(Model model){
        String name="**Model（模型）：**数据模型，提供要展示的数据，因此包含数据和行为，可以认为是领域模型或JavaBean组件（包含数据和行为），不过现在一般都分离开来：Value Object（数据Dao） 和 服务层（行为Service）。也就是模型提供了模型数据查询和模型数据的状态更新等功能，包括数据和业务。\n" +
                "\n" +
                "**View（视图）：**负责进行模型的展示，一般就是我们见到的用户界面，客户想看到的东西。\n" +
                "\n" +
                "**Controller（控制器）：**接收用户请求，委托给模型进行处理（状态改变），处理完毕后把返回的模型数据返回给视图，由视图负责展示。也就是说控制器做了个调度员的工作。\n" +
                "\n" +
                "**最典型的MVC就是JSP + servlet + javabean的模式";
        model.addAttribute("msg" ,name);
        return "hhh";
    }
}
