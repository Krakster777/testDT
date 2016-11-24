package com.testdb.entity;

import javax.persistence.*;

public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idorg")
    private long ID;

    @Column(name = "name", nullable = false)
    private String Name;


    @Column(name = "physadr", nullable = false)
    private String Physadr;

    @Column(name = "juradr", nullable = false)
    private String Juradr;

    @Column(name = "lead", nullable = false)
    private int Lead

    public Organisation() {
    }

    public Organisation(String name, String Physadr, String Juradr, int Lead) {

        this.name = name;
        this.Physadr = Physadr;
        this.Juradr = Juradr;
        this.Lead=Lead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhysadr() {
        return Physadr;
    }

    public void setPhysadr(String Physadr) {
        this.Physadr = Physadr;
    }

    public String getJuradr() {
        return Juradr;
    }
    public void setJuradr(String Juradr) {
        this.Juradr = Juradr;
    }

    public int getLead() {
        return Lead;
    }

    public void setLead(int age) {
        this.Lead = Lead;
    }
}