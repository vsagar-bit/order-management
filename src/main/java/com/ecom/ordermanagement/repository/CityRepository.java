package com.ecom.ordermanagement.repository;

import com.ecom.ordermanagement.model.City;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CityRepository extends ReactiveMongoRepository<City, String> {
}
