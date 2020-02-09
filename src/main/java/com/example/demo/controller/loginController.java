package com.example.demo.controller;

import com.example.demo.dao.userRepository;
import com.example.demo.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@RestController
public class loginController {

    @Autowired
    private userRepository userRepository;
    @CrossOrigin
    @PostMapping("/check_password")
    //接收数据
    public int find_id(@RequestParam(value = "id") Integer id, @RequestParam(value = "password")String password, HttpSession session){
//        List<user> show_teacher = userRepository.findAll();
//        model.addAttribute("show_teacher",show_teacher);

        session.setAttribute("id",id);

        int root_id = userRepository.root_id(id);
        if(root_id==1){
            return 2;
        }
        else {

            //finById方法相当于where id=？通过id获取password
            Optional<user> optionalUser = userRepository.findById(id);
            user user = new user();
            //get方法获取数据库提取到的user对象
            user = optionalUser.get();
            String return_password =user.getPassword();
            //比较接收到的password和数据库的password返回数值给index
            if(return_password.equals(password)) return 1;
            else return 0;

        }


    }

}
