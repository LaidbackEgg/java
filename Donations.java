package Lab7;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by George Keddy
 * Created on 17/10/2018
 * Program to
 */

public class Donations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        final double TARGET = 500.00;
        double amount = 0, largest = 0, total = 0;
        int numberOfDonations = 0;
        String name, largestDonator = "";

        do {
            System.out.print("Please enter your name: ");
            name = keyboard.next();
            System.out.print("Please enter your donation amount: £");
            amount = keyboard.nextDouble();

            numberOfDonations = numberOfDonations + 1;

            total = total + amount;
            if (amount > largest) {
                largest = amount;
                largestDonator = name;
            }

        } while (total <= TARGET);

        System.out.println("\nThe number of donations received was: " + numberOfDonations);
        System.out.println(largestDonator + " donated the largest amount of £" + df.format(largest));
    }
}
