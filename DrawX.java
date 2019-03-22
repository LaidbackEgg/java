package Lab8;

/**
 * Created by
 * Created on
 * Program to draw an X using asterisks
 */

public class DrawX {

    // Method to draw two * separated by 4 tabs
    public static void drawOuter() {
        System.out.println("*\t\t\t\t*");
    }//drawOuter

    // Method to draw two * separated by 2 tabs
    public static void drawInner() {
        System.out.println("\t*\t\t*\t");
    }//drawInner

    // Method to draw one *
    public static void drawMiddle() {
        System.out.println("\t\t*\t\t");
    }//drawOuter

    public static void main(String[] args) {
        drawOuter();
        drawInner();
        drawMiddle();
        drawInner();
        drawOuter();
    }//main
}//class
