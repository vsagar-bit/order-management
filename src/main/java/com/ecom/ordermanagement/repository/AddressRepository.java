package com.ecom.ordermanagement.repository;

import com.ecom.ordermanagement.model.Address;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AddressRepository extends ReactiveMongoRepository<Address, String> {

}
