package com.kodilla.good.patterns.challenges.shop;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Shop {
    private Map<String, Integer> orderedProducts = new HashMap();
    private String SHOP_NAME = "HealthyShop";

    @Override
    public boolean process(OrderRequest orderRequest) {
        if(orderRequest.getShopName().equals(SHOP_NAME)) {
            orderedProducts.put(orderRequest.getProduct().getName(), orderRequest.getQuantity());
            return true;
        }
        return false;
    }
}
