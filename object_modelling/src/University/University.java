package University;

import java.util.ArrayList;

public class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(String name) {
        departments.add(new Department(name));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}
