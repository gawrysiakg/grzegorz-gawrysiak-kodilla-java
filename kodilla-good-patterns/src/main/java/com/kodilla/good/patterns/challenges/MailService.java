package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService{
    @Override
    public void sendConfirmation(User user) {
        System.out.println("Sending message");
    }
}
