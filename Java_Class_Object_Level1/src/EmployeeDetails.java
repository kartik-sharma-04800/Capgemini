public class EmployeeDetails {

    int id;
    String name;
    double salary;

    public EmployeeDetails(int id,String name,double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails()
    {
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary);
    }

    public static void main(String[] args) {

        EmployeeDetails empDetails = new EmployeeDetails(1,"Kartik",35000.0);

        empDetails.displayDetails();

    }

}


