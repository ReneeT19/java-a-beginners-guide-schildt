class Queue
    {
        char[] q;
        int putloc, getloc;  //the put and get indices
        //a Queue constructor with a parameter that will be used in the main class later to define the size
        Queue(int size) {
            //create the object
            q = new char[size];  //allocate memory for queue
            //initialize put and get to 0
            putloc = getloc = 0;  //put: place a new element on the end of the queue;
            //get: retrieve the next element from the front of the queue
            // < 0 1 - - - 5 - - - - 10 > // FIFO is queue and FILO is stack
        }
        //put a character into the queue
        void put(char ch) {     //how to use the put method // setters (mutator)
            if(putloc == q.length) {    //if putloc is equal to one past the last location in the q array, no room to store elements
                //otherwise the new element is stored at that location and putloc is incremented.
                System.out.println(" - Queue is full.");
                return;  //not returning a value but a method so the next line won't execute
            }
            q[putloc++] = ch;
        }
        char get() {      //how to use the get method // getters (accessor)
            if(getloc == putloc) {
                System.out.println(" - Queue is empty.");
            return (char) 0;  //return the value 0 when the queue is empty
            }
            return q[getloc++];
        }
    }
class QueueDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        System.out.println("Using bigQ to store the alphabet.");
        //put 26 letters into bigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));  //call the put method
        //retrieve and display the numbers in bigQ
        System.out.println("Contents of bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();     //call the get method
            if (ch != (char) 0)
                System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        for (i = 0; i < 5; i++) {
            System.out.println("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        //more errors on smallQ
        System.out.print("Contents of smallQ ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0)
                System.out.print(ch);
        }
    }
}
