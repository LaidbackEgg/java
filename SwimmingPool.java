package Test1;

// import utilities
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by George Keddy
 * Created on 16/10/2018
 * ProgThe program will calculate and print out the total cost
 * for swimming and parking for a school group and the cost
 * contribution for each child.
 */

public class SwimmingPool {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in); //recognise keyboard
        DecimalFormat df = new DecimalFormat("0.00"); //register df

        //declare variables
        String firstName, secondName;
        int hoursParked, swimmers;
        final double PARKINGCOST = 15.00, JUNIORRATE = 4.50;
        final String VENUENAME = "Swimming Water Park";
        double totalParkingCost, totalSwimCost, overAllCost, childContrib;

        //request user to input the teacher's name, first then second
        System.out.print("Please enter teacher's first name: ");
        firstName = keyboard.nextLine();

        System.out.print("Please enter teacher's surname: ");
        secondName = keyboard.nextLine();

        //request user to input number of hours parked
        System.out.print("Please enter number of hours parked: ");
        hoursParked = keyboard.nextInt();

        //request user to input number of children to swim
        System.out.print("Please enter the number of children to swim: ");
        swimmers = keyboard.nextInt();

        //complete calculations using the data input and constants
        totalParkingCost = PARKINGCOST*hoursParked;
        totalSwimCost = JUNIORRATE*swimmers;
        overAllCost = totalParkingCost+totalSwimCost;
        childContrib = overAllCost/swimmers;

        //prepare to display all data on screen in user friendly fashion
        System.out.println("\n" + VENUENAME);
        System.out.println("\nBill for:\t\t" + firstName + " " + secondName);
        System.out.println("\tTotal parking hours: \t\t\t\t" + hoursParked + "\t\tCost: £" + df.format(totalParkingCost));
        System.out.println("\tTotal number of junior tickets: \t" + swimmers + "\t\tCost: £" + df.format(totalSwimCost));
        System.out.println("\t\t\t\tTotal cost of tickets:\t\t\t\t  £" + df.format(overAllCost));
        System.out.println("\t\t\t\tCost per child:\t\t\t\t\t\t  £" + df.format(childContrib));
    }//main
}//class
