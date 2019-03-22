package Assessment2;

/*
* created by George Keddy on 14/12/2018
 */

import java.util.Scanner;

public class ReverseNames {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        final int MAX = 5;
        String[] names = new String[MAX];

        for (int index = 0; index < MAX; index++) {
            System.out.print("Enter a name: ");
            names[index] = keyboard.nextLine();
        }//for

        //names will be input and printed as entered
        System.out.print("Names entered are: \n");
        for (int index = 0; index < MAX; index++) {
            System.out.print(names[index] + "\t\t");
        }//for

        //names will now be reversed and printed
        System.out.print("Names reversed are: \n");
        for (int index = MAX - 1; index >= 0; index--) {
            System.out.print(names[index] + "\t\t");
        }//for

    }//main
}//class
