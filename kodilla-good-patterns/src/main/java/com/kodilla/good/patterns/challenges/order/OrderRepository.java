package com.kodilla.good.patterns.challenges.order;

public interface OrderRepository {
    boolean saveOrder(User user, Product product, int orderNo);
}
