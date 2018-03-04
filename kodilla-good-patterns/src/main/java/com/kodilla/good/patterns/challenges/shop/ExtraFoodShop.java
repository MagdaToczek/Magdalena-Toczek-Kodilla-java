package com.kodilla.good.patterns.challenges.shop;

public class ExtraFoodShop implements Shop {
    @Override
    public boolean process(Supplier supplier, Product product, int quantity) {
        if(supplier.getName().equals("ExtraFoodShop")) {
            System.out.println("Sending an e-mail with order");
            return true;
        } else {
            return false;
        }
    }
}
