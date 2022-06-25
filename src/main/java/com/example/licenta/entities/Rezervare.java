package com.example.licenta.entities;

public class Rezervare {

    private int idRezervare;
    private String numeRezervare;
    private int numarPersoane;
    private String dataRezervare;
    private String oraRezervare;
    private String numarTelefon;
    private String informatii;

    public int getIdRezervare() {
        return idRezervare;
    }

    public void setIdRezervare(int idRezervare) {
        this.idRezervare = idRezervare;
    }

    public String getNumeRezervare() {
        return numeRezervare;
    }

    public void setNumeRezervare(String numeRezervare) {
        this.numeRezervare = numeRezervare;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }

    public String getDataRezervare() {
        return dataRezervare;
    }

    public void setDataRezervare(String dataRezervare) {
        this.dataRezervare = dataRezervare;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }

    public void setOraRezervare(String oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getInformatii() {
        return informatii;
    }

    public void setInformatii(String informatii) {
        this.informatii = informatii;
    }

    //as pune si tipul de eveniment, gen nimic, zi de nastere, aniversare etc
}
