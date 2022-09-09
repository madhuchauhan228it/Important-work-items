package com.sunglowsys.service.impl;

import com.sunglowsys.domain.Employee;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee save(Employee employee);

    Employee update(Employee employee, Long id);

    List<Employee> findAll(Pageable pageable);

    Optional<Employee> findOne(Long id);

    void delete(Long id);
}
