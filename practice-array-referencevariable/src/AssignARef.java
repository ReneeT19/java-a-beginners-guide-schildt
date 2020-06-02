public class AssignARef {
    public static void main(String[] args) {
        int i;
        int[] nums1 = new int[10];
        int[] nums2 = new int[20];
        for(i = 0; i < 10; i++)
            nums1[i] = i;
        for(i = 0; i < 20; i++)
            nums2[i] = i;

        System.out.print("Here is nums1: ");
        for(i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("Here is nums2: ");
        for(i = 0; i < 20; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1; //assign an array reference and now nums2 refers to nums1
        System.out.print("Here is nums2 after change: ");
        for(i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2[3] = 99; //operate on nums1 array through nums2

        System.out.print("Here is nums1 after change through nums2: ");
        for(i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
    } //both nums1 and nums2 arrays refer to the same object
}

