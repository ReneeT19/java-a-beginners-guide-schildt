package com.renee;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        double num, sroot, rerr;
//        for(num = 1.0; num < 100.0; num++) {
//            sroot = Math.sqrt(num); //math function to calculate square root
//            System.out.println("Square root of " + num + " is " + sroot);
//            //next compute rounding error which is by squaring the square root of each number
//            rerr = num - (sroot * sroot);
//            System.out.println("Roudning error is " + rerr);
//            System.out.println();
//        }
        //loop continues until the letter S is typed
//        throws java.io.IOException {
//            int i;
//            System.out.println("Press S to stop.");
//            for(i = 0; (char)System.in.read() != 'S'; i++) System.out.println("Pass #" + i);//the condition is not a boolean but an input from the user
//        }
        // declare loop control variables inside the for loop
            int sum = 0;
            int fact =1;
            for(int i = 1; i <= 5; i++) {
                sum += i; //i is known in the loop
                fact *= i;
            } // i is not known beloe
            System.out.println("Sum is " + sum);
            System.out.println("Factorial is " + fact);
    }
}

