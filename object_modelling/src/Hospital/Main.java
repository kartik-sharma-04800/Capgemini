package Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor d1 = new Doctor("Dr Kumar");
        Doctor d2 = new Doctor("Dr Singh");

        Patient p1 = new Patient("Ankit");
        Patient p2 = new Patient("Suman");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
