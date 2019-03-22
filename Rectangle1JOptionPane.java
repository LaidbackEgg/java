package Lab2;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by:
 * Created on:
 * Program to calculate and print out the perimeter and
 * area of a rectangle
 */

public class Rectangle1JOptionPane {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        // Declare 4 variables to hold length,
        // breadth, perimeter and area
        double length, breadth, area, perimeter;
        // Assign values to length and breadth
        length = 24.7;
        breadth = 25.9;
        // Calculate and store the area and perimeter
        area = length * breadth;
        perimeter = (length + breadth) * 2.0;
        JOptionPane.showMessageDialog(
                null, "Rectangle length = " + df.format(length) + "\n"
                        +
                        "Rectangle breadth = " + df.format(breadth) + "\n\n" +
                        "Rectangle Area = " + df.format(area) + "\n" +
                        "Rectangle Perimeter = " + df.format(perimeter));
    }//main
}//class