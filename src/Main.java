import com.engeto.examples.Booking;
import com.engeto.examples.Guest;
import com.engeto.examples.RoomJednoluzko;
import com.engeto.examples.RoomTrojluzko;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Guest firstGuest = new Guest("Adéla ", "Malíkova ", LocalDate.of(1993, 3,13));
        Guest secondGuest = new Guest("Jan ", "Dvořáček ", LocalDate.of(1995,5,5));

        RoomJednoluzko pokoj1 = new RoomJednoluzko(1);
        RoomJednoluzko pokoj2 = new RoomJednoluzko(2);
        RoomTrojluzko pokoj3 = new RoomTrojluzko(3);

        Booking rezervacePokoj1 = new Booking("rezervován", "Ne", "Ne", LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26),"Pobyt je pracovní");

        Booking rezervacePokoj2 = new Booking("Ne", "volný", "Ne", LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), "Pobyt je pracovní");

        Booking rezervacePokoj3 = new Booking("Ne", "Ne", "rezervován",
                LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), "Pobyt je rekreační");

        ArrayList<Guest> listOfGuest = new ArrayList<>();
        listOfGuest.add(firstGuest);
        listOfGuest.add(secondGuest);
        // listOfGuest.add(new Guest("Jan", "Nováček", LocalDate.of(1998,7,24)));

        System.out.println(firstGuest.getJmeno()+firstGuest.getPrijmeni()+firstGuest.getDatumNarozeni());
        System.out.println(secondGuest.getJmeno()+secondGuest.getPrijmeni()+secondGuest.getDatumNarozeni());

        System.out.println("Pokoj číslo " + pokoj1.getCisloPokoje() + " je " + pokoj2.getPocetLuzek() + " lůžkový za cenu " + pokoj1.getCenaZaJednoluzko() + " Kč/noc, " + "Balkón: " + pokoj1.getBalkon() + ", Výhled na moře: " + pokoj1.getVyhledNaMore());
        System.out.println("Pokoj číslo " + pokoj2.getCisloPokoje() + " je " + pokoj2.getPocetLuzek() + " lůžkový za cenu " + pokoj2.getCenaZaJednoluzko() + " Kč/noc, " + "Balkón: " + pokoj2.getBalkon() + ", Výhled na moře: " + pokoj2.getVyhledNaMore());
        System.out.println("Pokoj číslo " + pokoj3.getCisloPokoje() + " je " + pokoj3.getPocetLuzek() +  " lůžkový za cenu " + pokoj3.getCenaZaTrojluzko() + " Kč/noc, " + "Balkón: " + pokoj3.getBalkon() + ", Výhled na moře: " + pokoj3.getVyhledNaMore());

        System.out.println("Pokoj číslo " + pokoj1.getCisloPokoje() + " je " + rezervacePokoj1.getRezervacePokoj1() + " pro " + firstGuest.getJmeno()+firstGuest.getPrijmeni() + "od " + rezervacePokoj1.getRezervaceOd() + " do " + rezervacePokoj1.getRezervaceDo());
        System.out.println("Pokoj číslo " + pokoj2.getCisloPokoje() + " je " + rezervacePokoj2.getRezervacePokoj2());
        System.out.println("Pokoj číslo " + pokoj3.getCisloPokoje() + " je " + rezervacePokoj3.getRezervacePokoj3() + " pro " + firstGuest.getJmeno()+firstGuest.getPrijmeni() + "a " + secondGuest.getJmeno()+secondGuest.getPrijmeni() + "od " + rezervacePokoj3.getRezervaceOd() + " do " + rezervacePokoj3.getRezervaceDo());

        System.out.println("Celkem rezervací v hotelu: " +listOfGuest.size());
    }
}