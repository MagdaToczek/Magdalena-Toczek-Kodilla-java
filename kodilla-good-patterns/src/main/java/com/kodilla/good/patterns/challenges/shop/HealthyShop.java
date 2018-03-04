package com.kodilla.good.patterns.challenges.shop;

public class HealthyShop implements Shop {
    @Override
    public boolean process(Supplier supplier, Product product) {
        return true;
    }
}
