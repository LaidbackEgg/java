package Lab5;

import java.util.Scanner;

/**
 * Created by: George Keddy
 * Created on: 10/10/2018
 * Program to test whether the user's number is great to the constant (or not greater)
 */

public class TestNumber2 {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        int usersNumber;
        final int constantNumber = 0;

        System.out.print("Please enter a number ");
        usersNumber = keyboard.nextInt();

        if (usersNumber < constantNumber) {
            System.out.print("The number " + usersNumber + " is less than " + constantNumber);
        }
        else {
            if (usersNumber == constantNumber) {
            System.out.print("The number " + usersNumber + " is equal to " + constantNumber);
            }
            else {
                System.out.print("The number " + usersNumber + " is greater then " + constantNumber);
                }
        }
    }
}
