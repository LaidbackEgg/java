package Lab5;

import java.util.Scanner;

/**
 * Created by: George Keddy
 * Created on: 10/10/2018
 * Program to tell the user if their entered number is odd or even.
 */

public class OddOrEven {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner (System.in);

        int usersNumber = 0;

        System.out.print("Please enter a number. ");
        usersNumber = keyboard.nextInt();

        if (usersNumber % 2 == 0) {
            System.out.print("You've entered an even number.");
        }
        else {
            System.out.println("You've entered an odd number.");
        }
    }

}
