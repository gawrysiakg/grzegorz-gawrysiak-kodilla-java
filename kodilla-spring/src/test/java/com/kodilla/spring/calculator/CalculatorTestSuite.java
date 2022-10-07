package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void addTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 5.5, b = 4.5;
        double result = calculator.add(a,b);
        //Then
        Assertions.assertEquals(10.0, result,0.1);
    }

    @Test
    public void subTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 5.5, b = 4.5;
        double result = calculator.sub(a,b);
        //Then
        Assertions.assertEquals(1.0, result,0.1);
    }

    @Test
    public void mulTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 5.5, b = 4.5;
        double result = calculator.mul(a,b);
        //Then
        Assertions.assertEquals(24.75, result,0.1);
    }

    @Test
    public void divTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 9, b = 4.5;
        double result = calculator.div(a,b);
        //Then
        Assertions.assertEquals(2.0, result,0.1);
    }
}
