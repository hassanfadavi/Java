package Activities.hassan.JAVA.project.Student_Management_System.student_ms;

public class GraduateStudent extends Student {

    public GraduateStudent(String studentId, String name, String email, String phoneNumber) {
        super(studentId, name, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "Graduate " + super.toString();
    }
}

