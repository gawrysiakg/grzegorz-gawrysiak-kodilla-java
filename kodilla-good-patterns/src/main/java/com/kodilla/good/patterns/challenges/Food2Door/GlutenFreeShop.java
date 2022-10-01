package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements FoodProducer {

    private String producerName;
    private String producerMail;
    private int producerStock;

    public GlutenFreeShop() {
        this.producerName =  "GlutenFreeShop";
        this.producerMail = "glutenfreeshop@gfs.pl";
        this.producerStock = 52;
    }

    @Override
    public boolean process(FoodProduct foodProduct, int toOrderQuantity) {
        if (toOrderQuantity < getProducerStock()) {
            System.out.println("Processing odder " + toOrderQuantity + " kg " + foodProduct.getProductName() + " in "+getProducerName());
            System.out.println("Sending mail to "+ getProducerMail());
            return true;
        } else {
            System.out.println(getProducerName() + " has only " + getProducerStock() +" kilograms "+foodProduct.getProductName());
            return false;
        }
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProducerMail() {
        return producerMail;
    }

    public int getProducerStock() {
        return producerStock;
    }
}

