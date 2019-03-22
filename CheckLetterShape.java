package Lab5;

import java.util.Scanner;

/**
 * Created by: George Keddy
 * Created on: 03/10/2018
 * Program to read the user's inputted letter and describe it
 */

public class CheckLetterShape {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        char upperCaseLetter = 0;
        String letterDesc;
        char upperCase;

        System.out.println("Please enter a capital letter: ");
        upperCaseLetter = keyboard.nextLine().charAt(0);
        upperCase = Character.toUpperCase(upperCaseLetter);

        switch (upperCase) {
            case 'A': case 'E': case 'F': case 'H': case 'I': case 'K': case 'L': case 'M': case 'N': case 'T': case 'V': case 'W': case 'X': case 'Y': case 'Z':
                letterDesc = "Straight";
            case 'C': case 'O': case 'S':
                letterDesc = "Curved";
            case 'B': case 'D': case 'G': case 'J': case 'P': case 'Q': case 'R': case 'U':
                letterDesc = "Mixture";

        System.out.println("You entered the letter " + upperCase + " which is a " + letterDesc + " letter.");
        }
    }
}
