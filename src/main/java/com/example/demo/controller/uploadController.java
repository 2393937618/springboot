package com.example.demo.controller;



import com.example.demo.dao.resultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController
public class uploadController {
    @Autowired
    private resultRepository resultRepository;

    @RequestMapping("/upload_result")
    public int upload_result(@RequestParam(value = "name")String name, @RequestParam(value = "time")String time, @RequestParam(value = "level")String level, @RequestParam(value = "certificate")String certificate, HttpSession session){
        int id = (Integer) session.getAttribute("id");
        int result = resultRepository.insert_result(id, name, time, level, certificate);
        if (result==1){
            return 1;
        }else return 0;
    }
}
