package Lab1;

import java.text.DecimalFormat;
import java.util.*;

/*
 * Define a Car Class
 */

public class Car2 {
   DecimalFormat df = new DecimalFormat("0,000.00");

   // instance variables
   private int id;
   private String make;
   private String ownerName;
   private String colour;
   private int yearOfManufacture, topSpeed;
   private double costPrice;

   public Car2() {
   }//Default constructor

   public Car2(int itsID, String itsMake, String whoOwns, String itsColour, int whenBuilt, int maxSpeed, double price) {
      id = itsID;
      make = itsMake;
      ownerName = whoOwns;
      colour = itsColour;
      yearOfManufacture = whenBuilt;
      topSpeed = maxSpeed;
      costPrice = price;
   }//Alternative constructor

   public Car2(int itsID, String itsMake, String whoOwns, String itsColour) {
      id = itsID;
      make = itsMake;
      ownerName = whoOwns;
      colour = itsColour;

      yearOfManufacture = 0;
      topSpeed = 0;
      costPrice = 0;
   }//Alternative constructor

   public Car2(int itsID, String whoOwns, int maxspeed) {
      id = itsID;
      ownerName = whoOwns;
      topSpeed = maxspeed;

      colour = "unknown";
      make = "unknown";
      yearOfManufacture = 0;
      costPrice = 0;
   }//Alternative constructor

   public void setID(int itsID) {
      id = itsID;
   }//setID

   public void setMake(String itsMake) {
      make = itsMake;
   }//setMake

   public void setOwner(String whoOwns) {
      ownerName = whoOwns;
   }//setOwner

   public void setColour(String itsColour) {
      colour = itsColour;
   }//setColour

   public void setYear(int whenBuilt) {
      yearOfManufacture = whenBuilt;
   }//setYear

   public void setSpeed(int maxSpeed) {
      topSpeed = maxSpeed;
   }//setSpeed

   public void setCost(double price) {
      costPrice = price;
   }//setCost

   public int getID() {
      return id;
   }//getID

   public String getMake() {
      return make;
   }//getMake

   public String getName() {
      return ownerName;
   }//getName

   public String getColour() {
      return colour;
   }//getColour

   public int getYear() {
      return yearOfManufacture;
   }//getYear

   public int getSpeed() {
      return topSpeed;
   }//getSpeed

   public double getCost() {
      return costPrice;
   }//getCost

   // Method to return the age of a car
   public int ageOfCar() {
      int answer;
      Calendar current = Calendar.getInstance();
      if (yearOfManufacture == 0) {
         answer = -1;
      }//if
      else {
         answer = (current.get(Calendar.YEAR) - yearOfManufacture);
      }//else
      return answer;
   }//ageOfCar

   // Method to return the current value of a car
   public double currentValue(double depreciation) {
      int age;
      double value;
      if (costPrice == 0) {
         value = -1;
      }//if
      else {
         age = ageOfCar();
         if (age == -1) {
            value = -1;
         }//if
         else {
            value = costPrice - (costPrice * (depreciation / 100) * age);
         }//else
      }//else
      return value;
   }//currentValue

   // Method to print out all the details of a car
   public void printCarInfo() {
      System.out.println("START OF " + ownerName + "'s car details");
      System.out.println("The ID is " + id);
      System.out.println("The make of the car is " + make);
      System.out.println("The car is a lovely shade of " + colour);
      System.out.println("It was built in " + yearOfManufacture);
      System.out.println("It has a top-speed of " + topSpeed);
      System.out.println("It cost �" + df.format(costPrice) + " to buy");
      System.out.println("END OF " + ownerName + "'s car details\n");
   }//printCarInfo

}//class
