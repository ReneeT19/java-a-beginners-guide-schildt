package com.renee;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double inches, meters;
        DecimalFormat numberFormat = new DecimalFormat("#00.0"); // keep one decimal by using 00.0
        int counter;
        counter = 0;
        for (inches = 0; inches <= 100; inches++) {
            meters = inches * 2.54 / 100;
            System.out.println(inches + " inches is " + numberFormat.format(meters) + " meters.");
            // pay attention that it's inches to meters not meters to inches
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
