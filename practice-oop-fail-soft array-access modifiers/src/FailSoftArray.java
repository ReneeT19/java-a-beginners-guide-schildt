public class FailSoftArray {
    private int[] a;    //reference to array
    private int errval; //value to return if get() fails
    public int length;

    //constructors
    public FailSoftArray(int length, int errval) {
        a = new int[length];
        this.errval = errval;
        this.length = length;
    }
    //methods   //set the indexOK method first to check whether the index is within bounds
    //return value at given index
    public int get(int index) {
        if(indexOK(index))
            return a[index];
        return errval;
    }
    //put a value at an index. Return false on failure
    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a[index] = val;
            return true;
        } return false;
    }

    private boolean indexOK(int index) {
        if(index >= 0 && index < length)
            return true;
        return false;
    }
}
