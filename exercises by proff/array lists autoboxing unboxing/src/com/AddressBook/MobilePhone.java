package com.AddressBook;

import java.util.ArrayList;

public class MobilePhone {
    private String phoneNumber;
    ArrayList <Contacts> addressBook;

    public MobilePhone (String pNo){
        this.phoneNumber = pNo;
        this.addressBook = new ArrayList<Contacts>();
    }

    //store numbers
    //remove numbers
    //modify
    //print
    //find

    public boolean storeContact (Contacts contact){
        if (findContact(contact.getName()) >= 0){
            System.out.print("Contact is already on file.");
            return false;
        }
        addressBook.add(contact);
        return true;
    }

    public boolean removeContact (Contacts contact){
        int findPosition = findContact(contact);

        if (findPosition < 0){
            System.out.println("Contact isn't on file.");
            return false;
        }
        this.addressBook.remove(contact);
        System.out.println("Contact found at position " + findPosition + " is removed.");
        return true;
    }

    public boolean updateContact (Contacts oldContact, Contacts newContact){
        int findPosition = findContact(oldContact);
        if (findPosition < 0){
            System.out.print("Contact not found.");
            return false;
        }
        this.addressBook.set(findPosition, newContact);
        System.out.println("Old contact " + oldContact.getName() + " is replaced with " + newContact.getName());
        return true;

    }

    private int findContact (Contacts contact){
        return this.addressBook.indexOf(contact);
    }

    private int findContact (String name){
        for (int i = 0; i < addressBook.size(); i++){
            Contacts contact = this.addressBook.get(i);
            if (contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact (Contacts contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact (String name){
        int position = findContact(name);
        if (position >= 0){
            return this.addressBook.get(position);
        }
        return null;
    }

    public void printContacts (){
        System.out.println("\n\t\t\tContacts List");
        for (int i = 0; i <= addressBook.size(); i++){
            System.out.println(i+1 + ". " +
                    this.addressBook.get(i).getName() + " -> " +
                    this.addressBook.get(i).getPhoneNo());
        }
    }
}
