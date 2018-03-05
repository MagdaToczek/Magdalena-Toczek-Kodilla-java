package com.kodilla.good.patterns.challenges.shop;

import java.util.HashMap;
import java.util.Map;

public class ProductOrderService {
    private Map<String, Shop> shopMap = new HashMap();

    public ShopDto order(OrderRequest orderRequest) {
        boolean isOrdered = shopMap.get(orderRequest.getShopName()).process(orderRequest);

        if(isOrdered) {
            return new ShopDto(shopMap.get(orderRequest.getShopName()), true);
        }
        return new ShopDto(shopMap.get(orderRequest.getShopName()), false);
    }

    public void addShop(String shopName, Shop shop) {
        shopMap.put(shopName, shop);
    }
}
