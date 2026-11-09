package com.pluralsight;

public class Employee {
    private long employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee (long employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    public void setHoursWorked (double hoursWorked) {
        this.hoursWorked = hoursWorked;
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
        return this.hoursWorked - 40;
    }
}
