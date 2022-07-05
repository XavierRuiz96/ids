package com.examen.ids.controller;

import com.examen.ids.model.Airport;
import com.examen.ids.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airport")
public class AirportController {
    @Autowired
    AirportService airportService;
    @GetMapping( "/obtener/{id}")
    public Airport obtenerPorId(@PathVariable int id){
        return airportService.findById(id);
    }
    @GetMapping("/obtenerTodos")
    public List<Airport> obtenerTodos(){
        return airportService.findAll();
    }
    @PostMapping("/guardar")
    public Airport guardar(@RequestBody Airport airport){
        return airportService.save(airport);
    }

    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Airport airport){
        airportService.update(airport);
    }
    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody Airport airport){
        airportService.delete(airport);
    }

}
