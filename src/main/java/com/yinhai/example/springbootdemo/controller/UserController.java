package com.yinhai.example.springbootdemo.controller;

import com.yinhai.example.springbootdemo.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class UserController {
    List<User> users = new ArrayList<User>(){{
        add(new User("shirely","445320015@qq.com"));
        add(new User("zwzhang","406922382@qq.com"));
    }};
    @RequestMapping("users")
    public List<User> getUser(){
        return users;
    }
}
