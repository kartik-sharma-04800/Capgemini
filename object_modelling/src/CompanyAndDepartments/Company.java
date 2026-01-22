package CompanyAndDepartments;

import java.util.ArrayList;

public class Company {

    String companyName;

    ArrayList<Department>departments = new ArrayList<>();


    public Company(String companyName)
    {
        this.companyName = companyName;
    }


    public void addDepartment(String departmentName)
    {
        Department department = new Department(departmentName);
        departments.add(department);
    }

    public ArrayList<Department>getDepartment()
    {
        return departments;
    }

}
