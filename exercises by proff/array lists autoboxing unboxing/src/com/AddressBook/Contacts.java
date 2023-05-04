package com.AddressBook;

public class Contacts {
    String name;
    String phoneNo;

    public Contacts (String name, String phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public static Contacts createContact (String name, String phoneNo){

        //returns contact
        return new Contacts(name, phoneNo);
    }
}
