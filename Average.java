package Lab6;

import java.util.Scanner;

/**
 * Created by: George Keddy
 * Created on: 12/10/2018
 * Program to
 */

public class Average {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        double average;
        int howMany = 0;
        int number, total = 0;

        System.out.print("How many numbers would you like to add together? ");
        howMany = keyboard.nextInt();

        for (int count = 0; count < howMany; count++) {
            System.out.print("Enter a number: ");
            number = keyboard.nextInt();
        }//for
        average = (double) total/howMany;
        System.out.println("The total is " + total + " and the average is " + average);
    }
}
