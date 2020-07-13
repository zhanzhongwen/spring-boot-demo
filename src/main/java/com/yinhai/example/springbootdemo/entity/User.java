package com.yinhai.example.springbootdemo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
