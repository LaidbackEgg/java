package Lab5;

import java.util.Scanner;

/**
 * Created by: George Keddy
 * Created on: 10/10/2018
 * Program will ask the user to guess a number and let them know if it was right or wrong
 */

public class GuessNumber {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        int usersNumber;
        final int computersNumber = 10;

        System.out.print("Please enter a number as your guess: ");
        usersNumber = keyboard.nextInt();

        while(usersNumber != computersNumber){
            System.out.print("Wrong! Try again.");
            usersNumber = keyboard.nextInt();
        }
        System.out.print("Well done, you've guessed correctly.");

        /**
        if (usersNumber == computersNumber){
            System.out.print("Well done, you've guessed correctly.");
        }
        else {
            System.out.print("Wrong! Try again.");
        }
         **/
    }
}
