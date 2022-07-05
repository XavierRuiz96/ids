package com.examen.ids.service;

import com.examen.ids.model.Airport;
import com.examen.ids.model.Language;
import com.examen.ids.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AirportServiceImpl implements AirportService{
    @Autowired
    AirportRepository airportRepository;
    @Override
    public Airport findById(int id) {

        return airportRepository.findById(id).get();
    }

    @Override
    public List<Airport> findAll() {
        return airportRepository.findAll();
    }

    @Override
    public void delete(Airport airport) {
        airportRepository.delete(airport);
    }

    @Override
    public void update(Airport airport) {
    airportRepository.save(airport);
    }

    @Override
    public Airport save(Airport airport) {
        return airportRepository.save(airport);
    }
}
