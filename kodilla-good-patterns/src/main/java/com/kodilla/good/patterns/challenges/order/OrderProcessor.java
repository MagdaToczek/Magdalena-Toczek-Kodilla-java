package com.kodilla.good.patterns.challenges.order;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private ProductAvailabilityService productAvailabilityService = new ProductAvailabilityService();
    private int orderNo = 0;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto order(final OrderRequest orderRequest) {
        boolean isOrderRequest = orderService.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getDeliveryMethod());

        if(isOrderRequest && productAvailabilityService.checkAvailability(orderRequest)) {
            orderNo += orderNo;
            orderRepository.saveOrder(orderRequest.getUser(), orderRequest.getProduct(),orderNo);
            productAvailabilityService.decreaseStock(orderRequest);
            informationService.sendOrderConfirmation(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(),true);
        }else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
