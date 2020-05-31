package com.renee;

public class Main {

    public static void main(String[] args)
    throws java.io.IOException {
        // write your code here
        char ch, answer = 'K';  // list two character variables in one line and initialize the second one
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it?");

        ch = (char) System.in.read();
//        if(ch == answer) System.out.println("**Right**");
//        else System.out.println("Sorry, you are wrong.");
        if (ch == answer) System.out.println("**Right**");
        else {
            System.out.print("Sorry, you are "); //it's print not println here because the next print will be on the same line
            //nested if
            if (ch < answer) System.out.println("two low");
            else System.out.println("two high");
        }
    }
}
