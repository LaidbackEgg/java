package Lab2;

import java.sql.SQLOutput;

/**
 * Created by: George Keddy
 * Created on: 28/09/2018
 * Program to swap to already assigned variables
 */

public class SwapNumbers {
    public static void main (String [] args) {
        int number1, number2;
        number1 = 25;
        number2 = 39;
        int temp;

        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);
        System.out.println();

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Value of number1 is now " + number1);
        System.out.println("Value of number2 is now " + number2);
    }//main
}//class
