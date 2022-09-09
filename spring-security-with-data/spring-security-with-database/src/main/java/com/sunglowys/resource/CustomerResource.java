package com.sunglowys.resource;

import com.sunglowys.domain.Customer;
import com.sunglowys.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerResource {
    private final CustomerService customerService;

    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer result = customerService.save(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping("/customers")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
        Customer result = customerService.update(customer);
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAll() {
        List<Customer> customers = customerService.findAll(PageRequest.of(0,20));
        return ResponseEntity.status(HttpStatus.OK).body(customers);
    }

    @GetMapping("/customers{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {
        Customer result = customerService.findOne(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        customerService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();

    }


}
