package Lab6;

import java.text.DecimalFormat;

/**
 * Created by: George Keddy
 * Created on: 12/10/2018
 * Program to
 */

public class KilosToPounds {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("\tKilograms\t\tPounds");

        for (int kilos = 5; kilos <= 100; kilos+=5) {
            Double pounds = kilos * 2.2;
               System.out.println("\t" + kilos + "\t\t\t\t" + df.format(pounds));
            }
        }
}