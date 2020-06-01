class ArrayDemo {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;
        for(i = 0; i < 10; i++)
            sample[i] = i;
        for(i = 0; i < 10; i++) //needs to type this for statement twice so it won't go beyond the scope of 10
        System.out.println("This is sample[" + i + "] " + sample[i]);
    }
}
