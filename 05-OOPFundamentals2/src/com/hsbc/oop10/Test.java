package com.hsbc.oop10;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Pallav", 20);
        System.out.println("Name = "+person.getName());

        PersonRecord person2 = new PersonRecord("Shraddha", 20);
        System.out.println("Name = "+person2.name());

    }
}
