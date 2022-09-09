package com.sunglowys.service;

import com.sunglowys.domain.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);
    Employee update(Employee employee,Integer id);
    Employee findById(Integer id);
    List<Employee> findAll();
    void delete(Integer id);


}
