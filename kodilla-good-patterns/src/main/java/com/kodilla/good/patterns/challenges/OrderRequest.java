package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private Product product;
    private User user;
    private  int orderedProductQuantity;

    public OrderRequest(final Product product, final User user, final int orderedProductQuantity) {
        this.product = product;
        this.user = user;
        this.orderedProductQuantity = orderedProductQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public int getOrderedProductQuantity() {
        return orderedProductQuantity;
    }
}
