package com.hsbc.oop04;

public final class Saving extends Account {
    private double roi;
    public Saving(){
    }
    public Saving(int accNumber, String accHolder, double accBal, double roi){
        super(accNumber, accHolder, accBal);
        this.roi = roi;
    }
    @Override
    final public void showAccount(){
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Account Holder = "+super.getAccountHolder()); // this
        System.out.println("Account Balance = "+this.getAccountBalance()); // super
        System.out.println("Rate of interest = "+this.getRoi()); // not super
    }
    public double getRoi() {
        return roi;
    }
    public void setRoi(double roi) {
        this.roi = roi;
    }
}
