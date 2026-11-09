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

    public void setClean (boolean clean) {
        this.clean = clean;
    }

    public int getNumberOfBeds () {
        return this.numberOfBeds;
    }

    public void setOccupied (boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty () {
        if (this.clean) {
            return true;
        } else {
            return false;
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
