public class StaticDemo {
    int x;  //normal instance variable
    static int y;   //a static variable - only one copy of y for all objects to share
    int sum() {
        return x + y;
    }

    //static method
    static int valDiv2() {
        return y/2;
    }
}
