package com.example.licenta.enums;

public enum Categorie {

    PORC("Preparate din carne da porc", 1);

    private String display;
    private int cod;

    Categorie(String display, int cod) {
        this.display = display;
        this.cod = cod;
    }


}
