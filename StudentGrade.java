package LabTest;

import java.util.Scanner;

/**
 * Created by George Keddy
 * Created on 26/10/2018
 * Program to read in student's name, their results and output their grade
 */

public class StudentGrade {
    static Scanner keyboard = new Scanner(System.in);

    public static String enterName() {
        System.out.print("Enter Student's name: ");
        return keyboard.nextLine();
    }//enterName

    // Method to read in and return a value
    public static double enterValue(String testType) {
        //   System.out.println();
        System.out.print("Please enter the " + testType + " value: ");
        return keyboard.nextDouble();
    }//enterValue

    // Method to check if a value is in the range 0..100
    public static boolean checkValue(double value) {
        return ((value >= 0) && (value <= 100));
    }//checkValue

    // Method to calculate and return the overall grade
    public static double calculateGrade(double examResult, double courseWorkResult) {
        return Math.round((examResult + courseWorkResult) / 2);
    }//calculateGrade

    // Method to assign and return the overall level
    public static String assignLevel(double examResult, double courseWorkResult, double finalGrade) {
        final int PASS = 40;
        final int MERIT = 70;
        final int DISTINCTION = 90;

        if ((examResult < PASS) || (courseWorkResult < PASS)) {
            return "FAIL";
        }//if
        if (finalGrade < MERIT) {
            return "PASS";
        }//if
        else {
            if (finalGrade < DISTINCTION) {
                return "MERIT";
            }//if
            else {
                return "DISTINCTION";
            }//else
        }//else
    }//assignLevel

    // Method to output the results
    public static void outputGrade(String pname, double pexamResult, double pcourseWorkResult, double pfinalGrade) {
        System.out.println();
        System.out.println("Name \t\t\tExam Result \t\tC-Work Result \t\tOverall\t\t\tGRADE");
        System.out.println(pname + "\t\t\t" + (int) pexamResult + "\t\t\t\t\t"
                + (int) pcourseWorkResult + "\t\t\t\t\t" + (int) pfinalGrade + "\t\t\t\t" +
                assignLevel(pexamResult, pcourseWorkResult, pfinalGrade));
    }//outputResults

    public static void main(String[] args) {
        String name;
        double examResult, courseWorkResult, finalGrade;
        boolean examResultValueOK, courseWorkResultValueOK;

        name = enterName();
        examResult = enterValue("exam result");
        examResultValueOK = checkValue(examResult);
        if (examResultValueOK) {
            courseWorkResult = enterValue("course work result");
            courseWorkResultValueOK = checkValue(examResult);
            if (courseWorkResultValueOK) {
                finalGrade = calculateGrade(examResult, courseWorkResult);
                outputGrade(name, examResult, courseWorkResult, finalGrade);
            }//if
            else {
                System.out.println("Exam Result out of range");
            }//else
        }//if
        else {
            System.out.println("Coursework Result out of range");
        }//else
    }//main
}
