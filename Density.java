package Lab2;

import java.text.*;

/**
 * Created by:
 * Created on:
 * Program to calculate and output the diameter, circumference and
 area of a
 * circle given the radius
 */

public class Density {
    public static void main(String[] args) {
        DecimalFormat df1 = new DecimalFormat("0.0");
        DecimalFormat df2 = new DecimalFormat("0.00");
        // Declare and initialise the mass and volume
        double mass = 40;
        double volume = 8;
        // Declare variables
        double density;
        // Calculate density
        density = mass / volume;
        // Output results
        System.out.println("Mass = " + df1.format(mass) + " kg");
        System.out.println("Volume = " + df1.format(volume) + " metres cubed");
                System.out.println("Density = " + df2.format(density) + " kg per metre cubed");
    }//main
}//class