package Lab1;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Car {
    DecimalFormat df = new DecimalFormat("0,000.00");

    private int id1 = 0;
    private String make = "";
    private String ownerName = "";
    private String colour = "";
    private int yearOfMake = 0;
    private int age = 0;
    private int topSpeed = 0;
    private double costPrice = 0.0;

    public Car() {
    }//Default constructor

    public Car(int idNumber, String carMake, String nameOfOwner, String carColour, int carsYearOfMake, int carTopSpeed, double carCostPrice) {
        id1 = idNumber;
        make = carMake;
        ownerName = nameOfOwner;
        colour = carColour;
        yearOfMake = carsYearOfMake;
        topSpeed = carTopSpeed;
        costPrice = carCostPrice;
    }//Alternative Constructor 1

    public Car(int idNumber, String carMake, String nameOfOwner, String carColour) {
        id1 = idNumber;
        make = carMake;
        ownerName = nameOfOwner;
        colour = carColour;
    }//Alternative constructor 2

    public Car(int idNumber, String nameOfOwner, int carTopSpeed) {
         id1 = idNumber;
         ownerName = nameOfOwner;
         topSpeed = carTopSpeed;
    }//Alternative Constructor 3


    public int ageOfCar() {
        int age;
        Calendar current = Calendar.getInstance();
        if (yearOfMake == 0) {
            age = -1;
        } //if
        else {
            age = (current.get(Calendar.YEAR) - yearOfMake);
        } //else
        return age;
    }//ageOfCar

    public double currentValue(double depreciation) {
        int age;
        double value;
        if (costPrice == -1) {
            value = -1;
        }//if
        else {
            age = ageOfCar();
            if (age <= 0) {
                value = -1;
            }//if
            else {
                value = costPrice - (costPrice * (depreciation / 100) * age);
            }//else
        }//else
        return value;
    }//currentValue


    //setMethods
    public void setId1 (int idNumber){ id1 = idNumber; }
    public void setMake (String carMake){  make = carMake; }
    public void setOwnerName (String nameOfOwner){ ownerName = nameOfOwner; }
    public void setColour (String carColour){ colour = carColour; }
    public void setYearOfMake (int carsYearOfMake){ yearOfMake = carsYearOfMake; }
    public void setAge (int ageOfCar) { age = ageOfCar; }
    public void setTopSpeed (int carTopSpeed){ topSpeed = carTopSpeed; }
    public void setCostPrice (double carCostPrice){ costPrice = carCostPrice; }

    //getMethods
    public int getId1() { return id1; }
    public String getMake() {return make;}
    public String getOwnerName() {return ownerName;}
    public String getColour() {return colour;}
    public int getYearOfMake() {return yearOfMake;}
    public int getAge() {return age;}
    public int getTopSpeed() {return topSpeed;}
    public double getCostPrice() {return costPrice;}


    public void printCarInfo() {
        System.out.println("START OF " + ownerName + "'s car details");
        System.out.println("The car's ID is " + id1);
        System.out.println("The car's make is " + make);
        System.out.println("The colour is " + colour);
        System.out.println("The year of make is " + yearOfMake);
        System.out.println("The top speed of this car is " + topSpeed);
        System.out.println("The cost of this car is " + costPrice);
    }//printCarInfo
}//class
