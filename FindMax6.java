package Lab8;

import java.util.*;

/**
 *
 */

public class FindMax6 {
    static Scanner keyboard = new Scanner(System.in);

    public static int getNumber() {
        System.out.println("Please enter a number: ");
        return keyboard.nextInt();
    }//get number

    public static int max(int num1, int num2) {
        int larger;
        if (num1 > num2) {
            larger = num1;
        }//if
        else {
            larger = num2;
        }//else
        return larger;
    }//max

    public static void printAnswer(int num) {
        System.out.println(num + " is the larger number");
    }//printAnswer

    public static void main(String [] args) {
        int number1, number2;

        number1 = getNumber();
        number2 = getNumber();
        printAnswer(max(number1,number2));

//        number1 = getNumber();
//        number2 = getNumber();
//        printAnswer(max(number1,number2));
    }//main
}//class
