package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(10,29);
        } catch(Exception e) {
            System.out.println("Exception occurred: " + e);
        } finally {
            System.out.println("Next time will be better...");
        }
    }
}
