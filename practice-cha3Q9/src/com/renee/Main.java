package com.renee;

public class Main {
//power of two (2nd power)
    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i <= 128; i++) {
            int a = 2, progression = i;
            System.out.println(Math.pow(a, progression));
        }
        //alternatively, for(int i = 1; i <= 128; i *= 2) {
        //System.out.print(i + " "); }
    }
}
