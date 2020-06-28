public class Queue {
    private char[] q;
    private int putloc, getloc;

    //construct an empty queue given its size
    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    //construct a queue from a queue
    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        //copy elements
        for(int i = getloc; i < putloc; i++) {
            q[i] = ob.q[i];
        }
    }
    //construct a queue with initial values
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];
        for(int i = 0; i < a.length; i++) {
            put(a[i]);
        }
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