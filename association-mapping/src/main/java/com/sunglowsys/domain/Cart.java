package com.sunglowsys.domain;

import java.util.Objects;

public class Cart<amount, products> {
    private Long id;
    private String total products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart<?, ?> cart = (Cart<?, ?>) o;
        return Objects.equals(id, cart.id) && Objects.equals(total, cart.total) && Objects.equals(total, cart.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, total);
    }

    public Cart(Long id, String total, String total1) {
        this.id = id;
        this.total = total;
        this.total = total1;
    }

    private String total amount;


    public Cart(Long id, String total amount) {
        this.id = id;
        this.total amount = total amount;

    }
}

