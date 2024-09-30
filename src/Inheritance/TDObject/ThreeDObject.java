package Inheritance.TDObject;

public class ThreeDObject {

    private String name;
    public ThreeDObject() {
        this.name = "Nam nai";
    }
    public ThreeDObject(String name) {
        this.name = name;
    }
    public double wholeSurfaceArea() {
        System.out.println("Parent Method WSArea");
        return 0;
    }
    public double area(){
        System.out.println("Parent Method Area");
        return 0;
    }
    public void display() {
        System.out.println("Name of 3D object :" + name);
        System.out.println("Whole surface area of 3D object :" + wholeSurfaceArea());
        System.out.println("Area of 3D object :" + area());
    }
}
