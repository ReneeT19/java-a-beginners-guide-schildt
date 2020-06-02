public class MinMax {
    public static void main(String[] args) {
        int[] nums = new int[10];
        //instead of using new operator, we can initialize the arrays by typing
        //int[]nums = {99, -10, ..., 49};
         int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;
        min = max = nums[0];  //you can have both min and max in one project
        for(int i = 1; i < 10; i++) { //i has to be less than 10 because that's what's defined the size in the beginning
            //otherwise it's called an overrun or underrun error
            //usually i starts at 0, but at 1 here because it's a min max problem so comparison exists
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("The min is " + min  + " and the max is " + max);
    }
}
