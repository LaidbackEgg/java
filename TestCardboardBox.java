package Lab2;

import javax.smartcardio.Card;
import java.util.Scanner;

public class TestCardboardBox {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        int height, width, depth;
        int numberOfBoxes = 1;

        // Box1
        CardboardBox myBox = new CardboardBox();
        System.out.print("Box" + numberOfBoxes++ + " - myBox: \n");
        System.out.print("What is the width of the box: ");
        width = keyboard.nextInt();
        System.out.print("What is the height of the box: ");
        height = keyboard.nextInt();
        System.out.print("What is the depth of the box: ");
        depth = keyboard.nextInt();
        myBox.setBox(width, height, depth);
        myBox.showAllDetails();

        // Box2
        CardboardBox yourBox = new CardboardBox(width = 15, height = 5, depth = 25);
        System.out.print("\nBox" + numberOfBoxes++ + " - yourBox: \n");
        yourBox.showAllDetails();
        yourBox.printTopArea(0);
        yourBox.printFrontArea(0);
        yourBox.printSideArea(0);

        // Box3
        System.out.print("\nBox" + numberOfBoxes++ + " - aBox: \n");
        CardboardBox aBox = new CardboardBox();
        aBox.showAllDetails();

        // Box4
        CardboardBox otherBox = new CardboardBox();
        System.out.print("\nBox" + numberOfBoxes + " - otherBox: \n");
        System.out.print("What is the width of the box: ");
        width = keyboard.nextInt();
        System.out.print("What is the height of the box: ");
        height = keyboard.nextInt();
        System.out.print("What is the depth of the box: ");
        depth = keyboard.nextInt();
        otherBox.setBox(width, height, depth);
        otherBox.showAllDetails();

        System.out.println("\n" + numberOfBoxes + " boxes were created.");

    }//main
}//class
