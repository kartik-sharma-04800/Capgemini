public class Student {
    private static String universityName = "State University";
    private static int totalStudents = 0;
    
    private final String rollNumber;
    private String name;
    private String grade;
    
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }
    
    public static String getUniversityName() {
        return universityName;
    }
    
    public void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
    
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }
    
    public static void main(String[] args) {
        Student student1 = new Student("Tom Anderson", "STU001", "A");
        Student student2 = new Student("Sarah Lee", "STU002", "B");
        
        if (student1 instanceof Student) {
            student1.displayDetails();
        }
        
        if (student2 instanceof Student) {
            student2.displayDetails();
            student2.updateGrade("A");
            System.out.println("Updated grade:");
            student2.displayDetails();
        }
        
        displayTotalStudents();
    }
}
