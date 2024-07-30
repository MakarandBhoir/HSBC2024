package com.hsbc.oop01;

public class Account extends Object {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public Account(){
    }
    public Account(int accountNumber, String accountHolder, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }
    public void showAccount(){
        System.out.println("Account Number = "+accountNumber);
        System.out.println("Account Holder = "+accountHolder);
        System.out.println("Account Balance = "+accountBalance);
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
