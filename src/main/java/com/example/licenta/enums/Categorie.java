package com.example.licenta.enums;

public enum Categorie {

    PORC("Preparate din carne da porc", 1);

    private String display;
    private int cod;

    Categorie(String display, int cod) {
        this.display = display;
        this.cod = cod;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
