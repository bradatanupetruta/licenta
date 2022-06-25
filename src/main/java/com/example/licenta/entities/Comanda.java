package com.example.licenta.entities;

import com.example.licenta.enums.Status;
import com.example.licenta.enums.TipComanda;
import com.example.licenta.enums.TipPlata;

import java.util.Date;
import java.util.List;

public class Comanda {

    private int idComanda;
    private Date dataComanda;
    private float totalComanda;
    private float TVA;
    private float bacsis;
    private TipPlata tipPlata;
    private TipComanda tipComanda;
    private List<Produs> produse;
    private Status status;

    public Comanda(int idComanda, Date dataComanda, float totalComanda, float TVA, float bacsis, TipPlata tipPlata, TipComanda tipComanda, List<Produs> produse, Status status) {
        this.idComanda = idComanda;
        this.dataComanda = dataComanda;
        this.totalComanda = totalComanda;
        this.TVA = TVA;
        this.bacsis = bacsis;
        this.tipPlata = tipPlata;
        this.tipComanda = tipComanda;
        this.produse = produse;
        this.status = status;
    }

    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public Date getDataComanda() {
        return dataComanda;
    }

    public void setDataComanda(Date dataComanda) {
        this.dataComanda = dataComanda;
    }

    public float getTotalComanda() {
        return totalComanda;
    }

    public void setTotalComanda(float totalComanda) {
        this.totalComanda = totalComanda;
    }

    public float getTVA() {
        return TVA;
    }

    public void setTVA(float TVA) {
        this.TVA = TVA;
    }

    public float getBacsis() {
        return bacsis;
    }

    public void setBacsis(float bacsis) {
        this.bacsis = bacsis;
    }

    public TipPlata getTipPlata() {
        return tipPlata;
    }

    public void setTipPlata(TipPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public TipComanda getTipComanda() {
        return tipComanda;
    }

    public void setTipComanda(TipComanda tipComanda) {
        this.tipComanda = tipComanda;
    }

    public List<Produs> getProduse() {
        return produse;
    }

    public void setProduse(List<Produs> produse) {
        this.produse = produse;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    //private int idAngajat; - FK tabela angajat
    //private int idProdus; - FK tabela produs

    //ca atribute ar mai fi tip plata(cash, card), numar invitati(?), tip comanda(dine in, take out, bar), status(?)

}
