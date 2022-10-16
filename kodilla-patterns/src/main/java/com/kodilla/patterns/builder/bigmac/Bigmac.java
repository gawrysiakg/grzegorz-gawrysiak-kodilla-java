package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private String bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder{
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun){
            if (bun.equals("Sesame") || bun.equals("Normal")) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Only Normal or Sesame");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if(burgers<=0){
                throw new IllegalStateException("Not enough burgers");
            }
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce){
            if (sauce.equals("Barbecue") || sauce.equals("1000 Islands") || sauce.equals("Standard")) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Type of sauce should be Barbecue, 1000 Islands or Standard");
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (ingredient.equals("Salad") || ingredient.equals("Onion") || ingredient.equals("Cucumber")
                    || ingredient.equals("Bacon") || ingredient.equals("Chilli peppers") || ingredient.equals("Champignons")
                    || ingredient.equals("Prawns") || ingredient.equals("Cheese")) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Type of ingredient should be one of these: Salad, Onion, Bacon, Cucumber, Chilli peppers, Champignons, Prawns, Cheese");
            }
            return this;
        }

        public Bigmac build(){
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
        private Bigmac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
            this.bun = bun;
            this.burgers = burgers;
            this.sauce = sauce;
            this.ingredients = new ArrayList<>(ingredients);
        }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
