package Lab5;

import java.util.Scanner;

/* Program to check if a character entered is lowercase
 */

public class CheckLetter {
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        // Declare variables
        char letter;

        System.out.print("Please enter a character: ");
        letter = keyboard.nextLine().charAt(0);

        if ((letter >= 'a') && (letter <= 'z')) {
            System.out.println("\nThe character '" + letter + "' is a lowercase letter");
        }//if

        else {
            System.out.println("\nThe character '" + letter + "' is not a lowercase letter");
        }//else

    }//main
}//class