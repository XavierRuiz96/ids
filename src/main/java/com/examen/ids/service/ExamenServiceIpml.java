package com.examen.ids.service;

import com.examen.ids.model.Airport;
import com.examen.ids.model.Country;
import com.examen.ids.model.Employee;
import com.examen.ids.model.Language;
import com.examen.ids.repository.AirportRepository;
import com.examen.ids.repository.CountryRepository;
import com.examen.ids.repository.EmployeeRepository;
import com.examen.ids.repository.LanguageRepository;
import com.examen.ids.util.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamenServiceIpml implements ExamenService{
    @Autowired
    AirportRepository airportRepository;
    @Autowired
    CountryRepository countryRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    LanguageRepository languageRepository;

    @Override
    public boolean guardarCliente(Cliente cliente) {

       try {
           Airport airport = new Airport();
           Country country = new Country();
           Employee employee = new Employee();
           Language language = new Language();
           airport.setName(cliente.getNombreAeropuerto());
           country.setName(cliente.getPais());
           employee.setFirstName(cliente.getNombre());
           employee.setSurName(cliente.getApellido());
           language.setName(cliente.getPais());
           airportRepository.save(airport);
           countryRepository.save(country);
           employeeRepository.save(employee);
           languageRepository.save(language);
            return true;
       }catch(NullPointerException ex){
           System.out.println("no existe");
           return false;
       }

    }
}
