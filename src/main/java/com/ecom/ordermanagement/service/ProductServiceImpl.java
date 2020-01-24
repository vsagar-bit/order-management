package com.ecom.ordermanagement.service;

import com.ecom.ordermanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements  ProductService {

    @Autowired
    ProductRepository productRepository;
}
