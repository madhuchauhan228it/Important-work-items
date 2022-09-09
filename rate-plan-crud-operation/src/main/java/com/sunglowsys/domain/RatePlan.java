package com.sunglowsys.domain;

import java.util.Objects;

public class RatePlan {
    public Long id;
    public String name;

    public RatePlan() {
    }

    public RatePlan(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatePlan ratePlan = (RatePlan) o;
        return Objects.equals(getId(), ratePlan.getId()) && Objects.equals(getName(), ratePlan.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "RatePlan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

