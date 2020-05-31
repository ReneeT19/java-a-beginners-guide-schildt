package com.renee;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        for(i=0; i<10; i++)
            switch (i) {
                case 0: System.out.println("i is zero");
                break;
                case 1: System.out.println("i is one");
                break;
                case 2: System.out.println("i is two");
                break;
                case 3: System.out.println("i is three or more");
                break;
                case 4: System.out.println("i is three or more");
                break;
                default: System.out.println("i is three or more");
            }
        // no break
        for(i=0; i<=3; i++) {
            switch (i) {
                case 0: System.out.println("i is less than one");
                case 1: System.out.println("i is less than two");
                case 2: System.out.println("i is less than three");
            }
            System.out.println();
        }
        //empty cases
            switch (i) {
                case 1:
                case 2:
                case 3: System.out.println("i is 1, 2, or 3");
                break;
            }
    }
}
