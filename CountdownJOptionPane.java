package lab1;

/**
 * Created by: George Keddy
 * Created on: 26/09/2018
 * Program to display a countdown for a NASA rocket as an Option Pane
 */

import javax.swing.JOptionPane;

public class CountdownJOptionPane {

    public static void main (String [] args) {
        JOptionPane.showMessageDialog (
                //null, "Three... Two... One... Zero... Liftoff!",
                null, "Three...",
                "DisplayMessage",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog (
                null, "Two...",
                "DisplayMessage",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog (
                null, "One...",
                "DisplayMessage",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog (
                null, "Zero...",
                "DisplayMessage",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog (
                null, "Liftoff!",
                "DisplayMessage",
                JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog (
                    null, "Houston, we have a problem!",
                    "DisplayMessage",
                    JOptionPane.INFORMATION_MESSAGE);
    }//main
}//class
