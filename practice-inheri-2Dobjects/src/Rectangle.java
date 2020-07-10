public class Rectangle extends TwoDShape{

    Rectangle() {
        super();
    }
    Rectangle(double w, double h) {
        super(w, h, "rectangle"); //call superclass constructor
    }

    Rectangle(double x) {
        super(x, "rectangle");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }
    boolean isSquare() {
        if(getHeight() == getHeight()) return true;
        return false;
    }
    //override area() for Rectangle
    double area() {
        return getHeight() * getHeight();
    }
    }
