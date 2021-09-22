package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an employee's name");
        String employeeName = input.next();
        System.out.println("Enter the number of hours they have worked");
        float employeeHours = input.nextFloat();
        System.out.println("Enter their hourly wage");
        float employeeWage = input.nextFloat();
        float employeePay = 0;
        if (employeeHours > 45) {
            employeePay += (employeeHours - 45) * 1.5 * employeeWage;
            employeePay += 45 * employeeWage;
        } else {
            employeePay += employeeHours * employeeWage;
        }
        System.out.println(employeeName + " gets " + employeeHours + " hours of pay");
        System.out.println("Before taxes, they get " + employeePay);
        System.out.println("After taxes, they get " + employeePay * 0.8);
    }
}
