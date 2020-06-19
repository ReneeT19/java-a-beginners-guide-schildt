import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Average[] arrayD = new Average[3];

        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = new Average();
        }

        arrayD[0].setValue(1.1);
//        BigDecimal _arrayD[0] = new BigDecimal("1.1");
//        BigDecimal barrayD2 = new BigDecimal("2.2");
        arrayD[1].setValue(2.2);
        arrayD[2].setValue(3.3);

        Average.getAverage(arrayD);
    }
}

class Average {
    static double sum;
    double value;

    public Average() {
        this.value = 0;
        this.sum = 0;

    }

    public void setSum(double sum) {
        this.sum = sum;
    }
    public double getSum() {
        return this.sum;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return this.value;
    }

    public static void getAverage(Average[] arrayD) {
        for(int i = 0; i < arrayD.length; i++) {
            sum += arrayD[i].value;     //can't be arrayD[i] because it won't mean anything
            System.out.println(sum);
        }
        System.out.println("Average is: " + String.format("%.1f", (sum / arrayD.length)));
    }
}
