package Lab8;

import java.util.Scanner;

/**
 * Program to test various methods without parameters
 */

public class TestMethods1 {

    static Scanner keyboard = new Scanner(System.in);

    // Method to read in and return an integer
    public static int readInteger() {
        System.out.print("Enter a number: ");
        return keyboard.nextInt();
    }//readInteger

    // Method to read in and return a name
    public static String whoAmI() {
        System.out.print("What is your name? ");
        return keyboard.nextLine();
    }//whoAmI

    // Method to read in a number and test if a number has been guessed correctly
    public static boolean goodGuess() {
        final int CORRECTNUMBER = 100;
        int guess;

        guess = readInteger();
        return (guess == CORRECTNUMBER);
    }//goodGuess

    // Method to read in 2 integers and return their sum
    public static int sumOfNumbers() {
        int num1, num2;

        num1 = readInteger();
        num2 = readInteger();
        return num1 + num2;
    }//sumOfNumbers

    // Method to read in 2 integers and return their product
    public static int productOfNumbers() {
        int num1, num2;

        num1 = readInteger();
        num2 = readInteger();
        return num1 * num2;
    }//productOfNumbers

    // Method to read in 2 integers and return the larger
    public static int max() {
        int num1, num2, larger;

        num1 = readInteger();
        num2 = readInteger();
        if (num1 > num2) {
            larger = num1;
        }//if
        else {
            larger = num2;
        }//else
        return larger;
    }//max

    public static void main(String[] args) {
        String name;
        boolean correct;
        int sum, product, largerNumber;

        System.out.println("Testing whoAmI()");
        System.out.println("****************");
        name = whoAmI();
        System.out.println("Your name is " + name + "\n");

        System.out.println("Testing goodGuess()");
        System.out.println("*******************");
        correct = goodGuess();
        if (correct) {
            System.out.println("You have guessed correctly\n");
        }//if
        else {
            System.out.println("You have guessed incorrectly\n");
        }//else

        System.out.println("Testing sumOfNumbers()");
        System.out.println("**********************");
        sum = sumOfNumbers();
        System.out.println("The sum of the two numbers is " + sum + "\n");

        System.out.println("Testing productOfNumbers()");
        System.out.println("**************************");
        product = productOfNumbers();
        System.out.println("The product of the two numbers is " + product + "\n");

        System.out.println("Testing max()");
        System.out.println("*************");
        largerNumber = max();
        System.out.println("The larger of the two numbers is " + largerNumber);
    }//main
}//class
