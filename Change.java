package Lab3;

import java.text.DecimalFormat;
//imports Decimal Format utility
import java.util.Scanner;
//imports Scanner utility

/**
 * Created by: George Keddy
 * Created on: 03/10/2018
 * Program to read the cost of an item, read the amount tendered then calculate the change
 */

public class Change {
    public static void main (String [] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        //formats any decimal numbers to two digits from the d.p
        Scanner keyboard = new Scanner(System.in);
        //creates object of the Scanner class to allow values to be entered from the keyboard

        double costOfItem, moneyTendered, changeDue;

        System.out.print("Amount Due: £");
        //prompts the user to enter the total cost
        costOfItem = keyboard.nextDouble();
        //reads the chargeable cost

        System.out.print("Amount Tendered: £");
        //prompts the user to enter the amount tendered
        moneyTendered = keyboard.nextDouble();
        //reads the tendered amount

        changeDue = (moneyTendered-costOfItem);

        System.out.println("Change Due: £" + df.format(changeDue));

    }//main
}//class
