package com.hsbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "greeting")
public class GreetingContoller {
    // http://localhost:9091/greeting/greet

    @GetMapping(path = "greet")
    public String greet(){
        return "Welcome To Rest Api!";
    }

    @GetMapping(path = "users")
    public List<User> getAllUser(){
        List<User> list = new ArrayList<>();
        list.add(new User("Makarand"));
        list.add(new User("Shraddha"));
        list.add(new User("Meghana"));
        return  list;
    }
    @GetMapping(path = "user")
    public User getUser(){
        return new User("Makarand");
    }
}
