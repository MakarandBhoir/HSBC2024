package com.hsbc.oop02;

public class Test {
    public static void main(String[] args) {
        Saving saving = new Saving(1001, "Tushar", 50000, 4.5);
        Current current = new Current(1002, "Sunidhi", 800000, 100000);

        //Account account = new Account(); // not possible because it is abstract
        Account account = null;
        account = saving;
        account.showAccount(); // poly-morphic method call
        System.out.println("--------------------------------");
        account = current;
        account.showAccount(); // poly-morphic method call
    }
}
