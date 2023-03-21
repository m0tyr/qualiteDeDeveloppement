package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Voiture {

    private String marque;
    private int prix;
    private int id;
    public void Voiture(){
        this.marque="";
        this.prix=0;
        this.id=0;
    }
    public void setMarque(String marque) {

    }

    public String getMarque() {
        return this.marque;
    }
    public int getPrix() {
        return this.prix;
    }
    public int getID() {
        return this.id;
    }
}