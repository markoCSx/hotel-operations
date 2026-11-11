package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testPunchTimeCard() {
        //Arrange
        Employee e1 = new Employee(11111, "Martin Kolaj", "Redundancy", 21.50);
        LocalTime now = LocalTime.now();
        //Test totalpay with no changes
        assertEquals(0, e1.getTotalPay());
        //test checkIn
        e1.punchTimeCard(now);
        assertEquals(0, e1.getTotalPay());
        //test checkOut
        e1.punchTimeCard(now.plusHours(8));
        assertEquals(8 * 21.50, e1.getTotalPay());
        //test checkOut if worked overtime 48 hours
        e1.punchTimeCard(now);
        e1.punchTimeCard(now.plusHours(8));
        e1.punchTimeCard(now);
        e1.punchTimeCard(now.plusHours(8));
        e1.punchTimeCard(now);
        e1.punchTimeCard(now.plusHours(8));
        e1.punchTimeCard(now);
        e1.punchTimeCard(now.plusHours(8));
        e1.punchTimeCard(now);
        e1.punchTimeCard(now.plusHours(8));
        assertEquals((40*21.50) + (8 * (21.50 * 1.10)), e1.getTotalPay());
    }
}