package com.ecom.ordermanagement.controller;

import com.ecom.ordermanagement.model.Country;
import com.ecom.ordermanagement.model.State;
import com.ecom.ordermanagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/addressManagement")
public class AddressController {

    @Autowired
    AddressService addressService;


    @PostMapping("/addcountry")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Country> createCountry(@RequestBody Country country) {
        return addressService.createCountry(country);
    }

    @GetMapping("/country/{id}")
    public Mono<ResponseEntity<Country>> getCountry(@PathVariable("id") String id)
    {
        return addressService.getCountry(id);
    }

    @GetMapping("/countriesList")
    public Flux<Country> getListOfCountries()
    {
        return addressService.getListOfCountries();
    }

    @PostMapping("/addState")
    public Mono<State> addState(@RequestBody State state) {
        return addressService.addState(state);
    }

    @GetMapping("/stateList")
    public Flux<State> getStateList() {
        return  addressService.stateList();
    }
}
