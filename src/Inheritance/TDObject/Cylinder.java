package Inheritance.TDObject;

public class Cylinder extends ThreeDObject{
    private double height;
    private double radius;
    public Cylinder(double height, double radius) {
        super("Cylinder");
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }
}
