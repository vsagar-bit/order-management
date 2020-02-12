package com.ecom.ordermanagement.service;

import com.ecom.ordermanagement.model.City;
import com.ecom.ordermanagement.model.Country;
import com.ecom.ordermanagement.model.State;
import com.ecom.ordermanagement.repository.AddressRepository;
import com.ecom.ordermanagement.repository.CityRepository;
import com.ecom.ordermanagement.repository.CountryRepository;
import com.ecom.ordermanagement.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    StateRepository stateRepository;

    @Autowired
    CityRepository cityRepository;

    @Override
    public Mono<Country> createCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Mono<ResponseEntity<Country>> getCountry(String id) {
        return countryRepository.findById(id)
                .map(existCountry -> ResponseEntity.ok().body(existCountry))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<State> addState(State state) {
        return stateRepository.save(state);
    }

    @Override
    public Flux<Country> getListOfCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Flux<State> stateList() {
        return stateRepository.findAll();
    }

    @Override
    public Mono<City> addCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public Flux<City> listCities() {
        return cityRepository.findAll();
        
    }
}
