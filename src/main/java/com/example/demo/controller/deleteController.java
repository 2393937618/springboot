package com.example.demo.controller;

import com.example.demo.dao.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class deleteController {

    @Autowired
    private userRepository userRepository;
    int id =0;

    @RequestMapping(value = "/send_id_delete")
    public void teacher_id(@RequestParam(value = "mid")int mid){
        id = mid;
    }
    @RequestMapping(value = "/teacher_delete")
    public int teacher_delete(){
        int a = userRepository.teacher_delete(id);
        if(a == 1) return 1;
        else return 0;
    }

}
