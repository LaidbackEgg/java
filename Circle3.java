package Lab8;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 */

public class Circle3 {
    static double radius;

    public static double getCircumference() {
        double answer;
        answer = 2 * Math.PI * radius;
        return answer;
    } //getCircumference

    public static double getArea () {
        return Math.PI * Math.pow (radius, 2);
    } //getArea

    public static void main(String [] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner(System.in);

        double circumference, area;

        System.out.print("Enter the radius of the circle (in cms):");
        radius = keyboard.nextDouble();

        circumference = getCircumference();

        area = getArea();

        System.out.println("The circumference is " + df.format(circumference) + " cms");
        System.out.println("The area is " + df.format(area) + " cm squared");
    }
}
