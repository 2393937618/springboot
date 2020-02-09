package com.example.demo.controller;

import com.example.demo.dao.paperRepository;
import com.example.demo.dao.resultRepository;
import com.example.demo.entity.paper;
import com.example.demo.entity.result;
import com.example.demo.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class show2Controller {
    @Autowired
    private resultRepository resultRepository;
    @Autowired
    private paperRepository paperRepository;
    String mid = null;
    @RequestMapping(value = "/send_search_id")
    public void send_search_id(@RequestParam(value = "id")String id){
        mid = id;
    }
    @RequestMapping(value = "/show2")
    public  String show_result(Model model){
        //实现接口获取数据库内的test表的数据

        if(mid!=null){
            int id = Integer.parseInt(mid);
            List<result> show_result = resultRepository.show_result(id);
            model.addAttribute("show_result2",show_result);

            List<paper> show_paper = paperRepository.show_paper(id);
            model.addAttribute("show_paper",show_paper);
        }
        else {
            List<result> show_result = resultRepository.findAll();
            model.addAttribute("show_result2", show_result);

            List<paper> show_paper = paperRepository.findAll();
            model.addAttribute("show_paper", show_paper);
        }

        return "show2";
    }

}
