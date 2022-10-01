package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderFoodRetriever {
    public OrderFoodRequest retrieve(){
        FoodProduct foodProduct1 = new FoodProduct("GlutenFree Cake", 3, new GlutenFreeShop());

        int toOrderQuantity = 10;


        return new OrderFoodRequest(foodProduct1, toOrderQuantity);
    }
}
