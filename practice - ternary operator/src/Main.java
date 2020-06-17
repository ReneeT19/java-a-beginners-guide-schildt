public class Main {

    public static void main(String[] args) {
	int result;
	for(int i = -5; i < 6; i++) {
	    result = i != 0 ? 100 / i : 0;  //this prevents a divide-by-zero
        if(i != 0)
            //or combine the two lines above without assigning a value
            //if(i != 0 ? true: false) system.out.print("100 / " + i + " is " + 100/i);
            System.out.println("100 / " + i + " is " + result);
        }
    }
}
