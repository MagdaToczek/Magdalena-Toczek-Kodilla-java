package com.kodilla.good.patterns.challenges.shop;

public class ProductOrderService {
    private Shop shop;

    public ProductOrderService(Shop shop) {
        this.shop = shop;
    }

    public void order(OrderRequest orderRequest) {
        boolean isOrdered = shop.process(orderRequest.getSupplier(), orderRequest.getProduct());
    }
}
