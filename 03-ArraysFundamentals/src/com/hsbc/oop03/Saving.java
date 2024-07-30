package com.hsbc.oop03;

public class Saving extends Account{
    private double roi;
    public Saving(){
    }
    public Saving(int accNumber, String accHolder, double accBal, double roi){
        super(accNumber, accHolder, accBal);
        this.roi = roi;
    }
    public void displaySavingAccount(){
        super.showAccount();
        System.out.println("Roi = "+roi);
    }
}
