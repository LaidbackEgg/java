package Lab3;

import java.util.Scanner;
//imports Scanner utility

/**
 * Created by: George Keddy
 * Created on: 03/10/2018
 * Program to read double values from the keyboard and print them out
 */

public class ReadDoubleVariables {
    public static void main (String [] args) {

        Scanner keyboard = new Scanner(System.in);
        //creates object of the Scanner class to allow values to be entered from the keyboard

        double price1, price2;
        //declares two double variables

        System.out.print("Please enter a value for price 1: ");
        //prompts the user to enter a value
        price1 = keyboard.nextDouble();
        //reads what the user enters to the price1 variable

        System.out.print("Please enter a value for price 2: ");
        //prompts the user to enter a value
        price2 = keyboard.nextDouble();
        //reads what the user enters to the price2 variable

        System.out.println("The value entered for price 1 is: " + price1);
        System.out.println("The value entered for price 2 is " + price2);
        //prints the values entered by the user

    }//main
}//class
