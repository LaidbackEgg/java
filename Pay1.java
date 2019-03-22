package Lab3;

import java.text.DecimalFormat;
//imports Decimal Format utility
import java.util.Scanner;
//imports Scanner utility

/**
 * Created by: George Keddy
 * Created on: 03/10/2018
 * Program to read the user's name, the hours worked and calculate their wages
 */

public class Pay1 {
    public static void main (String [] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        //formats any decimal numbers to two digits from the d.p
        Scanner keyboard = new Scanner(System.in);
        //creates object of the Scanner class to allow values to be entered from the keyboard

        String firstName, initial, secondName;
        double hoursWorked, wages;
        final double PAYRATE = 5.95;

        System.out.print("Please enter your first name: ");
        firstName = keyboard.nextLine();
        //reads the user's first name

        System.out.print("Please enter your middle initial: ");
        initial = keyboard.nextLine();
        //reads the user's middle initial

        System.out.print("Please enter your last name: ");
        secondName = keyboard.nextLine();
        //reads the user's last name

        System.out.print("How many hours have you worked? ");
        //prompts the user to enter the amount tendered
        hoursWorked = keyboard.nextDouble();
        //reads the tendered amount

        wages = (PAYRATE*hoursWorked);

        System.out.println(firstName+ " " + initial + " " + secondName + " has worked " + hoursWorked + " hours and will receive a wage of £" + df.format(wages));

    }//main
}//class
