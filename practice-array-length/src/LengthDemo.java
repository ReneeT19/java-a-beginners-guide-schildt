public class LengthDemo {
    public static void main(String[] args) {
        int[] list = new int[10];  //length is 10
        int[] numbers = {1, 2, 3}; //length is 3
        int[][] table = {   //a variable-length table   //length is 3
                {1, 2, 3}, //length is 3
                {4, 5},    // length is 2
                {6, 7, 8, 9}  //length is 4
        };
        System.out.println("length of list is " + list.length);
        System.out.println("length of numbers is " + numbers.length);
        System.out.println("length of table is " + table.length);  // to obtain the length of the table
        System.out.println("length of table[0] is " + table[0].length); // to obtain the length of each individual array in the table
        System.out.println("length of table[1] is " + table[1].length);
        System.out.println("length of table[2] is " + table[2].length);
        System.out.println();
        //use length to control a for loop
        for(int i = 0; i < list.length; i++)
            list[i] = i * i;
        System.out.print("Here is list: ");
        //use length to display list
        for(int i = 0; i < list.length; i++)
        System.out.print(list[i] + " ");
        System.out.println();
    }
}
