package com.ecom.ordermanagement.repository;

import com.ecom.ordermanagement.model.Country;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CountryRepository extends ReactiveMongoRepository<Country, String> {
}
