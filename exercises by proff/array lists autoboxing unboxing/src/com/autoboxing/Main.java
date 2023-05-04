package com.autoboxing;

public class Main {
    public static void main (String[] args){
        bank Bank_1 = new bank("State Bank of Homeland");

        Bank_1.addBranch("Wah Cantt");

        Bank_1.addCustomer("Wah Cantt", "Ariba Anjum", 7500.00);
        Bank_1.addCustomer("Wah Cantt", "Ayesha Faisal", 10000.00);
        Bank_1.addCustomer("Wah Cantt", "Hibba Khan", 5000.00);

        Bank_1.addBranch("ISB");

        Bank_1.addCustomer("ISB", "Dayim Khanzada", 20000.00);
        Bank_1.addCustomer("ISB", "Ammar Hyder", 8000.00);
        Bank_1.addCustomer("ISB", "Mahad Hussain", 1500.00);

        Bank_1.addCustomerTransaction("Wah Cantt", "Ariba Anjum", 250.00);
        Bank_1.addCustomerTransaction("ISB", "Ammar Hyder", 4000.00);
        Bank_1.addCustomerTransaction("Wah Cantt", "Hiba", 250.00);

        Bank_1.listCustomers("Wah Cantt", true);
    }
}
