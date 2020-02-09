package com.example.demo.controller;

import com.example.demo.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class main2Controller {
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

    @RequestMapping(value = "/result_count2")
    public List<Integer> result_count(){
        int a = resultRepository.result_count2();
        int b = bookRepository.book_count2();
        int c = paperRepository.paper_count2();
        int d = patentRepository.patent_count2();
        int e = projectRepository.project_count2();
        List<Integer> l = new ArrayList();
        l.add(c);
        l.add(b);
        l.add(e);
        l.add(d);
        l.add(a);

        return l;
    }


}
