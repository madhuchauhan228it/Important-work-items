package com.sunglowys.service.impl;

import com.sunglowys.domain.Customer;
import com.sunglowys.repository.CustomerRepository;
import com.sunglowys.service.CustomerService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
   private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer) ;
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findOne(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);

    }
}
