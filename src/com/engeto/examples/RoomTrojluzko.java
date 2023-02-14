package com.engeto.examples;

public class RoomTrojluzko {
    //region Konstruktory
    int cisloPokoje;
    int pocetLuzek = 3;
    String balkon = "ne";
    String vyhledNaMore = "ano";
    int cenaZaTrojluzko = 2400;

    public RoomTrojluzko(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public RoomTrojluzko(int cisloPokoje, int pocetLuzek, String balkon, String vyhledNaMore, int cenaZaTrojluzko) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.balkon = balkon;
        this.vyhledNaMore = vyhledNaMore;
        this.cenaZaTrojluzko = cenaZaTrojluzko;
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

    public int getCenaZaTrojluzko() {
        return cenaZaTrojluzko;
    }

    public void setCenaZaTrojluzko(int cenaZaTrojluzko) {
        this.cenaZaTrojluzko = cenaZaTrojluzko;
    }


    //endregion
}
