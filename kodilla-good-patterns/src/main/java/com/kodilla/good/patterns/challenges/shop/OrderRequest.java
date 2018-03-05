package com.kodilla.good.patterns.challenges.shop;

public final class OrderRequest {
    private final String shopName;
    private final Product product;
    private final int quantity;

    public OrderRequest(final String shopName, final Product product, final int quantity) {
        this.shopName = shopName;
        this.product = product;
        this.quantity = quantity;
    }

    public String getShopName() {
        return shopName;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
