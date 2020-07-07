public class Triangle extends TwoDShape{
    //a subclass
    String style;
    double area() {
        return width * height / 2;  //refer to the members of the superclass as if they were part of the subclass
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
