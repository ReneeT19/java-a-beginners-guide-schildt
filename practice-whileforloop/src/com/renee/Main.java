package com.renee;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int e;
        int result;
        for(int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while(e > 0) {  //while loop checks the condition first
                result *= 2;
                e--;
            } System.out.println("2 to the  " + i + " the power is " + result); // when e=0, while loop is skipped
        }
    }
}
