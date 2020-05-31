package com.renee;

public class Main {

    public static void main(String[] args) {
//	 write your code here
        boolean p, q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOTP");

        p = true;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        // if show 0s and 1s instead of true and false
//        boolean bools[][] = {  //create an array using "," to separate
//                {true, true},
//                {true, false},
//                {false, true},
//                {false, false}
//        };
//            System.out.println("P\tQ\tAND\tOR\tXOR\tNOTP");
//            for(boolean[] pq: bools) {
//                boolean p = pq[0];
//                boolean q = pq[1];
//                System.out.print(pad(boolToNumStr(p)));
//                System.out.print(pad(boolToNumStr(q)));
//                System.out.print(pad(boolToNumStr(p && q)));
//                System.out.print(pad(boolToNumStr(p || q)));
//                System.out.print(pad(boolToNumStr(p ^ q)));
//                System.out.println(pad(boolToNumStr(!p)));   // return and do a new row
//            }
//            }
//            private static String pad(String s) {
//                return s + "\t";
//            }
//            private static String boolToNumStr (boolean b) {
//                return b == true ? "1" : "0";  // ? means if b is true, return 1, otherwise return 0
    }
}

