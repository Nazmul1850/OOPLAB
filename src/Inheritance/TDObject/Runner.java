package Inheritance.TDObject;

public class Runner {
    public static void main(String[] args) {
        ThreeDObject tD = new Box(2,3,4);;
        tD.display();
        tD = new Cylinder(3,2);
        tD.display();
    }
}
