package com.renee;

public class Main {

    public static void main(String[] args)
    throws java.io.IOException { //this line is needed when reading a character from keyboard
	// write your code here
        char ch;
        System.out.println("Press a key followed by ENTER: ");
        ch = (char) System.in.read(); //read a character from the keyboard
        System.out.println("Your key is: " + ch);
    }
}
// enter a key below in the terminal area to see the outcome
