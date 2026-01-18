public class Employee {
    private static String companyName = "Tech Solutions Inc";
    private static int totalEmployees = 0;
    
    private final int id;
    private String name;
    private String designation;
    
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    
    public static void displayTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
    
    public static String getCompanyName() {
        return companyName;
    }
    
    public void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice Brown", 101, "Developer");
        Employee emp2 = new Employee("Bob Wilson", 102, "Manager");
        
        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }
        
        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }
        
        displayTotalEmployees();
    }
}
