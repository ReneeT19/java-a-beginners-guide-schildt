package com.renee;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        if(b) // just boolean variable itself is sufficient in if statement
             System.out.println("This is executed.");  // if b means true so this line is printed
        b = false;
        if(b) System.out.println("This is not executed.");  // if b means true so this line is not printed
        System.out.println("10 > 9 is " + (10 > 9)); //the output will translate 10>9 to true in boolean var

    }
}
