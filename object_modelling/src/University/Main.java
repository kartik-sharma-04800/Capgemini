package University;

public class Main {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr Sharma");
        Faculty f2 = new Faculty("Dr Mehta");

        University uni = new University("Delhi University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Physics");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        System.out.println("University created");
        uni = null;
        System.out.println("University deleted");

        System.out.println("Faculty still exists: " + f1.name);
    }
}
