public class Test {
    //primitive types are passed by value
//    void noChange(int i, int j) {
//        i = i + j;
//        j = -j;
//
//    }
    //objects are passed through their references
    int h, q;
    Test(int h, int q) {
        this.h = h;
        this.q = q;
    }
    void change(Test ob1) {
        ob1.h = ob1.h + ob1.q;
        ob1.q = -ob1.q;
        }
    }



class CallByValue {
    public static void main(String[] args) {
//        Test ob = new Test();
//        int a = 15, b = 20;
//        System.out.println("a and b before call: " + a + " " + b);
//        ob.noChange(a, b);
//        System.out.println("a and b after call: " + a + " " + b);

        //objects
        Test ob1 = new Test(15, 20);
        System.out.println("a and b before call: " + ob1.h + " " + ob1.q);
        ob1.change(ob1);
        System.out.println("a and b after call: " + ob1.h + " " + ob1.q);
    }
}

