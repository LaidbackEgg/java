package Lab1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodOverloading {

    public static double calculateArea(double a) {
        double area; double s;
        s = 0.5 * (a + a + a);
        area = Math.sqrt(s*(s-a)*(s-a)*(s-a));
        return area;
    }//calculateArea

    public static double calculateArea(double a, double b) {
        double area;
        area=(b/4)*Math.sqrt((4*a*a)-(b*b));
        return area;
    }//calculateArea

    public static double calculateArea(double a, double b, double c) {
        double area; double s;
        s = 0.5 * (a + b + c);
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }//calculateArea

    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double equilateralside;
        double isoscelessideA, isoscelessideB;
        double scalenesideA, scalenesideB = 0, scalenesideC = 0;

        System.out.println("Equilateral Triangle");
        System.out.println("********************");
        System.out.print("Enter the length any one of the sides of the equilateral triangle: ");
        equilateralside = keyboard.nextInt();
        System.out.println("The area of the triangle is " + df.format(calculateArea(equilateralside)) + " units squared\n");

        System.out.println("Isosceles Triangle");
        System.out.println("********************");
        System.out.print("Enter the length of the sides with the same length from the isosceles triangle: ");
        isoscelessideA = keyboard.nextInt();
        System.out.print("Enter the length of the base of the isosceles triangle: ");
        isoscelessideB = keyboard.nextInt();
        System.out.println("The area of the triangle is " + df.format(calculateArea(isoscelessideA, isoscelessideB)) + " units squared\n");

        System.out.println("Scalene Triangle");
        System.out.println("********************");
        System.out.print("Enter the length of the first side of the scalene triangle: ");
        scalenesideA = keyboard.nextInt();
        System.out.print("Enter the length of the second side of the scalene triangle: ");
        scalenesideA = keyboard.nextInt();
        System.out.print("Enter the length of the third side of the scalene triangle: ");
        scalenesideA = keyboard.nextInt();
        System.out.println("The area of the triangle is " + df.format(calculateArea(scalenesideA, scalenesideB, scalenesideC)) + " units squared\n");
    }
}


// Area of triangle = √(s(s-a)(s-b)(s-c)) where s is half the sum of the sides a, b and c.