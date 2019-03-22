package Lab6;

import java.util.Scanner;

/**
 * Created by: George Keddy
 * Created on: 12/10/2018
 * Program to
 */

public class OddNumbers {

 public static void main(String[] args) {

     double average;
     int total = 0;
     int noOfOdd = 0;

     for (int number = 1; number <= 50; number++) {
         if (number % 2 != 0) {
             System.out.println(number);
             noOfOdd = noOfOdd + 1;
             total = total + number;
         }//if
     }//for

     average = (double) total / noOfOdd;
     System.out.println("The total of these numbers is : " + total);
     System.out.println("The average of these numbers is: " + average);

 }//main
}//class