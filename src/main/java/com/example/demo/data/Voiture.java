package com.example.demo.data;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Voiture {

    private String marque;
    private double prix;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Voiture(String m, double p, int id){
        this.marque=m;
        this.prix=p;
        this.id=id;
    }
    public Voiture(String m, double p){
        this.marque=m;
        this.prix=p;
    }
    public Voiture(){
        this.marque="";
        this.prix=0;
        this.id=0;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
    public double getPrix() {
        return this.prix;
    }
    public String getMarque() {
        return this.marque;
    }
}