package com.examen.ids.service;

import com.examen.ids.model.Airport;
import com.examen.ids.model.Country;

import java.util.List;

public interface CountryService {
    Country findById(int id);
    List<Country> findAll();
    void delete(Country country);
    void update(Country country);
    Country save(Country country);
}
