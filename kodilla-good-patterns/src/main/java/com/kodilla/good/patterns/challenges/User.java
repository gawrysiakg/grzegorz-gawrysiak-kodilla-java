package com.kodilla.good.patterns.challenges;

public class User {
    private final String userName;
    private final String name;
    private final String surname;
    private final String address;
    private int productQuantity;

    public User(final String userName, final String name, final String surname, final String address, final int productQuantity) {
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.productQuantity = productQuantity;
    }

    public String getUserName() {
        return userName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
