package com.hsbc.oop10;

public record PersonRecord(String name, int age) {

    public PersonRecord(String name, int age){
        this.name = name;
        this.age = age;
    }

}
