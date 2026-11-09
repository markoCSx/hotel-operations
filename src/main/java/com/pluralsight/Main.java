package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Room r1 = new Room(2, false, true);
        Reservation newReservation = new Reservation(LocalDate.parse("2026-11-09"), LocalDate.parse("2026-12-16"), "king");
        Employee e1 = new Employee(11111, "Martin Kolaj", "Redundancy", 21.50);
        e1.setHoursWorked(45);
        System.out.println(e1.getTotalPay());
        System.out.println(newReservation.getNumberOfNights());
        System.out.println(newReservation.getPrice());
        System.out.println(newReservation.isWeekend());
        System.out.println(newReservation.getReservationTotal());

    }
}
