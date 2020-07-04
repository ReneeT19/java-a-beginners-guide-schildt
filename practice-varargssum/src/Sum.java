public class Sum {
    int sum(double z, int y,int...x) {
        int s = 0;
        for(int i = 0; i < x.length; i++) {
            s = s + x[i] + y - (int)z;
        } return s;
    }
}
