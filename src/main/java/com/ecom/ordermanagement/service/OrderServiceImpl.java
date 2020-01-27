package com.ecom.ordermanagement.service;

import com.ecom.ordermanagement.model.Order;
import com.ecom.ordermanagement.model.OrderDetails;
import com.ecom.ordermanagement.model.ShoppingCart;
import com.ecom.ordermanagement.repository.OrderDetailsRepository;
import com.ecom.ordermanagement.repository.OrderRepository;
import com.ecom.ordermanagement.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class OrderServiceImpl implements OrderService{


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;


    @Autowired
    private ShoppingCartRepository shoppingCartRepository;


    @Override
    public Mono<Order> createOrder(Order order) {
       return orderRepository.save(order);
    }

    @Override
    public Mono<OrderDetails> createOrderDetails(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }

    @Override
    public Mono<ShoppingCart> addProductToShippingCart(ShoppingCart shoppingCart) {
        return shoppingCartRepository.save(shoppingCart);
    }
}
