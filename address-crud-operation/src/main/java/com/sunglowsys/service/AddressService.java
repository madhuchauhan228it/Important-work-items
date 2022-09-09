package com.sunglowsys.service;

import com.sunglowsys.domain.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    Address save(Address address);
    Address update(Address address);
    List<Address> findAll();
    Optional<Address> findOne(Long id);
    void delete(Long id);
            '
}
