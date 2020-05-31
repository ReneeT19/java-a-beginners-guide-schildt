class MyClass {
    int x;
//    MyClass() {  //an example with no constructor parameter
//        x = 10;  //this bracket shows a simple constructor equal to object name.instance variable = value;
//        //if not initializing x=10 and take this entire line out, the output will be 0 0 because a default numeric constructor is 0
//    }
        MyClass(int i) {   //an example with constructor parameter; no value is specified here but in the main method below
        x = i;
    }
}

public class ConsDemo {
    public static void main(String args[]) {
//        MyClass t1 = new MyClass(); // call the method to assign the value 10 to object t1
//        MyClass t2 = new MyClass();
//
        MyClass t1 = new MyClass(10); //call the method to assign i to 10
        MyClass t2 = new MyClass(200);
        System.out.println(t1.x + " " + t2.x);  // use t1.x to call the method directly in print function
    }
}
