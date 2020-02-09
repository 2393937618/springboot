package com.example.demo.controller;

import com.example.demo.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
public class mainController {
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

    @RequestMapping(value = "/result_count")
    public List<Integer> result_count(HttpSession session){
        int id = (Integer) session.getAttribute("id");
        System.out.println(id);
        int a = resultRepository.result_count(id);
        int b = bookRepository.book_count(id);
        int c = paperRepository.paper_count(id);
        int d = patentRepository.patent_count(id);
        int e = projectRepository.project_count(id);
        List<Integer> l = new ArrayList();
        l.add(c);
        l.add(b);
        l.add(e);
        l.add(d);
        l.add(a);


        return l;
    }


}
