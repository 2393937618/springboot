package com.example.demo.controller;

import com.example.demo.dao.userRepository;
import com.example.demo.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class updateController {
    @Autowired
    private userRepository userRepository;
    @RequestMapping("/send_teacher_id")
    public List<user> send_teacher_id(@RequestParam(value = "id")String id){
        List<user> list = userRepository.send_teacher_message(id);
        return list;
    }
    @RequestMapping("/update_teacher")
    public int update_teacher(@RequestParam(value = "id")int id,@RequestParam(value = "username")String username,
                              @RequestParam(value = "password")String password, @RequestParam(value = "work_in")String work_in,
                              @RequestParam(value = "user_position")String user_position,@RequestParam(value = "user_call")String user_call){

        int update = userRepository.update_teacher(id,username,password,work_in,user_position,user_call);
        if(update == 1) return 1;
        else return 0;

    }
}
