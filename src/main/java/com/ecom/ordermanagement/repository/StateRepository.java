package com.ecom.ordermanagement.repository;

import com.ecom.ordermanagement.model.State;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StateRepository extends ReactiveMongoRepository<State, String> {
}
