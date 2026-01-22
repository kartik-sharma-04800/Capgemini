package School;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }
}
