package com.arrayLists;

import java.util.Scanner;

public class Main {
    private static Scanner takeInput = new Scanner(System.in);
    private static arrayList contactList = new arrayList();

    public static void main(String[] args) {
        boolean quit  = false;
        int choice = 0;
        printInstructions();

        while (!quit){
            System.out.println("Enter your choice: ");
            choice = takeInput.nextInt();
            takeInput.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;

                case 1:
                    printAll();
                    break;

                case 2:
                    add();
                    break;

                case 3:
                    remove();
                    break;

                case 4:
                    modify();
                    break;

                case 5:
                    find();
                    break;

                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("0 - To print choice options.");
            System.out.println("1 - To print contacts list.");
            System.out.println("2 - To add a contact into list.");
            System.out.println("3 - To remove a contact from list.");
            System.out.println("4 - To modify a position in list.");
            System.out.println("5 - To find a contact in list.");
            System.out.println("6 - To quit.");
    }

    public static void add (){
        System.out.println("Name: ");
        contactList.addContact(takeInput.nextLine());
    }

    public static void remove(){
        System.out.println("Enter name of the contact you want to remove.");
        String name = takeInput.nextLine();
        contactList.removeContact(name);
    }

    public static void modify(){
        System.out.println("Enter index no. and name of contact to be removed.");
        int indexNo = takeInput.nextInt();
        String name = takeInput.nextLine();
        contactList.modifyContact(indexNo-1, name);
    }

    public static void find(){
        System.out.println("Enter name of contact you want to find.");
        String name = takeInput.nextLine();
        if (contactList.findContact(name) != null){
            System.out.println("Your entered name is in the contact list.");
        }
        else {
            System.out.println("Name couldn't be found.");
        }
    }

    public static void printAll(){
        contactList.printContactsList();
    }
}
