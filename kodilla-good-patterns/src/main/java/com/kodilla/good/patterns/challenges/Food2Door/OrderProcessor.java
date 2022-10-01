package com.kodilla.good.patterns.challenges.Food2Door;


public class OrderProcessor {
    private FoodProducer foodProducer;
    private DeliveryService deliveryService;

    public OrderProcessor(final FoodProducer foodProducer, final DeliveryService deliveryService) {
        this.foodProducer = foodProducer;
        this.deliveryService = deliveryService;
    }


    public OrderFoodDto process(final OrderFoodRequest orderFoodRequest) {
        boolean isOrdered = foodProducer.process(orderFoodRequest.getOrderedFoodProduct(), orderFoodRequest.getToOrderQuantity());

    if (isOrdered){
        deliveryService.createDelivery(orderFoodRequest.getOrderedFoodProduct());
        return new OrderFoodDto(orderFoodRequest.getOrderedFoodProduct(), orderFoodRequest.getToOrderQuantity(), true);
    } else {
        return new OrderFoodDto(orderFoodRequest.getOrderedFoodProduct(), orderFoodRequest.getToOrderQuantity(), false);
    }


    }





}
