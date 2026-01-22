package CompanyAndDepartments;

import java.util.ArrayList;

public class Department {

    String departmentName;
    ArrayList<Employee>employees = new ArrayList<>();

    public Department(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public void createEmployee(Employee employee)
    {
        employees.add(employee);
    }






}
