package Lab3;

import javax.swing.*;

/**
 * Created by:
 * Program to prompt the user to enter the sum of 2 randomly generated numbers, then output
 * whether or not they are correct using JOptionPanes
 */

public class AdditionTutor2 {
    public static void main(String[] args) {

        int number1, number2, answer;
        String answerString;
        number1 = (int) ((Math.random() * 20) + 1);
        number2 = (int) ((Math.random() * 20) + 1);
        answerString = JOptionPane.showInputDialog("What is " + number1 + " + " + number2 + "?");
        answer = Integer.parseInt(answerString);
        JOptionPane.showMessageDialog(null, number1 + " + " + number2 + " = " + answer + " is " +
                ((number1 + number2) == answer));
    }//main
}//class