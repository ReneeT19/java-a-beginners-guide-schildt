package com.renee;

public class Main {

    public static void main(String[] args)
            throws java.io.IOException {
        // uppercase 65-90; lowercase 97-122
        char input, answer = '.';
        String result = "";
        int changes = 0; // to track the number of case changes
        System.out.println("Enter some characters (insert a period when finished): ");
        do {
            input = (char) System.in.read();
            if(isLower(input)) {
                input = (char) toUpper(input);
                changes++;
            } else if(isUpper(input)) {
                input = (char) toLower(input);
                changes++;
            }
            //System.out.print(input);
            result += input;
        } while (input != answer);

        System.out.print(result);
        System.out.println("The changes are: " + changes);

        System.out.print(isLower(input));
        System.out.print(isUpper(input));
        System.out.print(toLower(input));
        System.out.print(toUpper(input));
    }

    // isLower, isUpper, toLower, toUpper
    public static boolean isLower(char letter) {
        if ('a' <= letter && letter <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isUpper(char letter) {
        if ('A' <= letter && letter <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    public static int toLower(char letter) {
        if (isLower(letter)) ;
        return (char) letter + 32;
    }

    public static int toUpper(char letter) {
        if (isUpper(letter)) ;
        return (char) letter - 32;
    }
}

        //below is a different way to write the code
//    private static boolean isLower(char letter) {
//        return 'a' <= letter && letter <= 'z';
//    }
//    private static boolean isUpper(char letter) {
//        return 'A' <= letter && letter <= 'Z';
//    }
//    private static boolean toLower(char letter) {
//       return (char) (isUpper(letter)) ? letter + 32 : letter);
//    }
//
//    private static boolean toUpper(char letter) {
//       return (char) (isLower(letter)) ? letter - 32 : letter);
//    }

//        System.out.println("Stop when entering: ");
//        ch = (char) System.in.read();
//
//        if (ch == answer) System.out.println("**Right**");
//

