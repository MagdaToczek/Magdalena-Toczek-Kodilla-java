package com.kodilla.good.patterns.challenges.shop;

public class ExtraFoodShop implements Shop {
    private String SHOP_NAME = "ExtraFoodShop";

    @Override
    public boolean process(OrderRequest orderRequest) {
        if(orderRequest.getShopName().equals(SHOP_NAME)) {
            System.out.println("Sending an e-mail with order");
            return true;
        }
        return false;
    }
}
