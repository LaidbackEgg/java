package Lab5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: George Keddy
 * Created on: 10/10/2018
 * Program to work out tax payable on an entered salary figure
 */

public class Tax3 {
    public static void main (String [] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner (System.in);

        double grossPay, tax = 0, netPay;
        final int HIGHTAXLEVEL = 40000, LOWTAXLEVEL = 10000;
        final double HIGHTAXRATE = 0.40, LOWTAXRATE = 0.20;

        System.out.print("Please enter your Gross Pay: £");
        grossPay = keyboard.nextInt();

        if (grossPay > HIGHTAXLEVEL) {
            tax = ((grossPay - HIGHTAXLEVEL) * HIGHTAXRATE) +
                    ((HIGHTAXLEVEL - LOWTAXLEVEL) * LOWTAXRATE);
        }
        else {
            if (grossPay > LOWTAXLEVEL) {
                tax = (grossPay - LOWTAXLEVEL) * LOWTAXRATE;
            }
        }
        netPay = grossPay - tax;

        System.out.println("Gross Pay:\t\t£" + df.format(grossPay));
        System.out.println("Tax:\t\t\t£" + df.format(tax));
        System.out.println("Net Pay:\t\t£" + df.format(netPay));

    }
}
