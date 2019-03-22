package Lab3;

import javax.swing.*;

/**
 * Created by:
 * Created on:
 * Program to prompt the user to enter the sum of 2 numbers, then output
 * whether or not they are correct using JOptionPanes
 */

public class AdditionTutor1 {
    public static void main(String[] args) {

        final int NUMBER1 = 12, NUMBER2 = 13;
        int answer;
        String answerString;

        answerString = JOptionPane.showInputDialog("What is " + NUMBER1 + " + " + NUMBER2 + "?");
        answer = Integer.parseInt(answerString);
        JOptionPane.showMessageDialog(null, NUMBER1 + " + " + NUMBER2 + " = " + answer + " is " +
                ((NUMBER1 + NUMBER2) == answer));
    }//main
}//class