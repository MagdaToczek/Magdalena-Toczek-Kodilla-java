package com.kodilla.good.patterns.challenges.order;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private AvailabilityService availabilityService;
    private int orderNo = 0;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository, final AvailabilityService availabilityService) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.availabilityService = availabilityService;
    }

    public OrderDto order(final OrderRequest orderRequest) {
        boolean isOrderRequest = orderService.createOrder(orderRequest);

        if (isOrderRequest && availabilityService.checkAvailability(orderRequest)) {
            orderNo += orderNo;
            orderRepository.saveOrder(orderRequest.getUser(), orderRequest.getProduct(),orderNo);
            availabilityService.decreaseStock(orderRequest);
            informationService.sendOrderConfirmation(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(),true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
