package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user {
    @Id
    @GeneratedValue
    public Integer id;
    public String username;
    public String password;
    public String work_in;
    public String user_position;
    public String user_call;
    public Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWork_in() {
        return work_in;
    }

    public void setWork_in(String work_in) {
        this.work_in = work_in;
    }

    public String getUser_position() {
        return user_position;
    }

    public void setUser_position(String user_position) {
        this.user_position = user_position;
    }

    public String getUser_call() {
        return user_call;
    }

    public void setUser_call(String user_call) {
        this.user_call = user_call;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}