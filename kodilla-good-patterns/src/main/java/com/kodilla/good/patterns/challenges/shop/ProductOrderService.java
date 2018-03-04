package com.kodilla.good.patterns.challenges.shop;

public class ProductOrderService {
    private Shop shop;

    public ProductOrderService(Shop shop) {
        this.shop = shop;
    }

    public ShopDto order(OrderRequest orderRequest) {
        boolean isOrdered = shop.process(orderRequest.getSupplier(), orderRequest.getProduct(), orderRequest.getQuantity());
        if(isOrdered) {
            return new ShopDto(orderRequest.getSupplier(), true);
        }else {
            return new ShopDto(orderRequest.getSupplier(), false);
        }
    }
}
