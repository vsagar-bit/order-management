package com.ecom.ordermanagement.repository;

import com.ecom.ordermanagement.model.Order;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OrderRepository extends ReactiveMongoRepository<Order,Long> {
}
