package Lab2;

import javax.swing.*;

/**
 * Created by:
 * Created on:
 * Program to convert a time in seconds to hours, minutes and seconds
 * displaying the output using JOptionPane
 */

public class DisplayTimeJOptionPane {
    public static void main(String[] args) {
        int seconds = 500;
        int remainingSeconds, minutes;
        minutes = seconds / 60;
        remainingSeconds = seconds % 60;
        JOptionPane.showMessageDialog(
                null, seconds + " seconds = " + minutes +
                        " minutes and " + remainingSeconds +
                        " seconds");
    }//main
}//class