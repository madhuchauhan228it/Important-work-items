package com.sunglowsys.resources;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerService;

import java.util.List;
import java.util.Optional;

public class CustomerResources {
    private final CustomerService customerService;

    public CustomerResources(CustomerService customerService) {
        this.customerService = customerService;
    }

    Customer saveCustomer(Customer customer) {
        return customerService.save(customer);
    }

    Customer updateCustomer(Customer customer) {
        return CustomerService.update(customer);
    }

    List<Customer> getAllCustomers(Customer customer) {

        return customerService.findAll();
    }

    Optional<Customer> getCustomer(Long id) {
        return customerService.findById(id);
    }

    void delete(Long id) {customerService.delete(id);

    }

}
