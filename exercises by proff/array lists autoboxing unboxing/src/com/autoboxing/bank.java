package com.autoboxing;

import java.util.ArrayList;
import java.util.Date;

public class bank {
    String name;
    ArrayList <branches> branch;

    public bank (String name){
        this.name = name;
        this.branch = new ArrayList<branches>();
    }

    public boolean addBranch (String name){
        if (findBranch(name) == null){
            this.branch.add(new branches(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer (String branchName, String customerName, double InitialAmount){
        branches branch_1 = findBranch(branchName);

        if (branch_1 != null){
            return branch_1.newCustomer(customerName, InitialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction (String branchName, String customerName, double amount){
        branches branch_1 = findBranch(branchName);

        if (branch_1 != null){
            return branch_1.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    private branches findBranch (String name){
        for (int i = 0; i < this.branch.size(); i++){
            branches checkedBranch = this.branch.get(i);
            if (checkedBranch.getName().equals(name)){
                return checkedBranch;
            }
        }

        return null;
    }

    //list customers
    public boolean listCustomers (String branchName, boolean showTransactions){
        branches branch_1 = findBranch(branchName);

        if (branch_1 != null){
            System.out.println("Branch Name: " + branch_1.getName() + " ");

            //create an arrayList to store customers of this branch
            ArrayList<Customer> branchCustomers = branch_1.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + " [" + (i+1) + "]");

                //transactions display
                if (showTransactions){
                    System.out.println("Transactions: ");
                    ArrayList < Double> transactions = branchCustomer.getTransaction();
                    for (int j = 0; j < transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] " + "Amount: " + transactions.get(j));
                    }
                    System.out.print("\n");
                }
            }
            return true;
        } else {
            return false;
        }
    }


    public String getName() {
        return name;
    }
}
