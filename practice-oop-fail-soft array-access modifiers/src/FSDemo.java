public class FSDemo {
    public static void main(String[] args) {

        FailSoftArray fs = new FailSoftArray(5, -1);    //use class name when creating an object
        int x;

        //quiet failure
        System.out.println("fail quietly.");
        for (int i = 0; i < (fs.length * 2); i++)
            fs.put(i, i * 10);
        for (int i = 0; i < (fs.length * 2); i++) {    //you can use it twice if you need the same for loop contidion
            x = fs.get(i);
            if (x != -1)
                System.out.print(x + " ");
        }
        System.out.println("");

        //failure
        System.out.println("\nFail with error reports.");
        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i * 10))
                System.out.println("index " + i + " out-of-bounds");
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1)
                System.out.print(x + " ");
            else
                System.out.println("index " + i + " out-of-bounds");
        }
    }
}
