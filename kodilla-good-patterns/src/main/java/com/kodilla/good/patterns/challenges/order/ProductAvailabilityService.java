package com.kodilla.good.patterns.challenges.order;

import java.util.HashMap;
import java.util.Map;

public class ProductAvailabilityService implements AvailabilityService{
    private Map<String, Integer> productAvailability = new HashMap<String, Integer>(){{
        put("skarpetki", 1000);
        put("kalosze", 5);
        put("sekator", 56);
    }};

    @Override
    public boolean checkAvailability(OrderRequest orderRequest) {
        return productAvailability.get(orderRequest.getProduct().getName()) > orderRequest.getQuantity();
    }

    @Override
    public void decreaseStock(OrderRequest orderRequest) {
        productAvailability.replace(orderRequest.getProduct().getName(), (productAvailability.get(orderRequest.getProduct().getName())-1));
    }
}
