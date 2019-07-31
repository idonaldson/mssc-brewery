package com.idonaldson.msscbrewery.web.services;

import com.idonaldson.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
