public class varargs {

    static void vaTest(String msg, int...v) {
        System.out.println(msg + v.length);
        System.out.println("contents: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ":" + v[i]);
    }
    static void vaTest(boolean...v) {
        System.out.println("vaTest(boolean...): " + "number of args: " + v.length);
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ":" + v[i]);
        }

    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No vararg: ");
        vaTest(true, false, false);
    }
}

