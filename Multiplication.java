package Lab6;

/**
 *
 */

public class Multiplication {

    public static void main(String[] args) {

        for (int row = 3; row <= 5; row++) {
            for (int column = 1; column <= 4; column++) {
                System.out.print ("\t" + (row * column));
            }//for
            System.out.println();
        }//for

    }//main
}//class