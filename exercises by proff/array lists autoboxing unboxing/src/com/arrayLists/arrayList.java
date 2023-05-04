package com.arrayLists;

import java.util.ArrayList;

public class arrayList {
    ArrayList<String> contactsList = new ArrayList<String>();

    //add contact
    //remove contact
    //modify contact
    //find contact

    public void addContact (String name){
        contactsList.add(name);
    }

    public void removeContact (String name){
        contactsList.remove(name);
    }

    public void modifyContact (int position, String name){
        contactsList.set(position, name);
    }

    public void printContactsList (){
        System.out.println("You have " + contactsList.size() + " contacts in your address book.");
        for (int i = 0; i < contactsList.size(); i++){
            System.out.println(i+1 + ": " + contactsList.get(i));
        }
    }

    public String findContact (String name){
        boolean exists = contactsList.contains(name);
        if (exists){
            int position = contactsList.indexOf(name);
            return contactsList.get(position);
        }
        return null;
    }
}
