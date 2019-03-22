package Lab9;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by
 * Created on
 * Program to repeatedly enter a number, then display a menu of choices to
 * allow the user to: test if the number is 0, find the square root of the number, or
 * test if the number is odd or even
 */

public class NumberMenu2 {

    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    // Method to test if a number is zero and output a suitable message
    public static void testZero(int num) {
        final int ZERO = 0;

        // Test value and output suitable message
        if (num > ZERO) {
            System.out.println("The number " + num + " is greater than " + ZERO);
        }//if
        else {
            if (num == ZERO) {
                System.out.println("The number " + num + " is equal to " + ZERO);
            }//if
            else {
                System.out.println("The number " + num + " is less than " + ZERO);
            }//else
        }//else
    }//TestZero

    // Method to find and display the square root of a number
    public static void squareRoot(int num) {
        if (num >= 0) {
            System.out.println("The square root of " + num + " = " +
                    df.format(Math.sqrt(num)));
        }//if
        else {
            System.out.println("This number has no square root");
        }//else
    }//SquareRoot

    // Method to test if a number is odd or even and display a suitable message
    public static void oddOrEven(int num) {
        System.out.print("\n" + num);
        if (num % 2 == 0) {
            System.out.println(" is an even number");
        }//if
        else {
            System.out.println(" is an odd number");
        }//else
    }//OddOrEven

    public static void main(String[] args) {
        int choice, number;
        char response = 'Y';

        do {
            // Prompt for and read in an integer value
            System.out.print("\nEnter an integer value: ");
            number = keyboard.nextInt();

            do {
                // Display menu
                System.out.println("\n1.  Test if Zero");
                System.out.println("2.  Find Square Root");
                System.out.println("3.  Test if Odd or Even");
                System.out.println("4.  Enter Another Number or Exit");
                System.out.print("\nPlease enter your choice: ");
                choice = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println();
                switch (choice) {
                    case 1:
                        testZero(number);
                        break;
                    case 2:
                        squareRoot(number);
                        break;
                    case 3:
                        oddOrEven(number);
                        break;
                    case 4:
                        System.out.print("Do you want to enter another number (Y/N)? ");
                        response = keyboard.nextLine().charAt(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }//switch
            } while (choice != 4);
        } while ((response == 'Y') || (response == 'y'));

    }//main
}//class
