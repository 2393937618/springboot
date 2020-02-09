package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class intentController {
    @RequestMapping(value = "/login")
    public String login(){
        return "index";
    }
    @RequestMapping(value = "/register")
    public String register(){
        return "register";
    }
//    @RequestMapping(value = "/tables")
//    public String tables(){
//        return "tables";
//    }
@RequestMapping(value = "/forms")
public String forms(){
    return "forms";
}
    @RequestMapping(value = "/main")
    public String main(){
        return "main";
    }
    @RequestMapping(value = "/upload")
    public String upload(){
        return "upload";
    }

    @RequestMapping(value = "/404")
    public String ad(){
        return "404";
    }

    @RequestMapping(value = "/main2")
    public String main2(){
        return "main2";
    }
}
