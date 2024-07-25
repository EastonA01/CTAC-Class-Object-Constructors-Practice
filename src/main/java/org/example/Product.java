package org.example;

public class Product {
    // Variables
    private final String name;
    private final double price;
    private final int quantity;
    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void totalCost(Product product){
        double total = product.price * product.quantity;
        System.out.println("Total cost is " + total);
    }

    public void printProduct(Product product){
        System.out.println(product.name + " costs " + product.price + " and " + product.quantity + " units were purchased.");
    }
}
