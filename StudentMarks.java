package Lab5;

import java.util.Scanner;

/**
 * Program to read in a student's marks and output their grade
 */

public class StudentMarks {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int PASS = 40;
        final int DISTINCTION = 70;
        String name, grade;
        double courseworkMark, examMark, moduleMark;

        // Read in the details from the keyboard
        System.out.print("Please enter the student's name: ");
        name = keyboard.nextLine();
        System.out.println();
        System.out.print("Please enter the coursework mark: ");
        courseworkMark = keyboard.nextDouble();
        System.out.println();
        System.out.print("Please enter the exam mark: ");
        examMark = keyboard.nextDouble();
        System.out.println();

        // Calculate the overall mark
        moduleMark = Math.round((courseworkMark + examMark) / 2);
        // Work out the grade achieved
        if ((courseworkMark < PASS) || (examMark < PASS)) {
            grade = "Fail";
        }//if
        else {
            if (moduleMark < DISTINCTION) {
                grade = "Pass";
            }//if
            else {
                grade = "Distinction";
            }//else
        }//else

        // Output the results
        System.out.println("Name \t\t\t\tCoursework \t\tExamination \tOverall \tGrade");
        System.out.println(name + "\t\t" + (int) courseworkMark +
                "\t\t\t\t" +
                (int) examMark + "\t\t\t\t" + (int) moduleMark +
                "\t\t\t" + grade);
    }//main
}//class