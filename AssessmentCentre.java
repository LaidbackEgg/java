package Test2;

import java.util.Scanner;

/**
 * Created by George Keddy
 * Created on 26/10/2018
 * Program will Read in candidate ID, read in Test value as a percentage,
 * read in Interview value as a percentage%, calculate overall average mark,
 * then print screen message informing candidate whether they got the job.
 */

public class AssessmentCentre {
    static Scanner keyboard = new Scanner(System.in);

    //Method to read in ID
    public static String enterIdNumber() {
        System.out.print("Enter candidate's ID: ");
        return keyboard.nextLine();
    }//enterIdNumber

    // Method to read in and return a value
    public static double enterMark(String testType) {
        System.out.print("Please enter the " + testType + " value: ");
        return keyboard.nextDouble();
    }//enterMark

    // Method to check if a value is in the range 0..100
    public static boolean checkValue(double value) {
        return ((value >= 0) && (value <= 100));
    }//checkValue

    // Method to calculate and return the overall grade
    public static double calculateGrade(double testResult, double interviewResult) {
        return Math.round((testResult + interviewResult) / 2);
    }//calculateGrade

    // Method to assign and return the message depending on overall grade
    public static String outcomeMessage(double testResult, double interviewResult, double finalGrade) {
        final int FAIL = 50;
        final int WAITINGLIST = 70;
        if ((testResult < FAIL) || (interviewResult < FAIL)) {
            return " - Sorry, unsuccessful. Keep trying.";
        }//if
        if (finalGrade < WAITINGLIST) {
            return " - You are being added to our waiting list for new openings.";
        }//if
            else {
                return " - Congratulations, you got the job!";
            }//else
    }//outcomeMessage

    // Method to output the results
    public static void outputResults(String piD, double ptestResult, double pinterviewResult, double pfinalGrade) {
        System.out.println();
        System.out.println("ID No. \t\t\tTest \t\t\tInterview \t\tOverall Performance");
        System.out.println(piD + "\t\t\t" + (int) ptestResult + "\t\t\t\t"
                + (int) pinterviewResult + "\t\t\t\t" + (int) pfinalGrade);
        System.out.println("\n" + "Message for: " + piD + outcomeMessage(ptestResult, pinterviewResult, pfinalGrade));
    }//outputResults

    public static void main(String[] args) {
        String name;
        double testResult, interviewResult, finalGrade;
        boolean testResultValueOK, interviewResultValueOK;
        name = enterIdNumber();
        testResult = enterMark("test result");
        testResultValueOK = checkValue(testResult);
        if (testResultValueOK) {
            interviewResult = enterMark("interview result");
            interviewResultValueOK = checkValue(interviewResult);
            if (interviewResultValueOK) {
                finalGrade = calculateGrade(testResult, interviewResult);
                outputResults(name, testResult, interviewResult, finalGrade);
            }//if
            else {
                System.out.println("Test Result out of range, please try again");
            }//else
        }//if
        else {
            System.out.println("Interview Result out of range, please try again");
        }//else
    }//main
}//class
