package com.engeto.examples;

public class RoomJednoluzko {

    //region Konstruktory
    int cisloPokoje;
    int pocetLuzek = 1;
    String balkon = "ano";
    String vyhledNaMore = "ano";
    int cenaZaJednoluzko = 1000;

    public RoomJednoluzko(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public RoomJednoluzko(int cisloPokoje, int pocetLuzek, String balkon, String vyhledNaMore, int cenaZaJednoluzko) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.balkon = balkon;
        this.vyhledNaMore = vyhledNaMore;
        this.cenaZaJednoluzko = cenaZaJednoluzko;
    }
//endregion

    //region Metody

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public int getPocetLuzek() {
        return pocetLuzek;
    }

    public void setPocetLuzek(int pocetLuzek) {
        this.pocetLuzek = pocetLuzek;
    }

    public String getBalkon() {
        return balkon;
    }

    public void setBalkon(String balkon) {
        this.balkon = balkon;
    }

    public String getVyhledNaMore() {
        return vyhledNaMore;
    }

    public void setVyhledNaMore(String vyhledNaMore) {
        this.vyhledNaMore = vyhledNaMore;
    }

    public int getCenaZaJednoluzko() {
        return cenaZaJednoluzko;
    }

    public void setCenaZaJednoluzko(int cenaZaJednoluzko) {
        this.cenaZaJednoluzko = cenaZaJednoluzko;
    }

    //endregion
}
