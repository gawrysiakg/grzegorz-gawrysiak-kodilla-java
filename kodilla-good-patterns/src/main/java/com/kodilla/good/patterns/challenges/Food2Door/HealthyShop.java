package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements FoodProducer {

    private String producerName;
    private String producerMail;
    private int producerStock;


    public HealthyShop() {
        this.producerName =  "HealthyShop";
        this.producerMail = "healthyshop@hshop.pl";
        this.producerStock = 350;
    }


    @Override
    public boolean process(FoodProduct foodProduct, int toOrderQuantity) {
        if (toOrderQuantity < getProducerStock()) {
            System.out.println("Processing order " + toOrderQuantity + " kg of " + foodProduct.getProductName() + " in " + getProducerName());
            System.out.println("Sending mail to "+getProducerMail());
            System.out.println("I am sending the transport");
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
