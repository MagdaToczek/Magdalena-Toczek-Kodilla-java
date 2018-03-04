package com.kodilla.good.patterns.challenges.shop;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Shop {
    Map<String, Integer> productAvailabilityDb = new HashMap<String, Integer>() {{
        put("Orkiszowe ciasteczka", 56);
        put("Kasza jaglana", 0);
        put("Mąka ryżowa", 7);
    }};

    public boolean checkAvailability() {
        System.out.println("Method is checking availability of ordered products");
        return true;
    }
    @Override
    public boolean process(Supplier supplier, Product product, int quantity) {
        if(supplier.getName().equals("GlutenFreeShop")) {
            if(checkAvailability()) {
                System.out.println("Sending order to the shop");
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
