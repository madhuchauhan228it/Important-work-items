package com.sunglowsys.service.impl;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.repository.EmployeeRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee) ;
    }

    @Override
    public Employee update(Employee employee, Long id) {
        return employeeRepository.save(employee) ;
    }

    @Override
    public List<Employee> findAll(Pageable pageable)
    {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findOne(Long id) {

        return employeeRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);

    }
}
