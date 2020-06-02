public class Squares {
    public static void main(String [] args) {
        int[][] sqrs = {
                {1, 1}, //use comma to separate them
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100}
        };
        int i, j;
        for(i = 0; i < 10; i++) {   //i indicates the size for rows which is 10
            for(j = 0; j < 2; j++)  //j indicates the size for columns which is 2
                System.out.print(sqrs[i][j] + " ");
            System.out.println();
        }
    }
}
