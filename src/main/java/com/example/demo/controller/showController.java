package com.example.demo.controller;

import com.example.demo.dao.*;
import com.example.demo.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class showController {
    @Autowired
    private resultRepository resultRepository;
    @Autowired
    private bookRepository bookRepository;
    @Autowired
    private paperRepository paperRepository;
    @Autowired
    private patentRepository patentRepository;
    @Autowired
    private projectRepository projectRepository;
    @RequestMapping(value = "/show")
    public  String show_result(Model model, HttpSession session){
        //实现接口获取数据库内的test表的数据
        int id = (Integer) session.getAttribute("id");
        List<result> show_result = resultRepository.show_result(id);

        List<book> show_book = bookRepository.show_book(id);

        List<paper> show_paper = paperRepository.show_paper(id);

        List<patent> show_patent = patentRepository.show_patent(id);

        List<project> show_project = projectRepository.show_project(id);
        model.addAttribute("show_result",show_result);
        model.addAttribute("show_book",show_book);
        model.addAttribute("show_paper",show_paper);
        model.addAttribute("show_patent",show_patent);
        model.addAttribute("show_project",show_project);
        return "show";

    }
}
