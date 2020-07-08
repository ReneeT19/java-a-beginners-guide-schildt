public class TwoDShape {
    //the superclass
    //simple class hierarchy
    private double width, height;
    private String name;

    //added a default constructor
    TwoDShape() {
        width = height = 0.0;
    }
    //parameterized constructor - inherited in Triangle by using super(parameters)
    TwoDShape(double w, double h, String n) {
        width = w+1;
        height = h+1;
        name = n;
    }
    //added a one-parameter constructor
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    //construct an object from an object
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
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
    String getName() {return name;}
    void setName(String n) {name = n;}
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
    double area() {
        System.out.println("area() must be overridden.");
        return 0.0;
    }
}
