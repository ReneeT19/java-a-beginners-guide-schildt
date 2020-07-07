public class Rectangle extends TwoDShape{
    boolean isSquare() {
        if(getHeight() == getHeight()) return true;
        return false;
    }
    double area() {
        return getHeight() * getHeight();
    }
}
