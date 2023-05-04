package com.oop1;

public class furnitureRoom {
    int size;
    String material;
    String color;

    /*** constructor ***/
    public furnitureRoom (String color, int size, String material){
        this.color = color;
        this.size = size;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
