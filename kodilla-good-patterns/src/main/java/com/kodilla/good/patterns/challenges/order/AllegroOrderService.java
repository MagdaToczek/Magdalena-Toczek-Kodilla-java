package com.kodilla.good.patterns.challenges.order;

public class AllegroOrderService implements OrderService {
    @Override
    public boolean createOrder(OrderRequest orderRequest) {
        System.out.println("Creating an order...");
        return true;
    }
}
