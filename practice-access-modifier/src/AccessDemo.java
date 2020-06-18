public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha()); //private members can be accessed using setAlpha() and getAlpha() methods
        //can't do ob.alpha = 10 because alpha is private but you can do
        ob.beta = 88;
        ob.gamma = 99;
    }
}
