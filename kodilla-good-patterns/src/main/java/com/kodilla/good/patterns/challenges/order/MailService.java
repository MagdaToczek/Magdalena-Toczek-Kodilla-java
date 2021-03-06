package com.kodilla.good.patterns.challenges.order;

public class MailService implements InformationService {
    @Override
    public void sendOrderConfirmation(User user) {
        System.out.println("Sending e-mail to: " + user.getMail());
    }
}
