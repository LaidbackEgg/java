package Lab3;

import java.text.DecimalFormat;
//imports Decimal Format utility
import java.util.Scanner;
//imports Scanner utility


/**
 * Created by: George Keddy
 * Created on: 03/10/2018
 * Program to read quantity of people and costs of flights, then calculate totals.
 */

public class HolidayCost {
    public static void main (String [] args) {
        DecimalFormat df = new DecimalFormat("00.00");
        //formats any decimal numbers to two digits from the d.p
        Scanner keyboard = new Scanner(System.in);
        //creates object of the Scanner class to allow values to be entered from the keyboard

        final double VATRATE = 0.20;
        int peopleNumbers;
        double flightCost, transferCost, flightTotal, transferTotal, total;
        //declares variables

        System.out.print("Please enter the number of people traveling: ");
        //prompts the user to enter the number of travelers
        peopleNumbers = keyboard.nextInt();
        //reads how many people are traveling

        System.out.print("Please enter the cost of the first flight: £");
        //prompts the user to enter the cost of the first flight
        flightCost = keyboard.nextDouble();
        //reads what the user enters for the first flight cost

        System.out.print("Please enter the cost of the transfer flight: £");
        //prompts the user to enter the cost of the transfer flight
        transferCost = keyboard.nextDouble();
        //reads what the user enters for the transfer cost

        flightTotal = peopleNumbers*(flightCost*(1 + VATRATE));
        transferTotal = peopleNumbers*(transferCost*(1 + VATRATE));
        total = flightTotal+transferTotal;

        System.out.println("The total cost of flights is: £" + df.format(flightTotal));
        System.out.println("The total cost of transfers is: £" + df.format(transferTotal));
        System.out.println("The total cost is: £" + df.format(total));
        //prints the

    }//main
}//class
