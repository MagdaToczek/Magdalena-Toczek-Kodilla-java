package com.kodilla.good.patterns.challenges.order;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new AllegroOrderService(), new AllegroOrderRepository());
        orderProcessor.order(orderRequest);
    }
}
