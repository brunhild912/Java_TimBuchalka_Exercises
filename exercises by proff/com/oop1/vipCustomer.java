package com.oop1;

public class vipCustomer {

    private String name;
    private double bankBalance;
    private String email;

    public vipCustomer (){
        this("default name", 0.00, "default email");
        System.out.println("EMPTY constructor called.\n");

    }

    public vipCustomer (String name, double bankBalance){
        this(name, bankBalance, "default email");

        System.out.println("constructor with 2 parameters called.\n");
    }

    public vipCustomer (String name, double bankBalance, String email){
        this.name = name;
        this.bankBalance = bankBalance;
        this.email = email;

        System.out.println("constructor with 3 parameters called.\n");
        System.out.println(name + " " + bankBalance + " " + email);
    }

    /***** GETTERS *****/
    public String getName() {
        return name;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public String getEmail() {
        return email;
    }
}
