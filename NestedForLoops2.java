package Lab6;

/**
 * Created by
 * Created on
 * Program to
 */

public class NestedForLoops2 {

    public static void main(String[] args) {

        final int MAX = 5;

        for (int count = 1; count <= MAX; count++) {

            // print out the required number of tabs
            for (int loop1 = (MAX - count); loop1 >= 1; loop1--) {
                System.out.print("\t");
            }//for

            //print the numbers down to 1
            for (int loop2 = count; loop2 >= 1; loop2--) {
                System.out.print(loop2 + "\t");
            }//for

            //print the numbers from 2 up
            for (int loop3 = 2; loop3 <= count; loop3++) {
                System.out.print(loop3 + "\t");
            }

            System.out.println();
        }//for
    }//main
}//class