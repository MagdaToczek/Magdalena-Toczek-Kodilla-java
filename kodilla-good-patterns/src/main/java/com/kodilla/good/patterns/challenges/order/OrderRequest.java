package com.kodilla.good.patterns.challenges.order;

public class OrderRequest {
    public User user;
    public Product product;
    public int quantity;
    public String deliveryMethod;

    public OrderRequest(User user, Product product, int quantity, String deliveryMethod) {
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
