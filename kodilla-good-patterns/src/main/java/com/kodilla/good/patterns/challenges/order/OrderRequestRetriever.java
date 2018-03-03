package com.kodilla.good.patterns.challenges.order;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Michael", "Kowalski", "Potokowa 5, 80-510 Gdańsk", "+48 456789345", "michael.kowalski@gmail.com");
        Product product = new Product("skarpetki", 2.3);
        int quantity = 5;
        String delivery = "kurier";

        return new OrderRequest(user, product, quantity, delivery);
    }
}
