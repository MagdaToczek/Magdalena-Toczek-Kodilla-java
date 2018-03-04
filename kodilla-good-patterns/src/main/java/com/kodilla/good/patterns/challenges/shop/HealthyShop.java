package com.kodilla.good.patterns.challenges.shop;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Shop {
    private Map<String, Integer> orderedProducts = new HashMap<String, Integer>();

    @Override
    public boolean process(Supplier supplier, Product product, int quantity) {
        if(supplier.getName().equals("HealthyShop")) {
            orderedProducts.put(product.getName(), quantity);
            return true;
        }else {
            return false;
        }
    }
}
