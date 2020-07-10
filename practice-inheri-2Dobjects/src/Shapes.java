public class Shapes {
    public static void main(String[] args) {
//        Triangle t1 = new Triangle("filled", 4.0, 4.0);
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);
        Rectangle r1 = new Rectangle();
        Circle ci1 = new Circle(4);
        ColorTriangle c1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);

        TwoDShape[] shapes = new TwoDShape[5];
        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new TwoDShape(10,20,"generic");

        for(int i = 0; i < shapes.length; i++) {
        System.out.println("Object is: " + shapes[i].getName());
        System.out.println("Area is: " + shapes[i].area());     //the proper version of area() is called for each shape
        System.out.println();
        }

//        t1.setWidth(4.0);
//        t1.setHeight(4.0);
//        t1.style = "filled";        //all members of Triangle are available to Triangle objects, even those inherited from TwoDShape
//
//        t2.setWidth(8.0);
//        t2.setHeight(12.0);
//        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is: " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is: " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is: " + t3.area());

        System.out.println();

        r1.setWidth(10.0);
        r1.setHeight(10.0);

        System.out.println("Info for r1: ");
        System.out.println(r1.isSquare());
        r1.showDim();
        System.out.println("Area is: " + r1.area());

        //ColorTriangle object can call methods defined by itself and its superclasses.
        System.out.println("Info for c1: ");
        c1.showStyle();
        c1.showDim();
        c1.showColor();
        System.out.println("Area is: " + c1.area());

        System.out.println("Info for ci1: ");
        ci1.showDim();
        System.out.println("Area is: " + ci1.area());
    }


}
