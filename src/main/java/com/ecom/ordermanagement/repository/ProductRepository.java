package com.ecom.ordermanagement.repository;


import com.ecom.ordermanagement.model.ProductType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<ProductType, String> {

}
