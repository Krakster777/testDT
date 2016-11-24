package com.testdb.entity;

import javax.persistence.*;
import java.text.DateFormat;

public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idmessage")
    private long ID;

    @Column(name = "predm", nullable = false)
    private String Predmet;


    @Column(name = "autorID", nullable = false)
    private int Autor;

    @Column(name = "ispID", nullable = false)
    private int Isp;

    @Column(name = "srok", nullable = false)
    private DateFormat Srok;

    @Column(name = "prizcontrol", nullable = false)
    private String PrizControl;

    @Column(name = "prizisp", nullable = false)
    private String PrizIsp;

    @Column(name = "text", nullable = false)
    private String text;

    public Message() {
    }

    public Message(String Predmet,
                   int Autor,
                   int Isp,
                   DateFormat Srok,
                   String PrizControl,
                   String PrizIsp,
                   String text) {

        this.Predmet = Predmet;
        this.Autor = Autor;
        this.Srok = Srok;
        this.PrizControl=PrizControl;
        this.PrizIsp=PrizIsp;
        this.text=text;
    }
    //конструктор для тестов
    public Message(String Predmet,
                   String text) {

        this.Predmet = Predmet;
        this.text=text;
    }

    public String getPredmet() {
        return Predmet;
    }

    public void setPredmet(String Predmet) {
        this.Predmet = Predmet;
    }

    public int getIsp() {
        return Isp;
    }

    public void setIsp(String Physadr) {
        this.Isp = Isp;
    }

    public int getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public DateFormat getSrok() {
        return Srok;
    }

    public void setSrok(DateFormat Srok) {
        this.Srok = Srok;
    }

    public String getPrizControl(){
        return PrizControl;
    }

    public void setPrizControl(String PrizControl){
        this.PrizControl=PrizControl;
    }

    public String getPrizIsp(){
        return PrizIsp;
    }

    public void setPrizIsp(String PrizIsp){
        this.PrizIsp=PrizIsp;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text=text;
    }
}