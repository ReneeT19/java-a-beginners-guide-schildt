public class Circle extends TwoDShape {
    Circle() {
        super();
    }
    Circle(double w, double h) {
        super(w, h, "circle"); //call superclass constructor
    }

    Circle(double x) {
        super(x, "circle");
    }

    Circle(Circle ob) { //pass object to TwoDShape constructors
        super(ob);
    }

    double area() {
        return (getWidth()/2) * (getWidth()/2) * 3.14;
    }
}
