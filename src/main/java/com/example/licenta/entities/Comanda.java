package com.example.licenta.entities;

import java.util.Date;
import java.util.List;

public class Comanda {

    private int idComanda;
    private Date dataComanda;
    private float totalComanda;//TVA?
    private float TVA;
    private float bacsis;
    //private TipPlata tipPlata;
    //private TipComanda tipComanda;
    private List<Produs> produse;
    //private int idAngajat; - FK tabela angajat
    //private int idProdus; - FK tabela produs

    //ca atribute ar mai fi tip plata(cash, card), numar invitati(?), tip comanda(dine in, take out, bar), status(?)

}
