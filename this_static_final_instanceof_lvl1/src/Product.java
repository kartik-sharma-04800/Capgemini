public class Product {
    private static double discount = 10.0;
    
    private final String productID;
    private String productName;
    private double price;
    private int quantity;
    
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    
    public static double getDiscount() {
        return discount;
    }
    
    public void displayDetails() {
        double discountedPrice = price - (price * discount / 100);
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: $" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Price: $" + discountedPrice);
        System.out.println("Quantity: " + quantity);
    }
    
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99, 5, "PROD001");
        Product product2 = new Product("Mouse", 29.99, 20, "PROD002");
        
        if (product1 instanceof Product) {
            product1.displayDetails();
        }
        
        updateDiscount(15.0);
        
        if (product2 instanceof Product) {
            product2.displayDetails();
        }
    }
}
