package com.renee;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        int i;
//        int sum = 0;
//        for(i = 0; i < 10; i++) {
//           sum = sum + i;
//        }
//        System.out.println("Sum is: " + sum);

        //problem 8
        int i, j;
        boolean  isPrime;
        for(i = 2; i < 100; i++) {  //start from 2 because 1 is prime to every number
            isPrime = true; //isPrime needs to be initialized here
            for(j = 2; j <= i / j; j++)
                if(i % j == 0) isPrime = false;
                if(isPrime) System.out.println(i + " is prime.");  //the scope is important; in this case, everything goes to the inner scope
            }
        }
    }
