package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements FoodProducer {

    private String producerName;
    private String producerMail;
    private int producerStock;

    public ExtraFoodShop() {
        this.producerName = "ExtraFoodShop";
        this.producerMail = "extrafoodshop@efs.pl";
        this.producerStock = 24;
    }

    @Override
    public boolean process(FoodProduct foodProduct, int toOrderQuantity) {
        if(toOrderQuantity<getProducerStock()) {
            System.out.println("Processing odder " + toOrderQuantity + " kg " + foodProduct.getProductName() + " in " + getProducerName());
            System.out.println("Sending mail to "+getProducerMail());
            return true;
        } else {
            System.out.println(getProducerName() + " has only " + getProducerStock() +" kilograms of "+foodProduct.getProductName());
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
