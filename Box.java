package Lab2;

/**
 * Created by: George Keddy
 * Created on: 28/09/2018
 * Program will calculate, store and output the perimeter and volume of a box
 */

public class Box {
    public static void main (String [] args) {
        // box 1
        int height1, width1, depth1, volume, perimeter;
        height1 = 3;
        width1 = 4;
        depth1 = 5;

        volume = (height1 * width1 * depth1);
        perimeter = 4*(height1*width1*depth1);

        System.out.print("The box is " + height1 + "cm high, ");
        System.out.println(+ width1 + "cm wide and " + depth1 + "cm deep");

        System.out.println("The volume of the box is " + volume + "cms cubed");

        System.out.print("The perimeter of the box is " + perimeter + "cms");
        System.out.println();
        System.out.println();

        // box 2
        int height2, width2, depth2;
        height2 = 4;
        width2 = 4;
        depth2 = 4;

        volume = (height2 * width2 * depth2);
        perimeter = (4 * height2 + 4 * width2 + 4 * depth2);

        System.out.print("The box is " + height2 + "cm high, ");
        System.out.println(+ width2 + "cm wide and " + depth2 + "cm deep");

        System.out.println("The volume of the box is " + volume + "cms cubed");

        System.out.print("The perimeter of the box is " + perimeter + "cms");
        System.out.println();
        System.out.println();

        // box 3
        int height3, width3, depth3;
        height3 = 20;
        width3 = 25;
        depth3 = 30;

        volume = (height3 * width3 * depth3);
        perimeter = (4 * height3 + 4 * width3 + 4 * depth3);

        System.out.print("The box is " + height2 + "cm high, ");
        System.out.println(+ width3 + "cm wide and " + depth3 + "cm deep");

        System.out.println("The volume of the box is " + volume + "cms cubed");

        System.out.print("The perimeter of the box is " + perimeter + "cms");
        System.out.println();
    }
}
