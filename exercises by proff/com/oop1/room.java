package com.oop1;

public class room {
    wallsRoom roomWalls;
    furnitureRoom roomFurniture;
    accessoriesRoom roomAccessories;

    public room (wallsRoom w, furnitureRoom f, accessoriesRoom a){
        this.roomWalls = w;
        this.roomFurniture = f;
        this.roomAccessories = a;
    }

    public wallsRoom getRoomWalls() {
        return roomWalls;
    }

    public furnitureRoom getRoomFurniture() {
        return roomFurniture;
    }

    public accessoriesRoom getRoomAccessories() {
        return roomAccessories;
    }
}

/*** main code for room report
 /*** wallsRoom wallRoom1 = new wallsRoom("Beige", "Stones", true);
    furnitureRoom furnitureRoom1 = new furnitureRoom("Dark Brown", 6, "Deodar");
    accessoriesRoom accessoriesRoom1 = new accessoriesRoom("Clock", "Plants", "Decoration Lights");

    room myRoom = new room(wallRoom1, furnitureRoom1, accessoriesRoom1);

        System.out.println("\t\t My Room Report");

                //walls
                System.out.println("WALLS\n" + "Color: " + wallRoom1.getColor() + "\nMaterial: " + wallRoom1.getMaterial()
                + "\nMolding: " + wallRoom1.isMolding());

                //furniture
                System.out.println("\nFURNITURE\n" + "Color: " + furnitureRoom1.getColor() + "\nMaterial: "
                + furnitureRoom1.getMaterial());

                //accessories
                System.out.println("\nACCESSORIES\n" + "a: " + accessoriesRoom1.getAccessory1() + "\nb: "
                + accessoriesRoom1.getAccessory2());

                System.out.println("\n\t\t...Report Completed...");
 ***/

