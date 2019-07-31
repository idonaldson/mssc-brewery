package com.idonaldson.msscbrewery.web.services;

import com.idonaldson.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
