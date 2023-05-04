package com.oop2;

public class deluxeBurger extends hamburger{
    public deluxeBurger (){
        super("Deluxe Burger", "Mutton", "White Bread", 560.00);
        super.hamburgerAddOn_1("Chips", 220.00);
        super.hamburgerAddOn_2("Drink", 80.00);
    }

    //to avoid adding any add ons from extended class
    @Override
    public void hamburgerAddOn_1(String name, double price){
        System.out.println("Cannot add an extra item in Deluxe Edition!");
    }

    public void hamburgerAddOn_2(String name, double price){
        System.out.println("Cannot add an extra item in Deluxe Edition!");
    }

    public void hamburgerAddOn_3(String name, double price){
        System.out.println("Cannot add an extra item in Deluxe Edition!");
    }

    public void hamburgerAddOn_4(String name, double price){
        System.out.println("Cannot add an extra item in Deluxe Edition!");
    }
}
