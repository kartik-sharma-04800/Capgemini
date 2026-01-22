package Ecommerce;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Kartik");

        Product p1 = new Product("Laptop");
        Product p2 = new Product("Mouse");

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);

        customer.placeOrder(order);

        System.out.println("Products in order:");
        for (Product p : order.products) {
            System.out.println(p.name);
        }
    }
}
