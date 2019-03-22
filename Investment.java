package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Program to read in the amount of money he wants to invest and the
 * number of years to be invested. The program calculates and outputs
 * the value of the investment at the end of the investment period.
 */

public class Investment {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        final double INTERESTRATE = 0.035;
        int years;
        double amount, value;
        // Prompt for and read in the amount to invest
        System.out.print("How much do you wish to invest? £");
        amount = keyboard.nextDouble();
        // Prompt for and read in the number of years to invest for
        System.out.print("For how many years do you want to invest? ");
        years = keyboard.nextInt();
        // Calculate value of investment
        value = amount + (amount * years * INTERESTRATE);
        // Output results
        System.out.println("\nInitial Investment:\t\t\t\t\t\t\t£" + df.format(amount));
        System.out.println("Investment period:\t\t\t\t\t\t\t" + years + " years");
        System.out.println("Final value of Investment (at " + df.format((INTERESTRATE * 100)) + "%)\t\t£"
                + df.format(value));
    }//main
}//class
