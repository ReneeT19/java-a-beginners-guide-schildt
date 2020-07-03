public class Reverse {
    String str;
    Reverse(String s) {
        str = s;
    }
    void backward(int idx) {
        if(idx != str.length()-1) backward(idx+1);  //recursion - a method calls itself by passing in new arguments
        System.out.print(str.charAt(idx));
    }
}
