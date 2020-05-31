package com.renee;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int i;
//        for (i = 0; i <= 100; i++) {
//            if ((i % 2) == 0) {
//                // another way to have the same output is to use continue if ((i % 2) != 0) continue;
//                System.out.println(i);
//            }
//        }
        //continue with a label
        outerloop:
        for(int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i + " , Inner loop: ");
            for(int j = 1; j < 10; j++) {
                if(j == 5) continue outerloop;
                System.out.print(j); // when you want the two statements to be printed on the same line, use print not println
            }
        }
    }
}
