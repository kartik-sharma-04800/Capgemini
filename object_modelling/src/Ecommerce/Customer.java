package Ecommerce;

public class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order");
    }
}