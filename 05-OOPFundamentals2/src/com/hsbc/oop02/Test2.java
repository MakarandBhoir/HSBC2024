package com.hsbc.oop02;

public class Test2 {
    public static void main(String[] args) {
        Account account = null;
        Saving saving = new Saving(1001, "Indrayani", 58000, 4.5);
        Current current = new Current(1002, "Shaili", 900000, 120000);

        if(Math.random() > 0.5) { // 0 to 1 e.g. 0.3384769667
            account = saving;
        }else{
            account = current;
        }
        if(account instanceof Saving){
            System.out.println("Saving account data");
            System.out.println("-----------------------------");
        }
        if(account instanceof Current){
            System.out.println("Current account data");
            System.out.println("-----------------------------");
        }
        account.showAccount(); // polymorphic call

    }
}
