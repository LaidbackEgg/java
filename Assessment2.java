package Assessment2;

/*
 *Created by George Keddy on 14/12/2018
 */

public class Assessment2 {

    //section 1
    public static void method1() {
        int[] values = {34, 56, 23, 35, 78, 44, 60, 20, 31, 61};
        final int SIZE = values.length;
        int smallest1 = 0, smallest2 = 0;
        smallest1 = values[0];
        smallest2 = values[0];

        for (int index = 0; index < SIZE; index++) {
            if (values[index] < smallest1) {
                smallest1 = values[index];
            }//if
            else {
                if (values[index] < smallest2) {
                    smallest2 = values[index];
                }//if
            }//else
        }//for
        System.out.println("The two smallest numbers in the list are: " + smallest1 + " and " + smallest2);
    }//method1()

    //section2
    public static void method2() {
        int[] values = {34, 67, 23, 45, 69, 30};
        final int MAX = values.length;
        int temp;

        //original list
        System.out.print(values[0] + ", ");
        System.out.print(values[1] + ", ");
        System.out.print(values[2] + ", ");
        System.out.print(values[3] + ", ");
        System.out.print(values[4] + ", ");
        System.out.print(values[5] + ".");

        //new list

    }

    //section3 will print out the methods
    public static void main(String[] args) {
        method1();

    }//main
}//class
