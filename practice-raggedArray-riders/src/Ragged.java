public class Ragged {
    public static void main(String[] args) {
        int[][] riders = new int[7][]; //allocate the first dimension only but manually allocate the second dimension
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2]; //10 elements in the first five but 2 elements in the last two

        int i, j;
        for (i = 0; i < 5; i++)
            for (j = 0; j < 10; j++)  //the size for j is 10
                riders[i][j] = i + j + 10; // it calculates the total for each cell
        for (i = 5; i < 7; i++)
            for (j = 0; j < 2; j++)  //the size for j is 2
                riders[i][j] = i + j + 10;

        System.out.println("riders per trip during the week are: ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println("riders per trip during the weekend are: ");
        for (i = 5; i < 7; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
    }
} //good for large 2D arrays that is sparsely populated - one in which not all of the elements will be used
