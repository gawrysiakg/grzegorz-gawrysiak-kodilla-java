package com.kodilla.good.patterns.challenges;

public class Product {
    private final String productName;
    private final double price;
    private final int availableQuantity;

    public Product(final String productName, final double price, final int availableQuantity) {
        this.productName = productName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }
}
