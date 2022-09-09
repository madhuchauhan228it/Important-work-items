package com.sunglowsys.service;

import service.Employee;
import service.EmployeeRepository;

import java.util.List;
import java.util.Optional;


public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return ;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Optional<Employee> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }


}
