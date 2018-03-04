package com.kodilla.good.patterns.challenges.shop;

public class ShopDto {
    private Supplier supplier;
    private boolean isOrdered;

    public ShopDto(Supplier supplier, boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
