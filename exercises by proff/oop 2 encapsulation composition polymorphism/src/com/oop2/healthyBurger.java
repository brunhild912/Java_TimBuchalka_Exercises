package com.oop2;

public class healthyBurger extends hamburger{

    String addOn_5;
    String addOn_6;

    double addOn_5_price;
    double addOn_6_price;
    public healthyBurger (String meat, double price){
        super("Healthy Burger", meat, "Brown Bread", price);
    }

    /** add on methods **/
    public void healthyBurger_addOn5 (String name, double price){
        this.addOn_5 = name;
        this.addOn_5_price = price;
    }

    public void healthyBurger_addOn6 (String name, double price){
        this.addOn_6 = name;
        this.addOn_6_price = price;
    }

    @Override
    public double hamburgerPrice(){
        double healthyBurger_price = super.hamburgerPrice();

        if (addOn_5 != null){
            healthyBurger_price += addOn_5_price;
            System.out.println("You have added an extra item " + addOn_5 + "for Rs. " + addOn_5_price);
        }
        if (addOn_6 != null){
            healthyBurger_price += addOn_6_price;
            System.out.println("You have added an extra item " + addOn_6 + "for Rs. " + addOn_6_price);
        }
        return healthyBurger_price;
    }
}

