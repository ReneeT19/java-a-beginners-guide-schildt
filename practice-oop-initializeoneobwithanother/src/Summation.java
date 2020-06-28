public class Summation {
    public static void main(String[] args) {
        Sum s1 = new Sum(5);
        Sum s2 = new Sum(s1);   //use one ob to initialize another is efficient
        System.out.println(s1.sum);
        System.out.println(s2.sum);
    }
}
