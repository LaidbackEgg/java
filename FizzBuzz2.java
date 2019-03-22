package Lab6;

import java.util.Scanner;

public class FizzBuzz2 {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        int start, finish;

        System.out.print("Please enter your start number: ");
        start = keyboard.nextInt();

        System.out.print("Please enter your finish number: ");
        finish = keyboard.nextInt();

        for (int count = start; count <= finish; count +=1 ) {
            if ((count % 3 == 0) || (count % 7 == 0)) {
                if (count % 3 == 0) {
                    System.out.print("FIZZ ");
                }//if
                if (count % 7 == 0) {
                    System.out.print("BUZZ ");
                }//if
                System.out.print("\t\t");
            }//if
            else {
                    System.out.print(count + "\t\t\t");
                }//else
            }//if
    }//main
}//class

