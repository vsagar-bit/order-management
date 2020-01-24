package com.ecom.ordermanagement.service;

import com.ecom.ordermanagement.model.Country;
import com.ecom.ordermanagement.model.State;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AddressService {

    Mono<Country> createCountry(Country country);
    Mono<ResponseEntity<Country>> getCountry(String id);
    Flux<Country> getListOfCountries();
    //State Apis
    Mono<State> addState(State state);

    Flux<State> stateList();
}
