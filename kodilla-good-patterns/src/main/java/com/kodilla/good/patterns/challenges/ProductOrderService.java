package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private User user;
    private Product product;

    public ProductOrderService(final User user, final Product product) {
        this.user = user;
        this.product = product;
    }

    public OrderDto order() {
        return new OrderDto();
    }
}
