package com.kodilla.good.patterns.challenges.order;

public class AllegroOrderRepository implements OrderRepository {
    @Override
    public boolean saveOrder(User user, Product product, int orderNo) {
        System.out.println("Creating item in database...");
        return true;
    }
}
