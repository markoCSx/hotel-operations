package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Room r1 = new Room(2);
        Reservation newReservation = new Reservation(LocalDate.parse("2026-11-09"), LocalDate.parse("2026-12-16"), "king");
        Employee e1 = new Employee(11111, "Martin Kolaj", "Redundancy", 21.50);
        e1.punchTimeCard();
        e1.punchTimeCard();
        System.out.println(e1.getTotalPay());
        System.out.println(newReservation.getNumberOfNights());
        System.out.println(newReservation.getPrice());
        System.out.println(newReservation.isWeekend());
        System.out.println(newReservation.getReservationTotal());
        Hotel transylvania = new Hotel("Hotel Transylvania", 1, 1);
        System.out.println(transylvania.getAvailableRooms());
        System.out.println(transylvania.getAvailableSuites());
        transylvania.bookRoom(1, true);
        transylvania.bookRoom(1, false);
        System.out.println(transylvania.getAvailableRooms());
        System.out.println(transylvania.getAvailableSuites());
    }
}
