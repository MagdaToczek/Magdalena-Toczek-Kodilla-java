package com.kodilla.good.patterns.challenges.shop;

public class GlutenFreeShop implements Shop {
    @Override
    public boolean process(Supplier supplier, Product product) {
        return true;
    }
}
