package com.ecom.ordermanagement.service;

import com.ecom.ordermanagement.model.Order;
import com.ecom.ordermanagement.model.OrderDetails;
import com.ecom.ordermanagement.model.ShoppingCart;
import reactor.core.publisher.Mono;

public interface OrderService {

    Mono<Order> createOrder(Order order);
    Mono<OrderDetails> createOrderDetails(OrderDetails orderDetails);
    Mono<ShoppingCart> addProductToShippingCart(ShoppingCart shoppingCart);
}
