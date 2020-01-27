package com.ecom.ordermanagement.controller;

import com.ecom.ordermanagement.model.Order;
import com.ecom.ordermanagement.model.OrderDetails;
import com.ecom.ordermanagement.model.ShoppingCart;
import com.ecom.ordermanagement.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orderManagement")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Order> createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }


    @PostMapping("/orderdetails")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<OrderDetails> createOrderDetails(@RequestBody OrderDetails orderDetails) {
        return orderService.createOrderDetails(orderDetails);
    }


    @PostMapping("/productToCart")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ShoppingCart> addProductToShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        return orderService.addProductToShippingCart(shoppingCart);
    }

}
