package com.testdb.entity;

import javax.persistence.*;

public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idorg")
    private long ID;

    @Column(name = "name", nullable = false)
    private String Name;


    @Column(name = "otch", nullable = false)
    private String Otchestvo;

    @Column(name = "lastname", nullable = false)
    private String Lastname;

    @Column(name = "post", nullable = false)
    private String Post

    public Worker() {
    }

    public Worker(String Name, String Otchestvo, String Lastname, String Post) {

        this.Name = Name;
        this.Otchestvo = Otchestvo;
        this.Lastname = Lastname;
        this.Post=Post;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getOtch() {
        return Otchestvo;
    }

    public void setOtch(String Otchestvo) {
        this.Otchestvo = Otchestvo;
    }

    public String getLastname() {
        return Otchestvo;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getPost() {
        return Post;
    }
    public void setPost(String Post) {
        this.Post = Post;
    }

}