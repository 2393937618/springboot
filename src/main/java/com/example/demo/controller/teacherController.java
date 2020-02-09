package com.example.demo.controller;

import com.example.demo.dao.userRepository;
import com.example.demo.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//对应页面tables.html
@Controller
public class teacherController {
    @Autowired
    private userRepository userRepository;
    @RequestMapping("/tables")
    public  String show(Model model){
        //实现接口获取数据库内的test表的数据
        List<user> show_teacher = userRepository.findAll();
        model.addAttribute("show_teacher",show_teacher);
        return "tables";

    }


}
