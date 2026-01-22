package CompanyAndDepartments;

public class Main {

    public static void main(String[] args) {

        Company kartikinc = new Company("KartikInc");

        kartikinc.addDepartment("HR");
        kartikinc.addDepartment(("IT"));

        kartikinc.getDepartment().get(0).createEmployee(new Employee("XYZ",2993));
        kartikinc.getDepartment().get(1).createEmployee(new Employee("ABC",23221));


//        kartikinc = null;



        }

}




