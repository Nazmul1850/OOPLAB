package Interface.P6;

public class Student extends Hostel{
    String studentName, regdNo, electiveSubject;
    double avgMarks;
    Dept dept;
    Hostel hostel;

    public Student(String studentName, String regdNo, String electiveSubject, double avgMarks, Dept dept, Hostel hostel) {
        super(hostel.hostelName, hostel.hostelLocation, hostel.numberofRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
        this.dept = dept;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", regdNo='" + regdNo + '\'' +
                ", electiveSubject='" + electiveSubject + '\'' +
                ", avgMarks=" + avgMarks +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRegdNo() {
        return regdNo;
    }

    public void setRegdNo(String regdNo) {
        this.regdNo = regdNo;
    }

    public String getElectiveSubject() {
        return electiveSubject;
    }

    public void setElectiveSubject(String electiveSubject) {
        this.electiveSubject = electiveSubject;
    }

    public double getAvgMarks() {
        return avgMarks;
    }

    public void setAvgMarks(double avgMarks) {
        this.avgMarks = avgMarks;
    }
}
