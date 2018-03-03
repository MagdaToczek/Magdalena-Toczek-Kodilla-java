package com.kodilla.good.patterns.challenges.order;

public interface OrderRepository {
    boolean createOrder(User user, Product product, int orderNo);
}
