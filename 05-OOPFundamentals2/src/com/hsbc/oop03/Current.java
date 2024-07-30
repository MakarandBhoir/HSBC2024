package com.hsbc.oop03;

public final class Current extends Account {
    private double overdraft;
    public Current(int accNumber, String accHolder, double accBal, double overdraft){
        super(accNumber, accHolder, accBal);
        this.overdraft = overdraft;
    }
    @Override
    public void showAccount(){
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Account Holder = "+super.getAccountHolder()); // this
        System.out.println("Account Balance = "+this.getAccountBalance()); // super
        System.out.println("Rate of interest = "+this.getOverdraft()); // not super
    }
    public double getOverdraft() {
        return overdraft;
    }
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
