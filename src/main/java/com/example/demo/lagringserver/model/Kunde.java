package com.example.demo.lagringserver.model;

public class Kunde {
    private String fnavn;
    private String enavn;
    private String epost;
    private String filmen;
    private String antall;
    private String nummer;

    public Kunde(String fnavn, String enavn, String epost, String filmen, String antall, String nummer) {
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.epost = epost;
        this.filmen = filmen;
        this.antall = antall;
        this.nummer = nummer;
    }
    public Kunde(){}

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getFilmen() {
        return filmen;
    }

    public void setFilmen(String filmen) {
        this.filmen = filmen;
    }

    public String getAntall() {
        return antall;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }
}

