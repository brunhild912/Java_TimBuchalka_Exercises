package com.autoboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList <Double> transaction;

    public Customer (String name, double initialAmount){
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransactions(initialAmount);
    }

    //add transactions method
    public void addTransactions (double amount){
        this.transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
