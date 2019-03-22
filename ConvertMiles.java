package Lab3;

import java.text.DecimalFormat;
//imports Decimal Format utility
import java.util.Scanner;
//imports Scanner utility

/**
 * Created by: George Keddy
 * Created on: 03/10/2018
 * Program to convert miles into kilometres
 */

public class ConvertMiles {
    public static void main (String [] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        //formats any decimal numbers to two digits from the d.p
        Scanner keyboard = new Scanner(System.in);
        //creates object of the Scanner class to allow values to be entered from the keyboard

        double miles, kilometres;
        final double kilo = 1.609;

        System.out.print("Please enter total miles driven: ");
        miles = keyboard.nextDouble();
        //reads the user's total milage

        kilometres = (miles*kilo);

        System.out.println("You have driven " + df.format(kilometres) + "kms");

    }//main
}//class
