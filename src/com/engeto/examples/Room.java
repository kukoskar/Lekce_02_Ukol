package com.engeto.examples;

public class Room {

    private int cisloPokoje;
    private int pocetLuzek;
    private int cenaZaNoc;
    private String balkon;
    private String vyhledNaMore;

    public Room(int cisloPokoje, int pocetLuzek, int cenaZaNoc, String balkon, String vyhledNaMore) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.cenaZaNoc = cenaZaNoc;
        this.balkon = balkon;
        this.vyhledNaMore = vyhledNaMore;

    }
    public Room(int cisloPokoje, int pocetLuzek) {
        this(cisloPokoje, pocetLuzek, 1000, "s balkonem", "a s výhledem na moře");
    }
    public Room() {
    }


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

    public int getCenaZaNoc() {
        return cenaZaNoc;
    }

    public void setCenaZaNoc(int cenaZaNoc) {
        this.cenaZaNoc = cenaZaNoc;
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
    //endregion

}
