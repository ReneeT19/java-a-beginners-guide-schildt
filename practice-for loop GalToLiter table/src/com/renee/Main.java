package com.renee;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double gallons, liters;
        DecimalFormat numberFormat = new DecimalFormat("#.00"); // limit the decimals of a double variable
        int counter;
        counter = 0; // line counter is initially set to zero
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + numberFormat.format(liters) + " liters.");
            // use numberFormat.format for the double variable that you need to limit decimals
            counter++; // increment the line counter with each loop iteration
            if (counter == 10) { // if counter is 10, insert a blank line
                System.out.println();
                counter = 0;
            }
        }
    }
}
