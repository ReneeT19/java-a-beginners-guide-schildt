public class StringArrays {
    public static void main(String[] args) {
        String[] strs = {"This", "is", "a", "test"};
        String strs1 = "This is good.";

        System.out.println("Original array: ");
        for(String s : strs)
            System.out.print(s+ " ");
        System.out.println("\n");

        //change a string
        strs[1] = "was";
        strs[3] = "test, too!";

        System.out.println("Modified array: ");
        for(String s : strs)
            System.out.print(s + " ");

        //construct a substring
        String substr = strs1.substring(0, 5); // the start and end point as a character
        System.out.println("substr: " + substr);
    }
}
