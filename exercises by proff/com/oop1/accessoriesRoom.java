package com.oop1;

public class accessoriesRoom {
    String accessory1;
    String accessory2;
    String accessory3;

    /*** constructor ***/
    public accessoriesRoom(String a1, String a2, String a3){
        this.accessory1 = a1;
        this.accessory2 = a2;
        this.accessory3 = a3;
    }

    public String getAccessory1() {
        return accessory1;
    }

    public String getAccessory2() {
        return accessory2;
    }

    public String getAccessory3() {
        return accessory3;
    }
}
