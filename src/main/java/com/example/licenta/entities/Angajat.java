package com.example.licenta.entities;

import javax.persistence.Id;
import java.util.Date;
import java.util.List;

public class Angajat {

    @Id
    private int id;
    private String nume;
    private String prenume;
    private Date dataNastere;
    private Date dataAngajare;
    //private List<Role> roluri;

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Date getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(Date dataNastere) {
        this.dataNastere = dataNastere;
    }

    public Date getDataAngajare() {
        return dataAngajare;
    }

    public void setDataAngajare(Date dataAngajare) {
        this.dataAngajare = dataAngajare;
    }
}
