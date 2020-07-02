public class SDemo {
    public static void main(String[] args) {
    StaticDemo ob1 = new StaticDemo();
    StaticDemo ob2 = new StaticDemo();

    //each object has its own copy of an instance variable //ob1.x and ob2.x are independent
        ob1.x = 10;
        ob2.x = 20;
    //each object shares one copy of a static variable
        StaticDemo.y = 19;
        System.out.println(ob1.sum() + " " + ob2.sum());
        StaticDemo.y = 100;
        System.out.println(ob1.sum() + " " + ob2.sum());

        System.out.println(StaticDemo.valDiv2());
    }
}
