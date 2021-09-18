package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class ControllerDemo2 {
    @RequestMapping("/ControllerDemo2")
  public String ControllerDemo2(Model model){
      model.addAttribute("msg","ControllerDemo2");
      return "ControllerDemo2";
  }

}
