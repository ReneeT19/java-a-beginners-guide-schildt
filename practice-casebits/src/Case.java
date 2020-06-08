public class Case {
    public static void main(String[] args) {
        //lower to upper
        char ch;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);
            //this statement turns off the 6th bit and ch is now uppercase
            ch = (char) ((int) ch & 65503);
            System.out.println(ch + " ");
        }

        //upper to lower
        char ch1;
        for (int i = 0; i < 10; i++) {
            ch1 = (char) ('A' + i);
            System.out.print(ch1);
            ch1 = (char) ((int) ch1 | 32);
            System.out.println(ch1 + " ");
        }
    }
}
