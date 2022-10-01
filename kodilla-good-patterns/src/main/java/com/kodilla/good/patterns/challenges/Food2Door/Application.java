package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {

        OrderFoodRetriever orderFoodRetriever = new OrderFoodRetriever();
        OrderFoodRequest orderFoodRequest = orderFoodRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new GlutenFreeShop(), new BusServiceDelivery());
        orderProcessor.process(orderFoodRequest);


    }
}
