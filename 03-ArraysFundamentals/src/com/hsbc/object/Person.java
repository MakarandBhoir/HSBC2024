package com.hsbc.object;

public class Person {
    private String name;
    private int age;

    public Person(){
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "name = "+name+", age = "+age;
    }
    public boolean equals(Object obj){
        Person person = (Person) obj;
        if(this.name.equals(person.name) && this.age == person.age){
            return true;
        }else{
            return false;
        }
    }
}
