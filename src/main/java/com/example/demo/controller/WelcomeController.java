package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
    //mapbox地图测试
    @RequestMapping("/mapbox")
    private ModelAndView mapBox(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mapbox/mapbox");
        return modelAndView;
    }
    //mapbox地图测试
    @RequestMapping("/phone")
    private ModelAndView phone(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mapbox/phone");
        return modelAndView;
    }
    //mapbox 多个地图
    @RequestMapping("/map")
    private ModelAndView map(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mapbox/map");
        return modelAndView;
    }
}
