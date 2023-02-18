package com.engeto.examples;

import java.time.LocalDate;

public class Guest {

    private String jmeno, prijmeni;
    private LocalDate datumNarozeni;

      public Guest(String jmeno, String prijmeni, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;

    }

    //region Metody
    public String getJmeno() { return jmeno;    }

    public String getPrijmeni() { return prijmeni;    }

    public LocalDate getDatumNarozeni() { return datumNarozeni;    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }
//endregion


}
