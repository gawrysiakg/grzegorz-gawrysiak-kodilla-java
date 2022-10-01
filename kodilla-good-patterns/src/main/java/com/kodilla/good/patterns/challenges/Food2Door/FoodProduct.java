package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodProduct {
    private String productName;
    private int productStock;
    private FoodProducer foodProducer;

    public FoodProduct(final String productName, final int productStock, final FoodProducer foodProducer) {
        this.productName = productName;
        this.productStock = productStock;
        this.foodProducer = foodProducer;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductStock() {
        return productStock;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }
}
