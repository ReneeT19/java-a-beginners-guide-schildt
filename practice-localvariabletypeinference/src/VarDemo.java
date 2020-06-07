public class VarDemo {
    public static void main(String[] args) {
        var avg = 10.0;         //use var as the type of declaration to infer type of avg //only used when the variable is initialized
        System.out.println("value of ave: " + avg);
        int var = 1;            //var is used as a variable name here
        System.out.println("value of var: " + var);
        var k = -var;           //used both as the type of declaration and as the variable name
        System.out.println("value of k: " + k);
    }
}
