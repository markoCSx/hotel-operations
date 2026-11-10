package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

public class Employee {
    long employeeId;
    String name;
    String department;
    double payRate;
    double hoursWorked;
    LocalTime punchInTime;
    int timeCard = 1;

    public Employee (long employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    public void punchTimeCard () {
        punchTimeCard(LocalTime.now());
    }


    public void punchTimeCard (LocalTime time) {
        switch (timeCard) {
            case 1 -> {
                punchInTime = time;
                timeCard++;
            }
            case 2 -> {
                if (time.getHour() < punchInTime.getHour()) {
                    hoursWorked += ((time.getHour() + 24) - punchInTime.getHour()) + ((time.getMinute() - punchInTime.getMinute()) / 60.0);
                } else {
                    hoursWorked += (time.getHour() - punchInTime.getHour()) + ((time.getMinute() - punchInTime.getMinute()) / 60.0);
                }
                timeCard --;
            }
            default -> {
                System.out.println("Where'd you get that option");
            }
        }
    }

    public double getTotalPay () {
        double totalPay = 0;
        totalPay = (payRate * getRegularHours()) + ((payRate * 1.10) * getOvertimeHours());
        return totalPay;
    }

    public double getRegularHours () {
        return this.hoursWorked - getOvertimeHours();
    }

    public double getOvertimeHours () {
        double overTimeHours = this.hoursWorked - 40;
        if (overTimeHours < 0){
            return 0;
        }
        return overTimeHours;
    }
}
