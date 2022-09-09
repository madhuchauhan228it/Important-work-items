package com.sunglowsys.domain;

import java.util.Objects;

public class Customer {
    private Long id;
    private String Name;
    private String mobile;
    private String email;
    private String Address;



    public Customer(Long id, String Name,String mobile,String email,String address) {
        this.id = id;
        this.Name = Name;
        this.mobile = mobile;
        this.email = email;
        this.Address = address;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(Name, customer.Name) && Objects.equals(mobile, customer.mobile) && Objects.equals(email, customer.email) && Objects.equals(Address, customer.Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, mobile, email, Address);
    }

    public Customer(String name, String mobile, String email, String address) {
        Name = name;
        this.mobile = mobile;
        this.email = email;
        Address = address;
    }
}
