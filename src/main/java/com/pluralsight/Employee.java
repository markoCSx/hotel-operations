package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

public class Employee {
    private long employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private LocalTime punchInTime;
    private int timeCard = 1;

    public Employee (long employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    public void punchTimeCard () {
        switch (timeCard) {
            case 1 -> {
                punchInTime = LocalTime.now();
                timeCard++;
            }
            case 2 -> {
                LocalTime punchOutTime = LocalTime.now().plusHours(8);
                if (punchOutTime.getHour() < punchInTime.getHour()) {
                    hoursWorked += ((punchOutTime.getHour() + 24) - punchInTime.getHour()) + ((punchOutTime.getMinute() - punchInTime.getMinute()) / 60.0);
                } else {
                    hoursWorked += (punchOutTime.getHour() - punchInTime.getHour()) + ((punchOutTime.getMinute() - punchInTime.getMinute()) / 60.0);
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
