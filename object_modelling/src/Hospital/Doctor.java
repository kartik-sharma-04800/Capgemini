package Hospital;

public class Doctor {
    String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println(name + " is consulting " + patient.name);
    }
}
