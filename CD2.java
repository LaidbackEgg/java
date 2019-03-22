package Lab2;

import java.text.DecimalFormat;
import java.util.*;

/*
 * Define a CD Class
 */

public class CD2 {
   DecimalFormat df = new DecimalFormat("0.00");

   //class variable
   private static int uniqueID = 1;

   //instance variables
   private int id;
   private String artistName;
   private String albumName;
   private double costPrice, salePrice;
   private int year;
   private boolean single;

   public CD2() {
      id = uniqueID;
      uniqueID = uniqueID + 1;
   }//Default constructor

   public CD2(String artist, String album, double cost, double sale, int albumYear, boolean isSingle) {
      id = uniqueID;
      artistName = artist;
      albumName = album;
      costPrice = cost;
      salePrice = sale;
      year = albumYear;
      single = isSingle;
      uniqueID = uniqueID + 1;
   }//Alternative constructor

   public CD2(String artist, String album, int albumYear, boolean isSingle) {
      id = uniqueID;
      artistName = artist;
      albumName = album;
      costPrice = 0;
      salePrice = 0;
      year = albumYear;
      single = isSingle;
      uniqueID = uniqueID + 1;
   }//Alternative constructor

   public int getYear() {
      return year;
   }//getYear

   //Method to return the profit on a CD
   public double getProfit() {
      return salePrice - costPrice;
   }//getProfit

   //Method to update the cost and sale price
   public void updatePrices(double amount) {
      costPrice = costPrice + amount;
      salePrice = salePrice + (2 * amount);
   }//updatePrices

   //Method to print out all the details of a CD
   public void printAllInfo() {
      System.out.println("===============");
      System.out.println("The ID is " + id);
      System.out.println("The name of the artist is " + artistName);
      System.out.println("The name of the album is " + albumName);
      System.out.println("The cost price of the CD is £" + df.format(costPrice));
      System.out.println("The cost price of the CD is £" + df.format(salePrice));
      System.out.println("The CD was issued in " + year);
      if (single) {
         System.out.println("This is a single CD");
      }//if
      else {
         System.out.println("This is a double CD");
      }//else
      System.out.println("===============\n");
   }//printAllInfo

}//class
