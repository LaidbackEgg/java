package Lab5;

import java.util.Scanner;

/**
 * Created by: George Keddy
 * Created on: 10/10/2018
 * Program to test whether the user's number is great to the constant (or not greater)
 */

public class TestNumber {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        int usersNumber;
        final int constantNumber = 20;

        System.out.print("Please enter a whole number ");
        usersNumber = keyboard.nextInt();

        if (usersNumber > constantNumber) {
            System.out.print("The number " + usersNumber + " is greater than " + constantNumber);
        }
        else {
            System.out.print("The number " + usersNumber + " is not greater than " + constantNumber);
        }
    }
}
