package School;

public class Main {
    public static void main(String[] args) {
        School school = new School("ABC School");

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Priya");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        System.out.println(s1.name + " enrolled courses:");
        for (Course c : s1.courses) {
            System.out.println(c.name);
        }

        System.out.println("Students in Math:");
        for (Student s : c1.students) {
            System.out.println(s.name);
        }
    }
}
