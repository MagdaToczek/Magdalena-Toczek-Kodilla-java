package com.kodilla.good.patterns.challenges.order;

public final class OrderRequest {
    private final User user;
    private final Product product;
    private final int quantity;
    private final String deliveryMethod;

    public OrderRequest(final User user, final Product product, final int quantity, final String deliveryMethod) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.deliveryMethod = deliveryMethod;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }
}
