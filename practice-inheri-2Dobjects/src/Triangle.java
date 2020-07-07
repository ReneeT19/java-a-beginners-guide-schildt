public class Triangle extends TwoDShape{
    //a subclass
    String style;
    double area() {
        //use accessors when the instances variables in the superclass are set private, otherwise use them directly
        return getHeight() * getHeight() / 2;  //refer to the members of the superclass as if they were part of the subclass
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
