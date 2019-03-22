package Lab5;

import java.text.DecimalFormat;
//imports Decimal Format utility
import java.util.Scanner;
//imports Scanner utility

/**
 * Created by: George Keddy
 * Created on: 03/10/2018
 * Program to read the user's name, the hours worked and calculate their wages
 */

public class Pay2 {
    public static void main (String [] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner(System.in);

        String employeeName;
        double hoursWorked, normalWage1 = 0, overTime = 0, totalWage;
        final double PAYRATE = 5.95, OVERTIMERATE = 8.50;
        final int OVERTIMEHOURS = 40;

        System.out.print("Please enter your name: ");
        employeeName = keyboard.nextLine();

        System.out.print("How many hours have you worked? ");

        hoursWorked = keyboard.nextDouble();

        if (hoursWorked > OVERTIMEHOURS) {
            overTime = (hoursWorked - OVERTIMEHOURS) * OVERTIMERATE;
            normalWage1 = PAYRATE * OVERTIMEHOURS;
            totalWage = normalWage1 + overTime;
        }
        else {
            totalWage = hoursWorked * PAYRATE;
             }

        System.out.println(employeeName + ", your total pay for this week is: " + "£" + df.format(totalWage));

    }//main
}//class
