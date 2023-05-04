package com.oop2;

public class Main {
    public static void main(String[] args) {
        hamburger burger1 = new hamburger("Basic", "Chicken", "Pita Bread", 350.00);

        burger1.hamburgerAddOn_1("Cheese", 25.00);
        double price = burger1.hamburgerPrice();
        System.out.println("Your total price is: " + price + "\n");

        healthyBurger burger2 = new healthyBurger("Beef", 420.00);
        burger2.hamburgerAddOn_1("Lettuce", 10.00);
        burger2.healthyBurger_addOn5("Egg", 30.00);
        price = burger2.hamburgerPrice();
        System.out.println("Your total price is: " + price + "\n");

        deluxeBurger burger3 = new deluxeBurger();
        burger3.hamburgerAddOn_2("Tomato", 20.00);
        System.out.println("Your total price is: " + burger3.hamburgerPrice());

    }
}
