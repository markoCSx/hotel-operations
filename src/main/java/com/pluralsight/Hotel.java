package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel (String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel (String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite) {
        if (suite) {
            if (roomCount <= getAvailableSuites()) {
                this.bookedSuites += roomCount;
                System.out.println(roomCount + " suites have been booked.");
                return true;
            } else {
                System.out.printf("We only have %d suites avaialable", this.numberOfSuites - this.bookedSuites);
                return false;
            }
        } else {
            if (roomCount <= getAvailableRooms()) {
                this.bookedBasicRooms += roomCount;
                System.out.println(roomCount + " basic rooms have been booked.");
                return true;
            } else {
                System.out.printf("We only have %d basic rooms avaialable", this.numberOfRooms - this.bookedBasicRooms);
                return false;
            }
        }
    }

    public int getAvailableSuites () {
        return this.numberOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms () {
        return this.numberOfRooms - this.bookedBasicRooms;
    }

}
