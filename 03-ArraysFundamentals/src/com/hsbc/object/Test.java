package com.hsbc.object;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Harsh", 19);
        Person p2 = new Person("harsh", 19);

        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println(p1.equals(p2));
    }
}
