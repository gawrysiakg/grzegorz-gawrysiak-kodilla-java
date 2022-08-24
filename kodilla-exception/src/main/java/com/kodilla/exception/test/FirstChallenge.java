package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            System.out.println("First example 3/2 = ");
            double result = firstChallenge.divide(3, 2);
            System.out.println(result);
            System.out.println("Second example 3/0 = ");
            result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception! You are trying to divide by 0! " + e);
        } finally {
            System.out.println("The result of first challenge is above.");
        }
    }
}