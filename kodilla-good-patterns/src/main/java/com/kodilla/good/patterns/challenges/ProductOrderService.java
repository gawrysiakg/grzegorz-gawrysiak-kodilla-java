package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {
    @Override
    public boolean sellProduct(Product product, User user, int orderedProductQuantity) {
        if (product.getAvailableQuantity() >= orderedProductQuantity) {
            System.out.println("Selling " + orderedProductQuantity + " pieces of " + product.getProductName() + " to " + user.getUserName());
            return true;
        } else {
            return false;
        }
    }
}
