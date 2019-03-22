package Lab6;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by:
 * Created on:
 * Program to read in a list of numbers, add them and output their total
 */
public class AddNumbers4 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        final int TERMINATOR = -999;
        int number, total = 0, count = 0;
        double average;

        System.out.print("Enter the first number: ");
        number = keyboard.nextInt();
        while (number != TERMINATOR) {
            total = total + number;
            System.out.print("Enter a number (or -999 to finish): ");
            number = keyboard.nextInt();
            count = count + 1;
        }//while

        average = (double) total/count;

        System.out.println("\nThe total of these number is " + total);
        System.out.println("\nThe total number of numbers entered is " + count);
        System.out.println("\nThe average of these numbers is " + df.format(average));

    }//main
}//class