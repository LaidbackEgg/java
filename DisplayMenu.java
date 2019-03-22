package Lab7;
import java.util.Scanner;

/**
 * Created by:
 * Created on:
 * Program to display a menu until the exit option is chosen
 */

public class DisplayMenu {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1. Hockey");
            System.out.println("2. Football");
            System.out.println("3. Rugby");
            System.out.println("4. Exit");
            System.out.print("\nPlease enter your choice: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\nYou have chosen Hockey");
                    break;
                case 2:
                    System.out.println("\nYou have chosen Football");
                    break;
                case 3:
                    System.out.println("\nYou have chosen Rugby");
                    break;
                case 4:
                    System.out.println("\nYou have chosen to Exit the system");
                    break;
                default:
                    System.out.println("\nInvalid choice");
            }//switch
        } while (choice != 4);
    }//main
}//class