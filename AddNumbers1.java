package Lab6;

import java.util.Scanner;

/**
 * Created by: George Keddy
 * Created on: 12/10/2018
 * Program to add 3 sets of numbers and display the total
 */

public class AddNumbers1 {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        int howMany = 0;
        int number, total = 0;

        System.out.println("How many numbers would you like to add together?");
        howMany = keyboard.nextInt();

        for (int count = 0; count < howMany; count++) {
            System.out.print("Enter a number : ");
            number = keyboard.nextInt();
            total = total + number;
        }//for

        System.out.println("\nThe total of the numbers is " + total);
    }
}
