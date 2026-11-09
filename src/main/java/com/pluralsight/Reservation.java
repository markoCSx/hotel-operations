package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private LocalDate startDate;
    private LocalDate endDate;


    public Reservation (LocalDate startDate, LocalDate endDate, String roomType) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomType = roomType;
    }


    public int isWeekend () {
        int weekendDays = 0;
        getNumberOfNights();
        for (int i = 0; i < numberOfNights; i++) {
            if (String.format("%s", this.startDate.getDayOfWeek().plus(i)).equalsIgnoreCase("saturday") || String.format("%s", this.startDate.getDayOfWeek().plus(i)).equalsIgnoreCase("sunday")) {
                weekendDays ++;
            }
        }
        return weekendDays;
    }

    public int getNumberOfNights () {
        int numberOfNights = 0;
        if (this.startDate.getMonthValue() != this.endDate.getMonthValue()) {
            //this.endDate.getMonthValue() -
        }
        for (int i = this.startDate.getDayOfMonth(); i < this.endDate.getDayOfMonth(); i++) {
            numberOfNights ++;
        }
        this.numberOfNights = numberOfNights;
        return numberOfNights;
    }

    public void setNumberOfNights (int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setRoomType (String roomType) {
        this.roomType = roomType;
    }

    public double getPrice () {
        switch (this.roomType) {
            case "king" -> {
                return  139.00;
            }
            case "double" -> {
                return  124.00;
            }
            default -> {
                System.out.println("Room not available");
            }
        }
        return 0;
    }

    public double getReservationTotal () {
        int weekendDays = isWeekend();
        double price = getPrice();
        double newPrice = 0;
        if (weekendDays != 0) {
            newPrice = (weekendDays * (price * 1.10)) + ((this.numberOfNights - weekendDays) * price);
            price = newPrice;
        } else {
            price = price * numberOfNights;
        }
        return price;
    }
}
