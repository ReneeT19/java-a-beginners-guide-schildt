public class Sum {
    int sum;
    Sum(int num) {
        sum = 0;
        for(int i = 1; i <= num; i++)
        sum += i;
    }
    //construct from another object
    Sum(Sum ob) {
        sum = ob.sum;
    }
}
