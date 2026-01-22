package UMS;

public class Course {
    String name;
    Professor professor;

    public Course(String name) {
        this.name = name;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }
}
