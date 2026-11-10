package com.pluralsight;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void testcleanRoom() {
        //Arrange
        Room r1 = new Room(5);
        r1.checkIn();
        //Test if room will be clean if checkedIn
        Assertions.assertNotEquals(true, r1.cleanRoom());
        //Test if room will be clean if checkedOut
        r1.checkOut();
        Assertions.assertEquals(true, r1.cleanRoom());
    }

    @org.junit.jupiter.api.Test
    void testCheckIn() {
        //Arrange
        Room r1 = new Room(5);
        r1.checkIn();
        //Test if can check in twice
        Assertions.assertEquals(false, r1.checkIn());
    }

    @org.junit.jupiter.api.Test
    void testCheckOut() {
        //Arrange
        Room r1 = new Room(5);
        //test if checkOut works with nobody checked in
        assertEquals(false, r1.checkOut());
        //test if checkOut works normally
        r1.checkIn();
        assertEquals(true, r1.checkOut());
    }

    @org.junit.jupiter.api.Test
    void getNumberOfBeds() {
        //Arrange
        Room r1 = new Room(5);
        //test if number of beds = constructor
        assertEquals(5, r1.getNumberOfBeds());
        //test if change is possible
        r1 = new Room(6);
        assertNotEquals(5, r1.getNumberOfBeds());
    }

    @org.junit.jupiter.api.Test
    void testIsDirty() {
        //Arrange
        Room r1 = new Room(5);
        //test if room is dirty in a brand new room
        assertEquals(false, r1.isDirty());
        //test if room is dirty if room is clean
        r1.clean = false;
        assertEquals(true, r1.isDirty());
    }

    @org.junit.jupiter.api.Test
    void testIsAvailable() {
        //Arrange
        Room r1 = new Room(5);
        //test if available from start
        assertEquals(true, r1.isAvailable());
        //test if available if checkedIn
        r1.checkIn();
        assertNotEquals(true, r1.isAvailable());
    }
}