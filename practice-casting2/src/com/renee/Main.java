package com.renee;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        for(i = 0; i < 5; i++) {
            System.out.println(i + " / 3:" + i / 3);
            System.out.println(i + " / 3 with fractions: " + (double) i / 3); //casting int to double
            System.out.println();
        }
    }
}
