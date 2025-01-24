package com.example.Adavipalem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Temple {

    @Id
    private int Temple_ID;
    private String Temple_name;

    private String Contact;

    private String Address;

    private String About;

    public Temple() {
    }

    public Temple(int temple_ID, String temple_name, String contact, String address, String about) {
        Temple_ID = temple_ID;
        Temple_name = temple_name;
        Contact = contact;
        Address = address;
        About = about;
    }

    public int getTemple_ID() {
        return Temple_ID;
    }

    public void setTemple_ID(int temple_ID) {
        Temple_ID = temple_ID;
    }

    public String getTemple_name() {
        return Temple_name;
    }

    public void setTemple_name(String temple_name) {
        Temple_name = temple_name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String about) {
        About = about;
    }

    @Override
    public String toString() {
        return "Temple{" +
                "Temple_ID=" + Temple_ID +
                ", Temple_name='" + Temple_name + '\'' +
                ", Contact='" + Contact + '\'' +
                ", Address='" + Address + '\'' +
                ", About='" + About + '\'' +
                '}';
    }
}
