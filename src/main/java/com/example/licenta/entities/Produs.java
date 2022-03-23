package com.example.licenta.entities;

import com.example.licenta.enums.Categorie;

// optiune de adaugare/editare a produsului
public class Produs {

    private int id;
    private String denumire;
    private float stoc;
    private float pret;
    private int cantitate;
    private Categorie categorie;
    private String informatii;
    private String id_imagine;

    public int getId() {
        return id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getStoc() {
        return stoc;
    }

    public void setStoc(float stoc) {
        this.stoc = stoc;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}


//categorieProdus, detalii?
