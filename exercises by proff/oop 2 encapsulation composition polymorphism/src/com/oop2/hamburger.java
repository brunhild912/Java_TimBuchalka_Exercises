package com.oop2;

public class hamburger {

    String name;
    String meat;
    String breadRoll;
    double price;

    /** add ons **/
    String addOn_1;
    double addOn_1_price;

    String addOn_2;
    double addOn_2_price;

    String addOn_3;
    double addOn_3_price;

    String addOn_4;
    double addOn_4_price;

    public hamburger (String name, String meat, String breadRoll, double price){
        this.name = name;
        this.meat = meat;
        this.breadRoll = breadRoll;
        this.price = price;
    }

    /** add on addition to bucket **/
    public void hamburgerAddOn_1(String name, double price){
        this.addOn_1 = name;
        this.addOn_1_price = price;
    }

    public void hamburgerAddOn_2(String name, double price){
        this.addOn_2 = name;
        this.addOn_2_price = price;
    }

    public void hamburgerAddOn_3(String name, double price){
        this.addOn_3 = name;
        this.addOn_3_price = price;
    }

    public void hamburgerAddOn_4(String name, double price){
        this.addOn_4 = name;
        this.addOn_4_price = price;
    }

    /** hamburger price method **/
    public double hamburgerPrice(){
        double hamburgerPrice = this.price;

        System.out.println("This burger " + this.name + " on a bread roll, "
                + this.breadRoll + " is of " + this.price);

        if (this.addOn_1 != null){
            hamburgerPrice += addOn_1_price;
            System.out.println("Item " + this.addOn_1 + " added for addition price Rs. " + this.addOn_1_price);
        }

        if (this.addOn_2 != null){
            hamburgerPrice += addOn_2_price;
            System.out.println("Item " + this.addOn_2 + " added for addition price Rs. " + this.addOn_2_price);
        }

        if (this.addOn_3 != null){
            hamburgerPrice += addOn_3_price;
            System.out.println("Item " + this.addOn_3 + " added for addition price Rs. " + this.addOn_3_price);
        }

        if (this.addOn_4 != null){
            hamburgerPrice += addOn_4_price;
            System.out.println("Item " + this.addOn_4 + " added for addition price Rs. " + this.addOn_4_price);
        }

        return hamburgerPrice;
    }
}
