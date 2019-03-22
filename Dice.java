package Lab7;

import java.util.Scanner;

/**
 * Created by George Keddy
 * Created on 17/10/2018
 * Program to print two random results from virtual dice
 */

public class Dice {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        int die1, die2;
        char response;

        do {
            die1 = (int) ((Math.random() * 6) +1);
            die2 = (int) ((Math.random() * 6) +1);
            System.out.println("The numbers are " + die1 + " and " + die2);
            System.out.print("Do you want to continue (Y/N)? ");
            response = keyboard.nextLine().charAt(0);
        } while (response == 'Y');
    }
}
