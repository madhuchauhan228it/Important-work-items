package com.sunglowsys.test;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.repository.HotelRepository;
import com.sunglowsys.repository.HotelRepositoryImpl;


public  class CreateHotel {
    public static void main(String[] args) {
        HotelRepository hotelRepository = new HotelRepositoryImpl();
        Hotel hotel = saveHotel();

    }

    private static Hotel saveHotel() {
        Hotel hotel = new Hotel();
        hotel.setName("Madhu");
        hotel.setCode("Mq233");
        hotel.setHotel_type("5Star");
        hotel.setEmail("maf@rw.gmail.com");
        hotel.setMobile("97289654232");
        return hotel;
    }
}