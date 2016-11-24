package com.testdb.entity;

import javax.persistence.*;

public class Subdivision {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idsub")
    private long ID;

    @Column(name = "name", nullable = false)
    private String Name;

    @Column(name = "contact", nullable = false)
    private String Contact;

    @Column(name = "lead", nullable = false)
    private int Lead

    public Subdivision() {
    }

    public Subdivision(String name, String contact, int Lead) {

        this.Name = Name;
        this.Contact = Contact;
        this.Lead=Lead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return Contact;
    }
    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public int getLead() {
        return Lead;
    }

    public void setLead(int Lead) {
        this.Lead = Lead;
    }
}