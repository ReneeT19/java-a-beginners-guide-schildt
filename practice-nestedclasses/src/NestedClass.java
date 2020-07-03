public class NestedClass {
    public static void main(String[] args) {
        int[] x = {3,2,1,5,6,9,7,8};
        Outer outOb = new Outer(x); //outer object needed to access method analyze in outer class
        outOb.analyze();
    }
}
