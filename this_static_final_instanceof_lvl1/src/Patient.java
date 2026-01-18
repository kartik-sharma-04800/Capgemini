public class Patient {
    private static String hospitalName = "City General Hospital";
    private static int totalPatients = 0;
    
    private final String patientID;
    private String name;
    private int age;
    private String ailment;
    
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }
    
    public static String getHospitalName() {
        return hospitalName;
    }
    
    public void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
    
    public static void main(String[] args) {
        Patient patient1 = new Patient("Robert Taylor", 45, "Fever", "PAT001");
        Patient patient2 = new Patient("Emily White", 32, "Cough", "PAT002");
        
        if (patient1 instanceof Patient) {
            patient1.displayDetails();
        }
        
        if (patient2 instanceof Patient) {
            patient2.displayDetails();
        }
        
        getTotalPatients();
    }
}
