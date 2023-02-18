import com.engeto.examples.Booking;
import com.engeto.examples.Guest;
import com.engeto.examples.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Guest firstGuest = new Guest("Adéla ", "Malíkova ", LocalDate.of(1993, 3,13));
        Guest secondGuest = new Guest("Jan ", "Dvořáček ", LocalDate.of(1995,5,5));

        Room room1 = new Room(1, 1);
        Room room2 = new Room(2, 1);
        Room room3 = new Room(3, 3, 2400, "bez balkónu", "a s výhledem na moře");

        Booking firstRoom = new Booking(room1, firstGuest, LocalDate.of(2021, 7, 19), LocalDate.of(2021,7,26 ), "pracovní");
        Booking secondRoom = new Booking(room2);
        Booking thirdRoom = new Booking(room3, firstGuest, secondGuest, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), "rekreační");

        List<Booking> listOfBooking = new ArrayList<>();
        listOfBooking.add(firstRoom);
        listOfBooking.add(thirdRoom);
        // listOfBooking.add(new Guest("Jan", "Nováček", LocalDate.of(1998,7,24)));

        System.out.println(firstGuest.getJmeno()+firstGuest.getPrijmeni()+ "narozena " + firstGuest.getDatumNarozeni());
        System.out.println(secondGuest.getJmeno()+secondGuest.getPrijmeni()+ "narozen " + secondGuest.getDatumNarozeni());

        System.out.println("Číslo pokoje: " + room1.getCisloPokoje()+", počet lůžek: " + room1.getPocetLuzek() + ", je za cenu: "
                + room1.getCenaZaNoc() + " Kč/noc, " + room1.getBalkon() + " " + room1.getVyhledNaMore() );
        System.out.println("Číslo pokoje: " + room2.getCisloPokoje()+", počet lůžek: " + room2.getPocetLuzek() + ", je za cenu: "
                + room2.getCenaZaNoc() + " Kč/noc, " + room2.getBalkon() + " " + room2.getVyhledNaMore() );
        System.out.println("Číslo pokoje: " + room3.getCisloPokoje()+", počet lůžek: " + room3.getPocetLuzek() + ", je za cenu: "
                + room3.getCenaZaNoc() + " Kč/noc, " + room3.getBalkon() + " " + room3.getVyhledNaMore() );

        String firstG = (firstGuest.getJmeno()+firstGuest.getPrijmeni()+"" );
        String secondG = (secondGuest.getJmeno()+secondGuest.getPrijmeni());

        System.out.println("První rezervace: " + firstG + "pokoj č." + room1.getCisloPokoje() +
                " od " + firstRoom.getBookingFrom() + " do " + firstRoom.getBookingUntil());
        System.out.println("Druhá rezervace: " + firstG + "a " + secondG + "pokoj č." + room3.getCisloPokoje() +
                " od " + thirdRoom.getBookingFrom() + " do " + thirdRoom.getBookingUntil());

        System.out.println("Počet rezervací v hotelu: " + listOfBooking.size());

    }
}