package com.renee;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int num = 100;
//        for(int i = 0; i < num; i++) {
//            if(i * i >= num) break; //terminate loop when the condition is met
//            System.out.println(i + " ");
//        } System.out.println("loop complete"); //even though i is defined to be less than num, the loop is terminated because of the break
//
//        // break in nested loops; only terminated inner loop
//        for(int i = 0; i < 3; i++) {
//            System.out.println("Outer loop count: " + i);
//            System.out.println("   Inner loop count: ");
//
//            int t = 0;
//            while(t < 100) {
//                if(t == 10) break; //terminates when t=10
//                System.out.println(t + " ");
//                t++;
//            }
//        System.out.println();
//        }
//    System.out.println("Loops complete");
//    //break with a label
//        int i;
//        for(i = 1; i < 4; i++) {
//            one: {
//            two: {
//            three: {
//                System.out.println("\ni is " + i);
//                if(i==1) break one;
//                if(i==2) break two;
//                if(i==3) break three;
//                System.out.println("won't print");
//                } System.out.println("after block three");
//            } System.out.println("after block two");
//            } System.out.println("after block one");
//        } System.out.println("after for.");
//
//        // break with a label example 2
//        done:
//            for(int i = 0; i < 10; i++) {
//                for(int j = 0; j < 10; j++) {
//                    for(int k = 0; k < 10; k++) {
//                        System.out.println(k + " ");
//                        if(k == 5) break done; //jump to done
//                    } System.out.println("After k loop");
//                } System.out.println("After j loop");
//            } System.out.println("After i loop");
//
            //where you put a label is important
        int x = 0, y = 0;
    //put a label before for statement
        stop1: for(x = 0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop1;  // only prints y=0 and y=1; stops at y=2
                System.out.println("x and y: " + x + " " + y);
            }
        }
    System.out.println();
    //put a label before {
        for(x = 0; x < 5; x++)
        stop2: {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop2; // only prints y=0 and y=1 but prints x=0,1,2,3,4 because the outer loop is not affected
                System.out.println("x and y: " + x + " " + y);
            }
        }
        }
}
