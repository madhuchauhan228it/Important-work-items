package com.sunglowys.service;

import com.sunglowys.domain.Customer;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer save(Customer customer);

    Customer update(Customer customer);

    List<Customer> findAll(Pageable pageable);

    Optional<Customer> findOne(Long id);

    void delete(Long id);

}
