package com.kodilla.good.patterns.challenges.shop;

public final class ShopDto {
    private final Shop shop;
    private final boolean isOrdered;

    public ShopDto(final Shop shop, final boolean isOrdered) {
        this.shop = shop;
        this.isOrdered = isOrdered;
    }

    public Shop getShop() {
        return shop;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
