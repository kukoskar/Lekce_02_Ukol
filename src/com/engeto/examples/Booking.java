package com.engeto.examples;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {

        private Room room1, room2, room3;
        private Guest firstGuest, secondGuest;
        private List<Guest> listOfBooking = new ArrayList<>();

        private LocalDate bookingFrom;
        private LocalDate bookingUntil;
        private String typeOfVacation;

        public Booking(Room room1, Guest firstGuest, LocalDate bookingFrom, LocalDate bookingUntil, String typeOfVacation) {
                this.room1 = room1;
                this.firstGuest = firstGuest;
                this.bookingFrom = bookingFrom;
                this.bookingUntil = bookingUntil;
                this.typeOfVacation = typeOfVacation;
        }

        public Booking(Room room2) {
                this.room2 = room2;

        }

        public Booking(Room room3, Guest firstGuest, Guest secondGuest, LocalDate bookingFrom, LocalDate bookingUntil, String typeOfVacation) {
                this.room3 = room3;
                this.firstGuest = firstGuest;
                this.secondGuest = secondGuest;
                this.bookingFrom = bookingFrom;
                this.bookingUntil = bookingUntil;
                this.typeOfVacation = typeOfVacation;
        }

        //region Metody
        public Room getRoom1() {
                return room1;
        }

        public void setRoom1(Room room1) {
                this.room1 = room1;
        }

        public Room getRoom2() {
                return room2;
        }

        public void setRoom2(Room room2) {
                this.room2 = room2;
        }

        public Room getRoom3() {
                return room3;
        }

        public void setRoom3(Room room3) {
                this.room3 = room3;
        }

        public Guest getFirstGuest() {
                return firstGuest;
        }

        public void setFirstGuest(Guest firstGuest) {
                this.firstGuest = firstGuest;
        }

        public Guest getSecondGuest() {
                return secondGuest;
        }

        public void setSecondGuest(Guest secondGuest) {
                this.secondGuest = secondGuest;
        }

        public List<Guest> getListOfBooking() {
                return listOfBooking;
        }

        public void setListOfBooking(List<Guest> listOfBooking) {
                this.listOfBooking = listOfBooking;
        }

        public LocalDate getBookingFrom() {
                return bookingFrom;
        }

        public void setBookingFrom(LocalDate bookingFrom) {
                this.bookingFrom = bookingFrom;
        }

        public LocalDate getBookingUntil() {
                return bookingUntil;
        }

        public void setBookingUntil(LocalDate bookingUntil) {
                this.bookingUntil = bookingUntil;
        }

        public String getTypeOfVacation() {
                return typeOfVacation;
        }

        public void setTypeOfVacation(String typeOfVacation) {
                this.typeOfVacation = typeOfVacation;
        }
        //endregion

}


