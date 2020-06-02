public class Bubble {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int t;
        int size = 10;
        //display original array
        System.out.print("The original array is: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
        //the Bubble sort has two for loops
        for (int a = 1; a < size; a++) //the outer loop causes this process to repeat until the entire array has been sorted
            for (int b = size - 1; b >= a; b--) { //the inner loop checks adjacent elements in the array looking for out-of-order elements
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1]; //when an out-of-order elements is found, the two elements are exchanged.
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        //display sorted array using the same code above
        System.out.print("Sorted array is: ");
        for (int i = 0; i < 10; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
