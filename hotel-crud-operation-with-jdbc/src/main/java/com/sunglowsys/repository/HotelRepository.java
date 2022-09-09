package com.sunglowsys.repository;

import com.sunglowsys.domain.Hotel;

import java.util.List;

public interface HotelRepository {
    Hotel createHotel(Hotel hotel);
    Hotel updateHotel(Hotel hotel,Long id);
    List<Hotel> getAll();
    Hotel findById(Long id);
    void delete(Long id);
}
