package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private boolean occupied;
    private boolean clean;


    public Room (int numberOfBeds, boolean occupied, boolean clean) {
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.clean = clean;
    }

    public void cleanRoom () {
        this.clean = true;
    }

    public void checkIn () {
        this.occupied = true;
        this.clean = false;
    }

    public void checkOut () {
        this.occupied = false;
    }

    public int getNumberOfBeds () {
        return this.numberOfBeds;
    }

    public boolean isDirty () {
        if (this.clean) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isAvailable () {
        if (this.occupied) {
            return false;
        } else {
            return true;
        }
    }

}
