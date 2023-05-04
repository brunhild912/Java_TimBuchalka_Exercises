package com.oop1;

public class bankAccount {

    /***** FIELDS *****/
    private long accNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNo;

    public bankAccount (){
        System.out.println("Default constructor called.");
    }

    public bankAccount (long accNumber, double balance, String customerName, String email, String phoneNo){
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    //setters

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    //getters


    public long getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    /***** METHODS *****/
    public void depositFund(int amount) {
        System.out.println("Your balance BEFORE: " + balance);

        balance = balance + amount;

        System.out.println("Your current balance is: " + balance + "\n");
    }

    public void withdrawFund(int amount){
        System.out.println("Your balance BEFORE: " + balance);

        if ((balance - amount) < 0){
            System.out.println("Insufficient balance!");
        }
        else {
            balance = balance - amount;

            System.out.println("Your current balance is: " + balance + "\n");
        }
    }
}
