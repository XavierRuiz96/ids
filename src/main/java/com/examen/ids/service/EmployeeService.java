package com.examen.ids.service;

import com.examen.ids.model.Country;
import com.examen.ids.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findById(int id);
    List<Employee> findAll();
    void delete(Employee employee);
    void update(Employee employee);
    Employee save(Employee employee);
}
