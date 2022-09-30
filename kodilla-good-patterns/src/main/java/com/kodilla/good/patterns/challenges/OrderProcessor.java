package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private OrderService orderService;
    private InformationService informationService;
    private DistributionCenter distributionCenter;

    public OrderProcessor(final OrderService orderService, final InformationService informationService, final DistributionCenter distributionCenter) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.distributionCenter = distributionCenter;
    }


    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.sellProduct(orderRequest.getProduct(), orderRequest.getUser(), orderRequest.getOrderedProductQuantity());
        System.out.println("Process method in OrderProcessor");

        if (isOrdered){
            informationService.sendConfirmation(orderRequest.getUser());
            distributionCenter.sendOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderedProductQuantity());

            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderedProductQuantity(), true);

        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderedProductQuantity(), false);
        }
    }

}
