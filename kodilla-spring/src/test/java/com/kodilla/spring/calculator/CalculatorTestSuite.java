package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations(){
        //Given
        //When
        calculator.add(5.25, 13.5);
        calculator.sub(155.001,49.99);
        calculator.mul(20.00, 3.00);
        calculator.div(100.00, 2.50);
        //Then
    }
}
