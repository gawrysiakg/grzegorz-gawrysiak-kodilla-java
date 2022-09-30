package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        Product product1 = new Product("TV Samsung 55", 2999, 15);
        User user1 = new User("Admin1", "Adam", "Miłek", "32-200 Krosno, Krótka 3", 1);
        int orderedProductQuantity = 1;


        return new OrderRequest(product1, user1, orderedProductQuantity);
    }
}
