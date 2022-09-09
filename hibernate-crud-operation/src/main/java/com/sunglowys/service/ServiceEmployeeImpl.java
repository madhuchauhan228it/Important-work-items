package com.sunglowys.service;


import com.sunglowys.domain.Employee;
import com.sunglowys.repostery.EmployeeRepository;
import com.sunglowys.repostery.EmployeeRepositoryImpl;

import java.util.List;

public class ServiceEmployeeImpl implements EmployeeService {

    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();



    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee, Integer id) {
        return employeeRepository.update(employee, id);
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    @Override
    public void delete(Integer id) {
        employeeRepository.delete(id);

    }
}
