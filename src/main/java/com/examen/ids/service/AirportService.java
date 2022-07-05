package com.examen.ids.service;

import com.examen.ids.model.Airport;
import com.examen.ids.model.Language;

import java.util.List;

public interface AirportService {
    Airport findById(int id);
    List<Airport> findAll();
    void delete(Airport airport);
    void update(Airport airport);
    Airport save(Airport airport);
}
