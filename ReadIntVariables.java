package Lab3;

import java.util.Scanner;
//imports Scanner utility

/**
 * Created by: George Keddy
 * Created on: 03/10/2018
 * Program to read integer values from the keyboard and print them out
 */

public class ReadIntVariables {
    public static void main (String [] args) {

        Scanner keyboard = new Scanner(System.in);
        //creates object of the Scanner class to allow values to be entered from the keyboard

        int length, breadth;
        //declares two integer variables

        System.out.println("Please enter a value for length");
        //prompts the user to enter the value of length
        length = keyboard.nextInt();
        //reads what the user enters to the length variable

        System.out.println("Please enter a value for breadth");
        //prompts the user to enter the value of breadth
        breadth = keyboard.nextInt();
        //reads what the user enters to the breadth variable

        System.out.println("The value entered for length is " + length);
        System.out.println("The value entered for breadth is " + breadth);
        //prints the values entered by the user

    }//main
}//class
