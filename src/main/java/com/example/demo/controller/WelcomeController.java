package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping("/nld")
    private ModelAndView nld(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mapbox/nld");
        return modelAndView;
    }
    //mapbox地图测试
    @RequestMapping("/introduce/{nc}")
    private ModelAndView animal(@PathVariable("nc")String nch){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("introduce/"+nch);
        return modelAndView;
    }
    //mapbox地图测试
    @RequestMapping("/sl")
    private ModelAndView sl(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sl/sl");
        return modelAndView;
    }
    //mapbox地图测试
    @RequestMapping("/esri")
    private ModelAndView esri(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("esri/es");
        return modelAndView;
    }
    //塞尔达地图测试
    @RequestMapping("/zad")
    private ModelAndView zadmap(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("zad/zad");
        return modelAndView;
    }
    //createmap
    @RequestMapping("/createmap")
    private ModelAndView createmap(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mapbox/createmap");
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
    //mapbox 多个地图
    @RequestMapping("/test")
    private ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mapbox/test");
        return modelAndView;
    }
}
