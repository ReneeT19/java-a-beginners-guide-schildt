public class Queue <T> { //of type T
    private T[] arr;  //create an array variable
    private int head = 0;
    private int tail = 0;
    Queue(int size) {
        @SuppressWarnings("unchecked")
        T[] arr = (T[]) new Object[size];  //create an object of this array
        this.arr = arr;
    }
    public void enqueue (T el) throws Exception {
        if(head + arr.length == tail) throw new Exception("Queue overflow");
        arr[tail++ % arr.length] = el;
    }
    public T dqueue () throws Exception {
        if(head == tail) throw new Exception("Queue underflow");
        return arr[head++ % arr.length];
    }
}