package com.AddressBook;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    private static Scanner getInput = new Scanner(System.in);
    private static MobilePhone phone_1 = new MobilePhone("0092 323 570 8691");
    public static void main (String[] args){
        boolean quit = false;
        startPhone();
        printInstructions();

        while (!quit){
            System.out.println("Enter action: (6 - to show available actions)");
            int action = getInput.nextInt();

            switch (action){
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;

                case 1:
                    print();
                    break;

                case 2:
                    add();
                    break;

                case 3:
                    update();
                    break;

                case 4:
                    remove();
                    break;

                case 5:
                    query();
                    break;

                case 6:
                    printInstructions();
                    break;
            }
        }
    }

    private static void startPhone (){
        System.out.println("Phone starting... ");
    }

    private static void printInstructions (){
        System.out.println("\nAvailable actions\npress:");
        System.out.println("0 - to shutdown\n+" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - to query if an existing contact exists\n" +
                "6 - to print list of available actions");
        System.out.println("Choose your action: ");
    }

    private static void print (){
        phone_1.printContacts();
    }

    private static void add (){
        System.out.println("Enter name: ");
        String name = getInput.nextLine();
        System.out.println("Enter phone No: ");
        String number = getInput.nextLine();
        Contacts newContact = Contacts.createContact(name, number);

        if (phone_1.storeContact(newContact)){
            System.out.println("New contact added: \nName = " + newContact.getName() +
                    "\nPhone No. = " + newContact.getPhoneNo());
        }
        System.out.println("Cannot add " + newContact.getName() + ", already in the address book.");
    }

    private static void update (){
        System.out.println("Enter existing contact name.");
        String name = getInput.nextLine();

        Contacts existingRecord = phone_1.queryContact(name);

        if (existingRecord == null){
            System.out.println("Contact not found.");
        }

        System.out.println("Enter new contact name.");
        String newName = getInput.nextLine();
        System.out.println("Enter new contact number.");
        String newNumber = getInput.nextLine();

        Contacts newContact = Contacts.createContact(newName, newNumber);
        if (phone_1.updateContact(existingRecord, newContact)){
            System.out.println("Successfully updated!");
        }
        else System.out.println("Error updating record.");
    }

    private static void remove(){
        System.out.println("Enter contact name: ");
        String name = getInput.nextLine();

        Contacts existingRecord = phone_1.queryContact(name);
        if (existingRecord == null){
            System.out.println("Contact not found!");
            return;
        }
        if (phone_1.removeContact(existingRecord)){
            System.out.println("Contact successfully removed.");
        } else System.out.println("Error deleting contact");
    }

    private static void query(){
        System.out.println("Enter contact name: ");
        String name = getInput.nextLine();

        Contacts existingRecord = phone_1.queryContact(name);
        if (existingRecord == null){
            System.out.println("Contact not found!");
            return;
        }

        System.out.println("Name: " + existingRecord.getName() + " Phone No: " + existingRecord.getPhoneNo());
    }
}
