package Lab5;
import java.util.Scanner;

/**
 * Created by: George Keddy
 * Created on: 10/10/2018
 * Program to experiment with the Debugging facility
 */

public class TestDebug {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int OLD = 30;
        String name;
        int age;

        System.out.print("What is your name? ");
        name = keyboard.nextLine();
        System.out.print("\nWelcome " + name + ", what age are you? ");
        age = keyboard.nextInt();

        if ((age < OLD)) {
            System.out.println("\n" + name + ", you are less than " + OLD + " years old\n");
        }//if
        else {
            System.out.println("\n" + name + ", you are at least " + OLD + " years old!\n");
        }//else

        System.out.println("Thank you for using the system");

    }//main
}//class