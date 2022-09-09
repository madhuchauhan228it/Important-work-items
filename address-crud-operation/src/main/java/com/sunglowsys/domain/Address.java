package com.sunglowsys.domain;

import java.util.Objects;

public class Address {
    private Long id;
    private String address_line1;
    private String address_line2;
    private String city;
    private String state;
    private String country;
    private String zipcode;

    public Address() {
    }

    public Address(String address_line1, String address_line2, String city, String state, String country, String zipcode) {
        this.address_line1 = address_line1;
        this.address_line2 = address_line2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getId(), address.getId()) && Objects.equals(getAddress_line1(), address.getAddress_line1()) && Objects.equals(getAddress_line2(), address.getAddress_line2()) && Objects.equals(getCity(), address.getCity()) && Objects.equals(getState(), address.getState()) && Objects.equals(getCountry(), address.getCountry()) && Objects.equals(getZipcode(), address.getZipcode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAddress_line1(), getAddress_line2(), getCity(), getState(), getCountry(), getZipcode());
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address_line1='" + address_line1 + '\'' +
                ", address_line2='" + address_line2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
