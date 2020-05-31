package com.renee;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int n, d, q;
//        n = 10;
//        d = 2;
//        if(d!=0 && (n % d) == 0) System.out.println(d + " is a factor of " + n);
//        d = 0;
//        if(d!=0 && (n % d) == 0) System.out.println(d + " is a factor of " + n); //it prevents a division by zero
//
        int i = 0;
        if(false & (++i<100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i);  //display 1; i incremented even though the if statement fails
        if(false && (++i<100)) 
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); //still 1; i does not increment because the short-circuit skipped it
        // if your code expects the right-hand operand of an AND or OR operation to be evaluated, you should use non-short-circuit
    }
}
