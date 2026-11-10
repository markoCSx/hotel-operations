package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testPunchTimeCard() {
        //Arrange
        Employee e1 = new Employee(11111, "Martin Kolaj", "Redundancy", 21.50);
        e1.punchTimeCard();
        //Test
        e1.punchTimeCard(LocalTime.now().plusHours(8));
    }
}