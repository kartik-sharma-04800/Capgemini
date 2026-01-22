package UMS;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi");
        Student s2 = new Student("Sneha");

        Professor p1 = new Professor("Dr Rao");

        Course c1 = new Course("Java");
        Course c2 = new Course("Data Structures");

        c1.assignProfessor(p1);
        c2.assignProfessor(p1);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        System.out.println(s1.name + " courses:");
        for (Course c : s1.courses) {
            System.out.println(c.name);
        }

        System.out.println("Professor teaching Java: " + c1.professor.name);
    }
}
