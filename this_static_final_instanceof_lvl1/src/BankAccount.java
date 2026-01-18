public class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;
    
    private final String accountNumber;
    private String accountHolderName;
    
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    
    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }
    
    public static String getBankName() {
        return bankName;
    }
    
    public void displayDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
    
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", "ACC001");
        BankAccount account2 = new BankAccount("Jane Smith", "ACC002");
        
        if (account1 instanceof BankAccount) {
            account1.displayDetails();
        }
        
        if (account2 instanceof BankAccount) {
            account2.displayDetails();
        }
        
        getTotalAccounts();
    }
}
