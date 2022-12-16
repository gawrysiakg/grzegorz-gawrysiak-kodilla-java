package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    private PizzaOrder theOrder = new BasicPizzaOrder();

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        //PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        //PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testHamAndMushroomsPizzaOrderGetCost() {
        // Given
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(23), calculatedCost);
    }

    @Test
    public void testHamAndMushroomsPizzaOrderGetDescription() {
        // Given
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza with tomato sauce and cheese + ham + mushrooms", description);
    }

    @Test
    public void testFullIngradientsXXlPizzaOrderGetCost() {
        // Given
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new OnionOrderDecorator(theOrder);
        theOrder = new SpicySauceOrderDecorator(theOrder);
        theOrder = new PizzaXXLOrderDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(37), calculatedCost);
    }

    @Test
    public void testFullIngradientsXXlPizzaOrderGetDescription() {
        // Given
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new OnionOrderDecorator(theOrder);
        theOrder = new SpicySauceOrderDecorator(theOrder);
        theOrder = new PizzaXXLOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza with tomato sauce and cheese + ham + mushrooms + onion + spicy sauce + xxl pizza version", description);
    }

}
