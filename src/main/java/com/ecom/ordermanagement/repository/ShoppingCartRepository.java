package com.ecom.ordermanagement.repository;

import com.ecom.ordermanagement.model.ShoppingCart;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ShoppingCartRepository extends ReactiveMongoRepository<ShoppingCart,Long> {
}
