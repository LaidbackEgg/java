package Lab6;
import java.util.Scanner;

/**
 * Created by:
 * Created on:
 * Program to read in a number and print out the factors of that
 number
 */

public class Factors {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number, count = 1;
        System.out.print("Enter a positive number : ");
        number = keyboard.nextInt();
        while (count <= number) {
            if ((number % count) == 0) {
                System.out.println(count);
            }//if
            count = count + 1;
        }//while
    }//main
}//class