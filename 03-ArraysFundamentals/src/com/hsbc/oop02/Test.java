package com.hsbc.oop02;
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Arya");
        p1.setAge(20);

        int personAge = 20;
        changeObject(p1);
        changePrimitive(personAge);
        System.out.println(p1.getName()+", "+p1.getAge());
        System.out.println("---------------------------");
        System.out.println(personAge);
    }
    static void changeObject(Person person){
        person.setName("Mohit");
        person.setAge(21);
    }
    static void changePrimitive(int personAge){
        personAge = 27;
    }

}
