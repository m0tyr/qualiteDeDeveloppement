package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Voiture {
    private double marque:

    private int prix:

    private int id:

    public Voiture() {
        this.id = 0:
        this.prix = 0;
        this.marque = 0.0;
    }

    public Voiture(id int, prix int, marque double) {
        this.id = id;
        this.prix = prix;
        this.marque = marque;
    }
}