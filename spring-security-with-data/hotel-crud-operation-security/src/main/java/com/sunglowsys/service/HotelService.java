package com.sunglowsys.service;

import com.sunglowsys.domain.Hotel;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface HotelService {
    Hotel save(Hotel hotel);

    Hotel update(Hotel hotel);

    List<Hotel> findAll(Pageable pageable);

    Optional<Hotel> findOne(Long id);

    void delete(Long id);
}
