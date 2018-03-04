package com.kodilla.good.patterns.challenges.shop;

import com.kodilla.good.patterns.challenges.order.User;

public class OrderRequest {
    private Supplier supplier;
    private Product product;
    private int quantity;

    public OrderRequest(Supplier supplier, Product product, int quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
