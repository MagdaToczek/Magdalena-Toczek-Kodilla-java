package com.kodilla.good.patterns.challenges.order;

import java.util.HashMap;
import java.util.Map;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private int orderNo = 0;
    private Map<String, Integer> productAvailability = new HashMap<String, Integer>(){{
        put("skarpetki", 1000);
        put("kalosze", 5);
        put("sekator", 56);
    }};

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto order(final OrderRequest orderRequest) {
        boolean isOrdered = false;
        boolean isOrderRequest = orderService.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getDeliveryMethod());

        if(isOrderRequest && productAvailability.get(orderRequest.getProduct().getName()) > orderRequest.getQuantity()) {
            isOrdered = true;
        }else {
            System.out.println("There is not enough products");
        }

        if(isOrdered) {
            orderNo += orderNo;
            informationService.inform(orderRequest.getUser());
            orderRepository.saveOrder(orderRequest.getUser(), orderRequest.getProduct(),orderNo);
            productAvailability.replace(orderRequest.getProduct().getName(), (productAvailability.get(orderRequest.getProduct().getName())-1));
            return new OrderDto(orderRequest.getUser(),true);
        }else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
