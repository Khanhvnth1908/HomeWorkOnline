package Students.Model;


public class ModelStudents {
    private String StudentId;
    private String StudentName;
    private String Address;
    private String Phone;


    public ModelStudents(){

    }

    public ModelStudents(String studentId) {
        StudentId = studentId;
    }

    public ModelStudents(String studentId, String studentName, String address, String phone) {
        StudentId = studentId;
        StudentName = studentName;
        Address = address;
        Phone = phone;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "ModelStudents{" +
                "StudentId='" + StudentId + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
