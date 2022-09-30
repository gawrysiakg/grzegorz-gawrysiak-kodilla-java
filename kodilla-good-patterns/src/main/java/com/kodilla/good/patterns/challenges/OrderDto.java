package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User user;
    private Product product;
    private int orderedProductQuantity;
    boolean isOrdered;

    public OrderDto(final User user, final Product product, final int orderedProductQuantity, boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.orderedProductQuantity = orderedProductQuantity;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderedProductQuantity() {
        return orderedProductQuantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
