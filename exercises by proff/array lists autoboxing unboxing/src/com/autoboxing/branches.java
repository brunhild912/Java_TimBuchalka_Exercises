package com.autoboxing;

import java.util.ArrayList;

public class branches {
    ArrayList <Customer> customers;
    String name;

    public branches (String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }


    //new customer account
    //boolean so that if name already exists, we can return false
    public boolean newCustomer (String name, double initialAmount){
        if (findCustomer(name) == null){
            this.customers.add(new Customer(name, initialAmount));
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addCustomerTransaction (String name, double amount){
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null){
            existingCustomer.addTransactions(amount);
            return true;
        }

        return false;
    }

    //findCustomer is private method as we won't be using it anywhere else other than this class
    private Customer findCustomer (String name){
        for (int i = 0; i < this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(name)){
                return checkedCustomer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
