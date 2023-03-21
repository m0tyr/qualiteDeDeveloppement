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
    public void Voiture(String m, int p, int id){
        this.marque=m;
        this.prix=p;
        this.id=id;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public int getPrix() {
        return this.prix;
    }

    public String getMarque() {
        return this.marque;
    }
}