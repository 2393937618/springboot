package com.example.demo.controller;

import com.example.demo.dao.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class registerController {
    @Autowired
    private userRepository userRepository;
    @CrossOrigin
    @PostMapping("/post_register")
    public String post_register(@RequestParam(value = "username")String username,@RequestParam(value = "password")String password,
                             @RequestParam(value = "repassword")String repassword,@RequestParam(value = "work_in")String work_in,
                             @RequestParam(value = "user_position")String user_position,@RequestParam(value = "user_call")String user_call){
        int result = userRepository.insert_teacher(username,password,work_in,user_position,user_call);
        String user_id = userRepository.user_id();
        String result_word = "你的工号为"+user_id+"，请记号以便登录使用";
        if(result == 1) return result_word;
        else return "0";

    }
}
