package com.hsbc.service;

public class ProjectService {
    public int sum(int num1, int num2){
        if(num1 < 0 || num2 < 0){
            throw new IllegalArgumentException("Numbers can not be negative.");
        }
        return num1 + num2;
    }
    public int sum(int num){
        if(num < 0){
            throw new IllegalArgumentException("Number can't be negative.");
        }
        return num * (num + 1) / 2;
    }
}
