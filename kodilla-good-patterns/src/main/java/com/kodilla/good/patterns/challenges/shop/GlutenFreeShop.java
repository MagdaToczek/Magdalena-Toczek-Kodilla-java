package com.kodilla.good.patterns.challenges.shop;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Shop {
    private String SHOP_NAME = "GlutenFreeShop";
    private Map<String, Integer> productAvailabilityDb = new HashMap<String, Integer>() {{
        put("Orkiszowe ciasteczka", 56);
        put("Kasza jaglana", 0);
        put("Mąka ryżowa", 7);
    }};

    public boolean checkAvailability(OrderRequest orderRequest) {
        if (productAvailabilityDb.get(orderRequest.getProduct().getName()) > orderRequest.getQuantity()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        if (orderRequest.getShopName().equals(SHOP_NAME) && checkAvailability(orderRequest)) {
            return true;
        }
        return false;
    }
}
