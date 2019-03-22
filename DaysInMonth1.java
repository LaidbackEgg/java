package Lab5;

import java.util.Scanner;

/**
 * Program to output the number of days in a month
 */

public class DaysInMonth1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Declare variables
        int month, year;
        int noOfDays = 0;
        boolean valid = true;

        // Read in the month and year
        System.out.print("Enter the month (1 - 12) : ");
        month = keyboard.nextInt();

        System.out.print("Enter the year : ");
        year = keyboard.nextInt();

        // Calculate and output the number of days
        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                noOfDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                noOfDays = 30;
                break;
            case 2:
                if ((((year % 4) == 0) && (year % 100 != 0)) || (year %
                        400 == 0)) {
                    noOfDays = 29;
                }//if
                else {
                    noOfDays = 28;
                }//else
                break;
            default:
                System.out.println("Invalid month");
                valid = false;
        }//switch
        // Output number of days
        if (valid) {
            System.out.println("There are " + noOfDays + " days in month " + month + " in " + year);
        }//if
    }//main
}//class