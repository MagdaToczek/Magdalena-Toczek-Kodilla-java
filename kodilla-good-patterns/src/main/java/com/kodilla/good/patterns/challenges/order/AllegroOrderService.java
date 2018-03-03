package com.kodilla.good.patterns.challenges.order;

import java.util.HashMap;
import java.util.Map;

public class AllegroOrderService implements OrderService {
    @Override
    public boolean createOrder(User user, Product product, int quantity, String deliveryMethod) {
        System.out.println("Creating an order...");
        return true;
    }
}
