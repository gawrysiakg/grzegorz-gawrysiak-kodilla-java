package com.kodilla.patterns.builder.bigmac;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Onion")
                .ingredient("Cheese")
                .ingredient("Cucumber")
                .ingredient("Bacon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        List<String> ingredients = bigmac.getIngredients();
        //Then
        assertEquals(4, howManyIngredients);
        assertFalse(ingredients.stream().anyMatch(t -> t.equals ("Chilli peppers")));
    }
}


