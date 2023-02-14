package com.engeto.examples;

import java.time.LocalDate;

public class Booking {
    //region Konstruktory

    String rezervacePokoj1;
    String rezervacePokoj2;
    String rezervacePokoj3;
    LocalDate rezervaceOd;
    LocalDate rezervaceDo;
    String typeOfVacation;

    public Booking(String rezervacePokoj1) {
        this.rezervacePokoj1 = rezervacePokoj1;
    }

    public Booking(LocalDate rezervaceOd) {
        this.rezervaceOd = rezervaceOd;
    }

    public Booking(String rezervacePokoj1, String rezervacePokoj2, String rezervacePokoj3, LocalDate rezervaceOd, LocalDate rezervaceDo, String typeOfVacation) {
        this.rezervacePokoj1 = rezervacePokoj1;
        this.rezervacePokoj2 = rezervacePokoj2;
        this.rezervacePokoj3 = rezervacePokoj3;
        this.rezervaceOd = rezervaceOd;
        this.rezervaceDo = rezervaceDo;
        this.typeOfVacation = typeOfVacation;
    }

    //endregion

    //region Metody

    public String getRezervacePokoj1() {
        return rezervacePokoj1;
    }

    public void setRezervacePokoj1(String rezervacePokoj1) {
        this.rezervacePokoj1 = rezervacePokoj1;
    }

    public String getRezervacePokoj2() {
        return rezervacePokoj2;
    }

    public void setRezervacePokoj2(String rezervacePokoj2) {
        this.rezervacePokoj2 = rezervacePokoj2;
    }

    public String getRezervacePokoj3() {
        return rezervacePokoj3;
    }

    public void setRezervacePokoj3(String rezervacePokoj3) {
        this.rezervacePokoj3 = rezervacePokoj3;
    }

    public LocalDate getRezervaceOd() {
        return rezervaceOd;
    }

    public void setRezervaceOd(LocalDate rezervaceOd) {
        this.rezervaceOd = rezervaceOd;
    }

    public LocalDate getRezervaceDo() {
        return rezervaceDo;
    }

    public void setRezervaceDo(LocalDate rezervaceDo) {
        this.rezervaceDo = rezervaceDo;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }


    //endregion
}


