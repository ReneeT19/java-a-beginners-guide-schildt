public class Outer {
    int[] nums;
    Outer(int[] n) {
        nums = n;
    }

    void analyze() {
        Inner inOb = new Inner();   //objects are needed because outer class can't access inner class members directly

        System.out.println("minimum: " + inOb.min());
        System.out.println("maximum: " + inOb.max());
        System.out.println("average: " + inOb.avg());

    }

    public class Inner {
        //an inner class has access to the members of its enclosing class but the opposite is not true
        //so an object needs to be created in outer class to assess members in inner class
        int min() {
            int m = nums[0];

            for(int i = 1; i < nums.length; i++)    //to compare so start from 1 not 0
                if(nums[i] < m) m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];
            for(int i = 1; i < nums.length; i++)
                if(nums[i] > m) m = nums[i];
            return m;
        }

        int avg() {
            int a = 0;
            for(int i = 0; i < nums.length; i++)
                a += nums[i];
            return a / nums.length;
        }
    }
}
