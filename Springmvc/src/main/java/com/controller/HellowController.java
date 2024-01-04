package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellowController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
//        ModelAndView modelAndView=new ModelAndView("hello");
       return "test:1234";
    }
}
