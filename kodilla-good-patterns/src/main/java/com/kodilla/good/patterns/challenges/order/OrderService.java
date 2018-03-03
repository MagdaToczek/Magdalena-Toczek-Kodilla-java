package com.kodilla.good.patterns.challenges.order;

public interface OrderService {
    boolean createOrder(User user, Product product, int quantity, String deliveryMethod);
}
