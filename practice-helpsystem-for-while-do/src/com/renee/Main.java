package com.renee;

public class Main {

    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;
        do {                // add a do loop here
            System.out.println("Help on: ");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.println("Choose one: ");

            choice = (char) System.in.read();
            do {               // another do loop here
                ignore = (char) System.in.read();
            } while (ignore != '\n');       //use ignore in do loop to discard unwanted characters remaining in the input buffer
        } while (choice < '1' | choice > '5'); //if choice is <1 or >5 go back to the beginning of the first do loop and execute
        //expand the switch statements to include for, while, and do-while
        //***a full list of the structure of all loop functions
        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("  statement sequence");
                System.out.println("  break");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.println("for(init; condition; iteration");
                System.out.println(" statement");
                break;
            case '4':
                System.out.println("The while: \n");
                System.out.println("while(condition) statement");
                break;
            case '5':
                System.out.println("The do-while: \n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println(" } while(condition);");
                break;   //because the main menu sets the value to be valid all the time, no default statement is needed
        }
    }
}