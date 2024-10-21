package Interface.P6;

public class Hostel {
    String hostelName, hostelLocation;
    int numberofRooms;

    public Hostel(String hostelName, String hostelLocation, int numberofRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberofRooms = numberofRooms;
    }

    public Hostel() {
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public String getHostelLocation() {
        return hostelLocation;
    }

    public void setHostelLocation(String hostelLocation) {
        this.hostelLocation = hostelLocation;
    }

    public int getNumberofRooms() {
        return numberofRooms;
    }

    public void setNumberofRooms(int numberofRooms) {
        this.numberofRooms = numberofRooms;
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "hostelName='" + hostelName + '\'' +
                ", hostelLocation='" + hostelLocation + '\'' +
                ", numberofRooms=" + numberofRooms +
                '}';
    }
}
