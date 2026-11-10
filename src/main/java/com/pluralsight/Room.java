package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private boolean occupied;
    private boolean clean;


    public Room (int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        this.clean = true;
    }

    public boolean cleanRoom () {
        this.clean = true;
        return clean;
    }

    public boolean checkIn () {
        if (occupied || isDirty()) {
            System.out.println("Room is unavailable");
            return false;
        }
        this.occupied = true;
        this.clean = false;
        return true;
    }

    public boolean checkOut () {
        this.occupied = false;
        return !this.occupied;
    }

    public int getNumberOfBeds () {
        return this.numberOfBeds;
    }

    public boolean isDirty () {
        return !this.clean;
    }

    public boolean isAvailable () {
        return !this.occupied;
    }

}
