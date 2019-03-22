package Lab9;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by
 * Created on
 * Program to read in the take-off time and flight time of a rocket
 * and calculates and outputs the estimated arrival time
 */

public class Rocket2 {
    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("00");

    static int takeOffHour, takeOffMinute, takeOffSecond;
    static int flightTime;
    static int arrivalHour, arrivalMinute, arrivalSecond;

    // Method to read in the take-off time and duration of the flight
    static void readData() {
        System.out.println("What is the take-off time (24-hour clock):");
        System.out.print("Hour:    ");
        takeOffHour = keyboard.nextInt();
        System.out.print("Minutes: ");
        takeOffMinute = keyboard.nextInt();
        System.out.print("Seconds: ");
        takeOffSecond = keyboard.nextInt();

        System.out.print("\nHow long is the flight time (in seconds)? ");
        flightTime = keyboard.nextInt();
    }//readData

    // Method to calculate the arrival time
    static void calculateArrivalTime() {
        final int SECMINHOUR = 60;
        final int HOURSINDAY = 24;

        arrivalSecond = takeOffSecond + flightTime;
        arrivalMinute = takeOffMinute + (arrivalSecond / SECMINHOUR);
        arrivalSecond = arrivalSecond % SECMINHOUR;
        arrivalHour = takeOffHour + (arrivalMinute / SECMINHOUR);
        arrivalMinute = arrivalMinute % SECMINHOUR;
        arrivalHour = arrivalHour % HOURSINDAY;
    }//calculateArrivalTime

    // Method to output the results
    static void outputResults() {
        System.out.println("\nTake-off Time:\t\t\t\t" + df.format(takeOffHour) + ":" + df.format(takeOffMinute) + ":" + df.format(takeOffSecond));
        System.out.println("Flight Time:\t\t\t\t" + flightTime + " seconds");
        System.out.println("Expected Arrival Time:\t\t" + df.format(arrivalHour) + ":" + df.format(arrivalMinute) + ":" + df.format(arrivalSecond));
    }//outputResults

    public static void main(String[] args) {
        readData();
        calculateArrivalTime();
        outputResults();
    }//main
}//class
