//package Lab1;
//
//import java.text.DecimalFormat;
//import java.util.Scanner;
//
///*
// * Program to test the Car class
// */
//
//public class TestCar2 {
//   public static void main(String[] args) {
//      Scanner keyboard = new Scanner(System.in);
//      DecimalFormat df = new DecimalFormat("0,000.00");
//
//      int years;
//      double number, currentValueOfCar;
//
//      // Create new car objects
//      Car myCar = new Car();
//
//      Car sistersCar = new Car(100, "Ford", "My sister Mary",
//                               "Red", 2008, 105, 10995.00);
//
//      Car bossCar = new Car(101, "Honda","Pat Bell", "Silver",
//                            2011, 210, 27500.00);
//
//      Car aCar = new Car(102, "Ford", "Janet Allison", "Red");
//
//      Car bCar = new Car(103, "John Smith", 100);
//
//      // Print out the details of each car
//      myCar.printCarInfo();
//      sistersCar.printCarInfo();
//      bossCar.printCarInfo();
//      aCar.printCarInfo();
//      bCar.printCarInfo();
//
//      // Set some attributes of bCar
////      bCar.setMake ("Vauxhall");
////      bCar.setWho ("James Rogers");
////      bCar.setYear(2012);
////      bCar.setCost(10000);
//
//      // Print out the details of bCar
//      bCar.printCarInfo();
//
//      // Create, set and print out the attributes of cCar
////      Car cCar = new Car();
////      cCar.setID(104);
////      cCar.setMake("Toyota");
////      cCar.setOwner("Robert Smith");
////      cCar.setColour("Blue");
////      cCar.setYear(2010);
////      cCar.setSpeed(120);
////      cCar.setCost(12000);
////      cCar.printCarInfo();
//
//      // Print out some attributes for bCar
////      System.out.println("The make of car " + bCar.getID() + " is " + bCar.getMake ());
////      System.out.println("The colour of car " + bCar.getID() + " is " + aCar.getColour ());
////      System.out.println("The year of manufacture of car " + bCar.getID() + " is " + bCar.getYear () + "\n");
//
//      // Test user-defined method to calculate the age of a car
////      System.out.println("Car " + cCar.getID() + " is " + cCar.ageOfCar() + " years old\n");
////      years = aCar.ageOfCar();
////      if ( years == -1){
////         System.out.println("Year of manufacture not recorded for Car " + aCar.getID() + "\n");
////      }//if
////      else{
////         System.out.println("Car " + aCar.getID() + " is " + years + " years old\n");
////      }//else
////
////      // Test user-defined method to find current value of a car
////      System.out.print("What is the yearly percentage depreciation for car " + cCar.getID() + " : ");
////      number = keyboard.nextDouble();
////      System.out.println("The current value of car " + cCar.getID() +  " is �" +  df.format(cCar.currentValue(number)) + "\n");
////
////      System.out.print("What is the yearly percentage depreciation for car " + aCar.getID() + " : ");
////      number = keyboard.nextDouble();
////      currentValueOfCar = aCar.currentValue(number);
////      if (currentValueOfCar == -1){
////         System.out.println("Year of manufacture and/or Cost not recorded for Car " + aCar.getID() + "\n");
////      }//if
////      else{
////         System.out.println("The current value of car " + aCar.getID() +  " is �" + df.format(currentValueOfCar) + "\n");
////      }//else
//
//   }//main
//}//class
