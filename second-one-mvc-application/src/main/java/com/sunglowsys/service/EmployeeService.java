package com.sunglowsys.service;

import service.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
   Employee save(Employee employee);
   Employee update(Employee employee);
   List<Employee>findAll();
   Optional<Employee>findOne(Long id);
   void delete(Long id);

}
