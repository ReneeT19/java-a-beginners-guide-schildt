class ChkNum {
    //return true if x is even
    boolean isEven(int x) {   //x is an integer parameter of isEven()
        if((x % 2) == 0) return true;
        else return false;
    }
}
//the variable declaration with parameter (not arguments) and method as well as return outcome should go to this helper class
//the arguments(or say assigned values) and object creation as well as printout should go to the main class
public class ParmDemo {
    public static void main(String args[]) {
        //create an object called e
        ChkNum e = new ChkNum();
        if(e.isEven(10)) System.out.println("10 is even.");  //pass arguments to isEven()
        if(e.isEven(9)) System.out.println("9 is even.");
    }
}


