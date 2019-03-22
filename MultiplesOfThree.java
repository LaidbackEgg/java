package Lab6;
import java.util.Scanner;
/**
 * Created by:
 * Created on:
 * Program to read in numbers and output if they are
 * multiples of three
 */
public class MultiplesOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int TERMINATOR = -999;
        int number, noOfMultiples = 0, count = 0;
        System.out.print("Enter the first number: ");
        number = keyboard.nextInt();
        while (number != TERMINATOR) {
            if (number % 3 == 0) {
                System.out.println(number + " is a multiple of 3");
                noOfMultiples = noOfMultiples + 1;
            }//if
            else {
                System.out.println(number + " is not a multiple of 3");
            }//else
            count = count + 1;
            System.out.print("Enter a number (or -999 to finish): ");
            number = keyboard.nextInt();
        }//while
        System.out.println("\n" + count + " numbers were entered");
        System.out.println(noOfMultiples + " were multiples of 3");
    }//main
}//class