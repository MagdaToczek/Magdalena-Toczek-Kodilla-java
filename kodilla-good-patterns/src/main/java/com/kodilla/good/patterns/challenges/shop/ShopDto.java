package com.kodilla.good.patterns.challenges.shop;

public class ShopDto {
    private Supplier supplier;
    private Product product;
    private boolean isOrdered;

    public ShopDto(Supplier supplier, Product product, boolean isOrdered) {
        this.supplier = supplier;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
