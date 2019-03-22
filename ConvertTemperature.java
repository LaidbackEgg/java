package Lab2;

import java.text.DecimalFormat;

/**
 * Created by:
 * Created on:
 * Program to convert a temperature from centigrade to fahrenheit
 */

public class ConvertTemperature {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.00");
        double centigrade = 100;
        double fahrenheit;
        fahrenheit = ((9.0/5) * centigrade) + 32;
        System.out.println(df.format(centigrade) + " degrees centigrade = " + df.format(fahrenheit) + " degrees fahrenheit");
    }//main
}//class