package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomsOrderDecorator extends AbstractPizzaOrderDecorator{

    public MushroomsOrderDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" + mushrooms");
    }
}
