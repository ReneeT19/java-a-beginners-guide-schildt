package com.renee;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double x, y;
        byte b;
        int i;
        char ch;
        x = 10.0;
        y = 3.0;
        i = (int) (x / y); //truncation will occur when casting double to int
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b); // no loss of info as a byte can hole the value 100

        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b); // loss of info as a byte can hole the value 257

        b = 88; //ASCII code fo X
        ch = (char) b;
        System.out.println("ch: " + ch); // cast between incompatible types

    }
}
