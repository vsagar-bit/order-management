package com.ecom.ordermanagement.repository;

import com.ecom.ordermanagement.model.Address;
import com.ecom.ordermanagement.model.Country;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AddressRepository extends ReactiveMongoRepository<Address, String> {

}
