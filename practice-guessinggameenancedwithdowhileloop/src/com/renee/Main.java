package com.renee;

public class Main {

    public static void main(String[] args)
    throws java.io.IOException {
        char ch, ignore, answer = 'K';
        do {
            System.out.println("I'm thinking of a letter from A to Z.");
            System.out.println("Can you guess it?");
            ch = (char) System.in.read();
            //discard any other characters in the input buffer
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');  // this follows the do-while structure that the condition goes to the bottom

            if (ch == answer) System.out.println("**Right**");
            else {
                System.out.println("Sorry, you are ");
                if (ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again! \n");
            }
        }  while(answer != ch); //to complete the first do statement a while condition needs to go here to start from the beginning when the input is not K
    }
}
