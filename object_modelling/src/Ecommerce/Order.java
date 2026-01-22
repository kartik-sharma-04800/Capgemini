package Ecommerce;

import java.util.ArrayList;

public class Order {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
}
