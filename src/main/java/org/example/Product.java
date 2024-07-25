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

    public void totalCost(){
        double total = this.price * this.quantity;
        System.out.println("Total cost is " + total);
    }

    public void printProduct(){
        System.out.println(this.name + " costs " + this.price + " and " + this.quantity + " units were purchased.");
    }
}
