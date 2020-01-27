package com.ecom.ordermanagement.repository;

import com.ecom.ordermanagement.model.OrderDetails;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OrderDetailsRepository extends ReactiveMongoRepository<OrderDetails,Long> {
}
