public class ForEach {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
//        //use for-each style for loop
//        for(int x : nums) {
//            System.out.println("Value is: " + x);
//            sum += x;
//        }
//        System.out.println("The summation is: " + sum);
//
        //use it for a 2D array
        int sum = 0;
        int[][] nums = new int[3][5];
        //give nums some values
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);
        //use for each loop
        for(int x[]: nums) {
            for(int y : x){
                System.out.println("Value is: " + y);
                sum += y;
            }
        } System.out.println("Summation is: " + sum);
    }
}
//if you need to terminate the loop early, use a break statement such as if(x == 5) break;
//if you have a statement of x = x * 10 it won't change the numbers in nums and the printout will be the same
