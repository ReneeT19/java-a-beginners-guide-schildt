public class StaticDemo {
    int x;  //normal instance variable
    static int y;   //a static variable - only one copy of y for all objects to share
    static double rootOf2;
    int sum() {
        return x + y;
    }

    //add a static block - when the variable needs to be initialized before creating objects.
    static {
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(2.0);
    }
    //static method
    static int valDiv2() {
        return y/2;
    }
}
