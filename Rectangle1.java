package Lab2;

/**
 * Created by: George Keddy
 * Created on: 28/09/2018
 * Program will calculate, store and output the area and perimeter of a rectangle
 */

import java.text.DecimalFormat;

public class Rectangle1 {
    public static void main (String [] args) {
        DecimalFormat df = new DecimalFormat("00.00");

        int length1, breadth1, area1, perimeter1;
        double length2, length3, breadth2, breadth3, area2, area3, perimeter2, perimeter3;

        // rectangle 1
        length1 = 10;
        breadth1 = 20;

        area1 = (length1*breadth1);
        perimeter1 = 2*(length1*breadth1);

        System.out.println("Rectangle length = " + length1);
        System.out.println("Rectangle breadth = " + breadth1);
        System.out.println("Rectangle Area = " + area1);
        System.out.println("Rectangle Perimeter = " + perimeter1);
        System.out.println();

        // rectangle 2
        length2 = 5.2;
        breadth2 = 4.3;

        area2 = (length2*breadth2);
        perimeter2 = 2*(length2*breadth2);

        System.out.println("Rectangle length = " + df.format(length2));
        System.out.println("Rectangle breadth = " + df.format(breadth2));
        System.out.println("Rectangle Area = " + df.format(area2));
        System.out.println("Rectangle Perimeter = " + df.format(perimeter2));
        System.out.println();

        // rectangle 3
        length3 = 34.55;
        breadth3 = 23.67;

        area3 = (length3*breadth3);
        perimeter3 = 2*(length3*breadth3);

        System.out.println("Rectangle length = " + df.format(length3));
        System.out.println("Rectangle breadth = " + df.format(breadth3));
        System.out.println("Rectangle Area = " + df.format(area3));
        System.out.println("Rectangle Perimeter = " + df.format(perimeter3));
        System.out.println();
    }
}
