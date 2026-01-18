public class Vehicle {
    private static double registrationFee = 500.0;
    
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    
    public static double getRegistrationFee() {
        return registrationFee;
    }
    
    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
    }
    
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Mike Davis", "Car", "REG001");
        Vehicle vehicle2 = new Vehicle("Lisa Chen", "Motorcycle", "REG002");
        
        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayDetails();
        }
        
        updateRegistrationFee(600.0);
        
        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayDetails();
        }
    }
}
