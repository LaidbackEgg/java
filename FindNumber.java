package Lab7;

import java.util.Scanner;

/**
 * Created by George Keddy
 * Created on 17/10/2018
 * Program to
 */

public class FindNumber {
    public static void main (String [] args) {

        final int CORRECTNUMBER = 5;
        int guess, count = 0;
        do {
            guess = (int) ((Math.random() * 10));
            count = count + 1;
            System.out.println("The number guessed is " + guess);
        } while (guess != CORRECTNUMBER);
        System.out.println("\nIt took " + count + " attempts to guess the number " + CORRECTNUMBER);
    }//main
}//class
