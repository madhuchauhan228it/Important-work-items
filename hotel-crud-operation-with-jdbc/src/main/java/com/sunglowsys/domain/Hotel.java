package com.sunglowsys.domain;

import java.util.Objects;

public class Hotel {
    private Long id;
    private String name;
    private String code;
    private String hotel_type;
    private String email;
    private String mobile;

    public Hotel() {
    }

    public Hotel(String name, String code, String hotel_type, String email, String mobile) {
        this.name = name;
        this.code = code;
        this.hotel_type = hotel_type;
        this.email = email;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHotel_type() {
        return hotel_type;
    }

    public void setHotel_type(String hotel_type) {
        this.hotel_type = hotel_type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(id, hotel.id) && Objects.equals(name, hotel.name) && Objects.equals(code, hotel.code) && Objects.equals(hotel_type, hotel.hotel_type) && Objects.equals(email, hotel.email) && Objects.equals(mobile, hotel.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code, hotel_type, email, mobile);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", hotel_type='" + hotel_type + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
