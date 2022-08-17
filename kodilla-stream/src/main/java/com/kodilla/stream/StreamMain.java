package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("This is a example text created with  expression", String::toUpperCase));
        System.out.println(poemBeautifier.beautify("This is a example text created with lambda expression", text->text.concat(" ¯|_(0.0)_/¯")));
        System.out.println(poemBeautifier.beautify("This is a example text created with lambda expression", text->text.toLowerCase().concat(" ->")));
        System.out.println(poemBeautifier.beautify("This is a example text created with lambda expression ", text->text.toUpperCase().repeat(2).replace(' ', '_')));
        System.out.println(poemBeautifier.beautify("This is a example text created with lambda expression", text->text.replace("text", "EXTRA TEXT")));

    }
}