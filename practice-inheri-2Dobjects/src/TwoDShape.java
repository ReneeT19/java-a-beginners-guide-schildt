public class TwoDShape {
    //the superclass
    //simple class hierarchy
    private double width, height;

    //added a default constructor
    TwoDShape() {
        width = height = 0.0;
    }
    //parameterized constructor - inherited in Triangle by using super(parameters)
    TwoDShape(double w, double h) {
        width = w+1;
        height = h+1;
    }
    //added a one-parameter constructor
    TwoDShape(double x) {
        width = height = x;
    }

    //accessor methods
    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
    void setWidth(double w) {
        width = w;
    }
    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}
