package com.examen.ids.controller;

import com.examen.ids.model.Employee;
import com.examen.ids.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping( "/obtener/{id}")
    public Employee obtenerPorId(@PathVariable int id){
        return employeeService.findById(id);
    }
    @GetMapping("/obtenerTodos")
    public List<Employee> obtenerTodos(){
        return employeeService.findAll();
    }
    @PostMapping("/guardar")
    public Employee guardar(@RequestBody Employee airport){
        return employeeService.save(airport);
    }

    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Employee employee){
        employeeService.update(employee);
    }
    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody Employee employee){
        employeeService.delete(employee);
    }
}
