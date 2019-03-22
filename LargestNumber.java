package Lab6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by
 * Created on
 * Program to
 */

public class LargestNumber {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        final int TERMINATOR = -999;
        int number, largest = 0;

        System.out.print("Enter the first number: ");
        number = keyboard.nextInt();

        while (number != TERMINATOR) {
            if (number > largest) {
                largest = number;
            }
            System.out.print("Enter a number (or -999 to finish): ");
            number = keyboard.nextInt();
        }//while

        System.out.println("\nThe largest number entered was " + largest);

    }//main
}//class


