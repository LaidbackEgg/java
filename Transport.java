package Lab1;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by: George Keddy
 * Created on: 14/11/2018
 * Program to read in the weights of containers until -1 is entered and calculate
 * the cost of haulage depending on the number of containers and the total weight.
 */

public class Transport {
    static DecimalFormat df = new DecimalFormat("0.00");

     static int getWeight(int number) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the weight of container " + number + " (in kg) or -1 to finish: ");
        return keyboard.nextInt();
    }

    public static double calculateCost(int number, int weight) {
        final int HIGHWEIGHT = 1000;
        final int LOWWEIGHT = 500;
        final int HIGHCOST = 1200;
        final int MIDDLECOST = 750;
        final int LOWCOST = 400;
        final int DISCOUNTNUMBER = 5;
        final double DISCOUNTRATE = 0.25;
        double cost;

        if (weight > HIGHWEIGHT) {
            cost = HIGHCOST;
        }//if
        else {
            if (weight > LOWWEIGHT) {
                cost = MIDDLECOST;
            }//if
            else {
                cost = LOWCOST;
            }//else
        }//else
        if (number <= DISCOUNTNUMBER){
            cost = cost - (cost*DISCOUNTRATE);
        }//if
        return cost;
    }//calculateCost

    public static void main (String [] args) {

        int weight, totalWeight = 0, numberOfContainers = 1;
        final int TERMINATOR = -1;
        double cost = 0;

        weight = getWeight(1);

        while (weight != TERMINATOR) {
            totalWeight = (totalWeight+weight);
            numberOfContainers = (numberOfContainers+1);
            weight = getWeight(numberOfContainers);
            cost = calculateCost(numberOfContainers, totalWeight);
        }//while

        System.out.println("The total number of containers is " + numberOfContainers);
        System.out.println("The total weight of the containers is " + totalWeight + "kgs");
        System.out.println("The total cost of transport is £" + df.format(cost));
    }//main
}//class
