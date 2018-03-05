package com.kodilla.good.patterns.challenges.order;

public interface AvailabilityService {
    boolean checkAvailability(OrderRequest orderRequest);

    void decreaseStock(OrderRequest orderRequest);
}
