package Activities.hassan.JAVA.project.Student_Management_System.student_ms;

public class ElectiveCourse extends Course {

    public ElectiveCourse(String courseId, String courseName, int credits) {
        super(courseId, courseName, credits);
    }

    @Override
    public String toString() {
        return "Elective Course: " + super.toString();
    }

}

