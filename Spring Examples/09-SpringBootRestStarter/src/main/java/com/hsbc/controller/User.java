package com.hsbc.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class User {
    String username;

    public String getUsername() {
        return username;
    }

    public User(String username){
        this.username = username;
    }
}
