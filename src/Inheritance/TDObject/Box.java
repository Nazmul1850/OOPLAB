package Inheritance.TDObject;

public class Box extends ThreeDObject{

    private double l,b,h;
    public Box(double l,double b,double h) {
//        super("Box");
        this.l=l;
        this.b=b;
        this.h=h;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (l*b + b*h + h*l);
    }

    @Override
    public double area() {
        return l*b*h;
    }
}
