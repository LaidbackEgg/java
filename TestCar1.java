package Lab1;

import java.text.DecimalFormat;
import java.util.*;

public class TestCar1 {
    public static void main (String [] args) {
        DecimalFormat df = new DecimalFormat("0,000.00");
        Scanner keyboard = new Scanner(System.in);

        int years;
        double number, currentValueOfCar;

        Car myCar;
        myCar = new Car();
        //myCar.printCarInfo();

        Car sistersCar = new Car(100, "Ford", "my sister Mary", "Red", 2008, 105, 10995.00);
        //sistersCar.printCarInfo();

        Car bossCar = new Car(101, "Honda", "Pat Bell", "Silver", 2011, 210, 27500.00);
        //bossCar.printCarInfo();

        Car aCar = new Car(102, "Ford", "Janet Allison", "Red");
        //aCar.printCarInfo();

        Car bCar = new Car(103, "John Smith", 100);
        //bCar.printCarInfo();

        Car cCar = new Car();
        //no attributes initialised

        //System.out.println("Make: " + bCar.getMake() + "\nOwner: " + bCar.getOwnerName() + "\nYear: " + bCar.getYearOfMake() + "\nCost Price: " + bCar.getCostPrice());
        //prints data stored above for bCar

        // Use of setMethods1
        bCar.setMake("Vauxhall");
        bCar.setOwnerName("James Rodgers");
        bCar.setColour("Purple");
        bCar.setYearOfMake(2012);
        bCar.setCostPrice(10000);

        // Use of setMethods2
        // initialising attributes to cCar
        cCar.setId1(104);
        cCar.setMake("Toyota");
        cCar.setOwnerName("Robert Smith");
        cCar.setColour("Blue");
        cCar.setYearOfMake(2012);
        cCar.setTopSpeed(120);
        cCar.setCostPrice(12000);

//        System.out.println("Car " + cCar.getId1() + " is " + cCar.ageOfCar() + " years old\n");
//        years = aCar.ageOfCar();
//        if (years == -1){
//            System.out.println("Year of manufacture not recorded for Car " + aCar.getId1() + "\n");
//        }//if
//        else{
//            System.out.println("Car " + aCar.getId1() + " is " + years + " years old\n");
//        }//else

        //read in the yearly depreciation percentage and then calculate the car worth
        System.out.print("What is the yearly percentage depreciation for car " + cCar.getId1() + ": ");
        number = keyboard.nextDouble();
        System.out.println("The current value of car " + cCar.getId1() +  " is £"
                + df.format(cCar.currentValue(number)) + "\n");

//        System.out.print("What is the yearly percentage depreciation for car " + aCar.getId1() + " : ");
//        number = keyboard.nextDouble();
//        currentValueOfCar = aCar.currentValue(number);
//        if (currentValueOfCar == -1){
//            System.out.println("Year of manufacture and/or Cost not recorded for Car " + aCar.getId1() + "\n");
//        }//if
//        else{
//            System.out.println("The current value of car " +
//                    aCar.getId1() +  " is £" +
//                    df.format(currentValueOfCar) + "\n");
//        }//else


        //System.out.println("Make: " + bCar.getMake() + "\nOwner: " + bCar.getOwnerName() + "\nYear: " + bCar.getYearOfMake() + "\nCost Price: £" + df.format(bCar.getCostPrice()));
        //System.out.println("ID - " + cCar.getId1() + "\nMake - " + cCar.getMake() + "\nOwner - " + cCar.getOwnerName() + "\nColour - " + cCar.getColour() + "\nYear - " + cCar.getYearOfMake() + "\nTop Speed - " + cCar.getTopSpeed() + "\nCost Price - £" + df.format(cCar.getCostPrice()));
        //System.out.println("Make: " + bCar.getMake() + "\nColour: " + bCar.getColour() + "\nYear: " + bCar.getYearOfMake());
        //System.out.println("Year of cCar - " + cCar.ageOfCar());

        //return keyboard.nextInt();

        //System.out.println("Year of cCar - " + cCar.ageOfCar() + " New Value =  £" + cCar.currentValue());
        //prints setMethods data from above

    }//main

}//class
