package com.examen.ids.service;

import com.examen.ids.model.Country;
import com.examen.ids.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    CountryRepository countryRepository;
    @Override
    public Country findById(int id) {
        return countryRepository.findById(id).get();
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public void delete(Country country) {
        countryRepository.delete(country);
    }

    @Override
    public void update(Country country) {
        countryRepository.save(country);
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }
}
