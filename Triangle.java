package Lab9;

import java.util.*;

/**
 * Created by
 * Created on
 * Program to read in 3 non-decreasing integer values and output the type of triangle they create
 */

public class Triangle {

    static Scanner keyboard = new Scanner(System.in);

    // Method to read in and return an integer
    public static int readInteger(String text) {
        System.out.print("Enter the length of the " + text + ": ");
        return keyboard.nextInt();
    }//readInteger

    // Method to check for the type of triangle
    public static String checkTriangle(int num1, int num2, int num3) {
        String type;

        if ((num1 + num2) > num3) {
            // Determine the nature of the triangle
            if (num1 == num3) {
                type = "an equilateral";
            }//if
            else {
                if ((num1 == num2) || (num2 == num3)) {
                    type = "an isosceles";
                }//if
                else {
                    type = "a scalene";
                }//else
            }//else
        }//if
        else {
            type = "not a";
        }//else
        return type;
    }//checkTriangle

    public static void main(String[] args) {

        int side1, side2, side3;

        // Get three values from the user
        side1 = readInteger("shortest side");
        side2 = readInteger("next side");
        side3 = readInteger("longest side");

        // Test and output type of triangle
        System.out.println("This is " + checkTriangle(side1, side2, side3) + " triangle");

    }//main
}//class
