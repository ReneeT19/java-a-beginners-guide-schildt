package com.renee;

public class Main {

    public static void main(String[] args)
    throws java.io.IOException {
        char ch, space = ' ', answer = '.';
        int sum = 0;
        System.out.println("Enter a period to stop."); //important to have this line so easier to read the output
        do {
            ch = (char) System.in.read();
            if (ch == space) sum++;
        } while(ch != answer);
        System.out.println("The total of spaces is " + sum + ".");
    }
}
