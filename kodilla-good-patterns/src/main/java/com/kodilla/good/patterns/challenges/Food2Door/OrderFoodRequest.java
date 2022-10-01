package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderFoodRequest {
    private FoodProduct foodProduct;
    private int toOrderQuantity;

    public OrderFoodRequest(final FoodProduct foodProduct, final int toOrderQuantity) {
        this.foodProduct = foodProduct;
        this.toOrderQuantity = toOrderQuantity;
    }

    public FoodProduct getOrderedFoodProduct() {
        return foodProduct;
    }


    public int getToOrderQuantity() {
        return toOrderQuantity;
    }
}
