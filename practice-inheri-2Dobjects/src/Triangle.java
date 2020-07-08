public class Triangle extends TwoDShape{
    //a subclass
    private String style;   //make it private

    //added a default constructor
    Triangle() {
        super();
        style = "none";
    }
    //constructor
    Triangle(String s, double w, double h) {
        super(w, h, "triangle");    //call superclass constructor
        //initialize TwoDShape portion of object
//        setWidth(w);
//        setHeight(h);
        style = s;
    }
    //added a one-parameter constructor
    Triangle(double x) {
        super(x, "triangle");
//        setHeight(x);
        style = "filled";
    }

    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        //overriden area() for Triangle
        //use accessors when the instances variables in the superclass are set private, otherwise use them directly
        return getHeight() * getHeight() / 2;  //refer to the members of the superclass as if they were part of the subclass
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
