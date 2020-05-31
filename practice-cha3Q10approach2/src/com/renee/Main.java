package com.renee;

public class Main {

    public static void main(String[] args)
            throws java.io.IOException {
        // write your code here
        char ch, answer = '.';
        int changes = 0;
        System.out.println("Enter your sentence here and end with a period");
        do {
            ch = (char) System.in.read();
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32;    //refer to ASCII code
                changes++;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
                changes++;
            } System.out.print(ch);
        } while (ch != '.');
        System.out.println("The number of changes is: " + changes);
    }
}
