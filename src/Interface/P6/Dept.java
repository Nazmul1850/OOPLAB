package Interface.P6;

public class Dept implements DepartmentInterface{
    String head;
    String dean;
    String deptName;
    int strength;

    public Dept(String head, String dean, String deptName, int strength) {
        this.head = head;
        this.dean = dean;
        this.deptName = deptName;
        this.strength = strength;
    }

    @Override
    public String getHead() {
        return this.head;
    }

    @Override
    public int getStudentNumber() {
        return this.strength;
    }

    @Override
    public String getDean() {
        return this.dean;
    }
    @Override
    public String getName() {
        return this.deptName;
    }
}
