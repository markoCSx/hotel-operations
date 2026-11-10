package com.pluralsight;

public class Room {
    int numberOfBeds;
    boolean occupied;
    boolean clean;


    public Room (int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        this.clean = true;
    }

    public boolean cleanRoom () {
        if (!occupied) {
            this.clean = true;
            System.out.println("Room is clean");
            return clean;
        } else {
            System.out.println("Room is occupied");
            return clean;
        }
    }

    public boolean checkIn () {
        if (occupied || isDirty()) {
            System.out.println("Room is unavailable");
            return false;
        }
        this.occupied = true;
        this.clean = false;
        System.out.println("Checked in complete");
        return true;
    }

    public boolean checkOut () {
        if (occupied) {
            this.occupied = false;
            System.out.println("Room has been checked out");
            return !this.occupied;
        } else {
            System.out.println("No one is checked into that room");
            return this.occupied;
        }
    }

    public int getNumberOfBeds () {
        return this.numberOfBeds;
    }

    public boolean isDirty () {
        System.out.println("Room is dirty: " + !this.clean);
        return !this.clean;
    }

    public boolean isAvailable () {
        System.out.println("Room is available: " + !this.occupied);
        return !this.occupied;
    }

}
