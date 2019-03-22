package Lab5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: George Keddy
 * Created on: 10/10/2018
 * Program to calculate the square root of a figure entered by the user.
 */

public class SquareRoot {
    public static void main (String [] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner(System.in);

        int usersNumber = 0;
        double squareRoot = 0;

        System.out.print("Please enter a whole number. ");
        usersNumber = keyboard.nextInt();

        squareRoot = Math.sqrt(usersNumber);

        if (usersNumber >= 0) {
            System.out.print("The square root of " + usersNumber + " = " + df.format(squareRoot));
        }
        else {
            System.out.println("This number has no square root.");
        }
    }

}
