package com.renee;

public class Main {

    public static void main(String[] args) {
	// find factors of numbers between 2 and 100
        for(int i = 2; i <=100; i++) {
            System.out.println("Factors of " + i + ": ");
            for(int j = 2; j < i; j++)
                if((i % j) == 0) System.out.println(j + " "); // 2 will be printed every time because it's initialized as j=2
                System.out.println();
            }//track the changes using a table will help follow the output
        }

    }

