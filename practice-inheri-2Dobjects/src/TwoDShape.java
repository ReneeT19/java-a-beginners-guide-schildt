public class TwoDShape {
    //the superclass
    //simple class hierarchy
    private double width, height;

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
