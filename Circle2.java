package Lab3;

import java.text.DecimalFormat;
//imports Decimal Format utility
import java.util.Scanner;
//imports Scanner utility


/**
 * Created by: George Keddy
 * Created on: 03/10/2018
 * Program to read the radius of a circle and provide auto-calculations for dia, circum and area
 */

public class Circle2 {
    public static void main (String [] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        //formats any decimal numbers to two digits from the d.p
        Scanner keyboard = new Scanner(System.in);
        //creates object of the Scanner class to allow values to be entered from the keyboard

        double diameter, circumference, area, radius;

        System.out.print("Please enter the radius: ");
        //prompts the user to enter the radius
        radius = keyboard.nextDouble();

        diameter = 2 * radius;
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("The radius is " + df.format(radius) + "cms");
        System.out.println("The diameter is " + df.format(diameter) + "cms");
        System.out.println("The circumference is " + df.format(circumference) + "cms");
        System.out.println("The area is " + df.format(area) + "cms squared");

    }//main
}//class
