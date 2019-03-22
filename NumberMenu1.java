package Lab6;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by:
 * Created on:
 * Program to repeatedly enter a number, then display a menu of choices to
 * allow the user to test if the number is 0, find the square root of the number, or
 * test if the number is odd or even
 */

public class NumberMenu1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        final int ZERO = 0;
        int choice, number;
        char response = 'Y';

        do {
            //Prompt for and read in an integer value
            System.out.print("\nEnter an integer value: ");
            number = keyboard.nextInt();

            do {
                //Display menu
                System.out.println("\n1. Test if Zero");
                System.out.println("2. Find Square Root");
                System.out.println("3. Test if Odd or Even");
                System.out.println("4. Enter Another Number or Exit");
                System.out.print("\nPlease enter your choice: ");
                choice = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println();
                switch (choice) {
                    case 1:
                        // Test if value = 0 and output suitable message
                        if (number > ZERO) {
                            System.out.println("The number " + number + " is greater than " + ZERO);
                        }//if
                        else {
                            if (number == ZERO) {
                                System.out.println("The number " + number + " is equal to " + ZERO);
                            }//if
                            else {
                                System.out.println("The number " + number + " is less than " + ZERO);
                            }//else
                        }//else
                        break;
                    case 2:
                        // Output the square root
                        if (number >= 0) {
                            System.out.println("The square root of " + number + " = " + df.format(Math.sqrt(number)));
                        }//if
                        else {
                            System.out.println("This number has no square root");
                        }//else
                        break;
                    case 3:
                        // Test if odd or even and output suitable message
                        System.out.print(number);
                        if (number % 2 == 0) {
                            System.out.println(" is an even number");
                        }//if
                        else {
                            System.out.println(" is an odd number");
                        }//else
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