package com.kodilla.good.patterns.challenges.shop;

import java.util.HashMap;
import java.util.Map;

public class ProductOrderService {
    private Map<String, Shop> shopMap = new HashMap();

    public ShopDto order(OrderRequest orderRequest) {
        Shop shopName = shopMap.get(orderRequest.getShopName());
        boolean isOrdered = shopName.process(orderRequest);

        return new ShopDto(shopName, isOrdered);
    }

    public void addShop(String shopName, Shop shop) {
        shopMap.put(shopName, shop);
    }
}
