public class StrOps {
    public static void main(String[] args) {
        String str1 = "good";
        String str2 = new String(str1);
        String str3 = "great";
        int result, idx;
        char ch;

        System.out.println("length of str1: " + str1.length());
        //display str1, one char at a time
        for(int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i)); //obtain the character at the index specified by index
        System.out.println();
        if(str1.equals(str2))  //use .equals in strings not ==
            System.out.println("str1 equals str2");
        else
            System.out.println("str1 does not equal str2");

        if(str1.equals(str3))  //use .equals in strings not ==
            System.out.println("str1 equals str3");
        else
            System.out.println("str1 does not equal str3");

        result = str1.compareTo(str3);
        if(result == 0)
            System.out.println("str1 equals str3");
        else if(result < 0)
            System.out.println("str1 is less than str3");
        else
            System.out.println("str1 is greater than str3");

        //assign a new string to str2
        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Index of first occurrence of one: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of last occurrence of one: " + idx); // prints out 14 as each character counts as one index from 0
   }
}
