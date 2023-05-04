package com.oop1;

public class wallsRoom {
    String color;
    String material;
    boolean molding;

    /*** constructor ***/
    public wallsRoom (String color, String material, boolean molding){
        this.color = color;
        this.material = material;
        this.molding = molding;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isMolding() {
        return molding;
    }
}
