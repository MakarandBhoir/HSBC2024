package com.hsbc.oop07;

class Base {
    public void Print() {
        System.out.println("Base");
    }
}
class Derived extends Base {

    public void Print() {
        System.out.println("Derived");
    }
}

public class Test {
    public static void main(String[] args) {
        Base b = new Derived();
        b.Print();

        Base b2 = null;
        b2.Print();
    }
}
