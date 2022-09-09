package com.sunglowys.repostery;

import com.sunglowys.domain.Employee;

import java.util.List;

public interface EmployeeRepository {
    Employee save(Employee employee);
    Employee update(Employee employee,Integer id);
    Employee findById(Integer id);
    List<Employee> findAll();
    void delete(Integer id);


}

