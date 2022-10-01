package com.kodilla.good.patterns.challenges.Food2Door;

public class BusServiceDelivery implements DeliveryService {
    @Override
    public void createDelivery(FoodProduct foodProduct) {
        System.out.println("Sending transport for "+foodProduct.getProductName());
    }
}
