package com.sunglowsys.domain;

import java.util.Objects;

public class HotelInventory {
    private Long id;
    private String total_inventory;
    private String hotel_id;
    private String room_type;

    public HotelInventory(Long id, String total_inventory, String hotel_id, String room_type) {
        this.id = id;
        this.total_inventory = total_inventory;
        this.hotel_id = hotel_id;
        this.room_type = room_type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTotal_inventory() {
        return total_inventory;
    }

    public void setTotal_inventory(String total_inventory) {
        this.total_inventory = total_inventory;
    }

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelInventory that = (HotelInventory) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getTotal_inventory(), that.getTotal_inventory()) && Objects.equals(getHotel_id(), that.getHotel_id()) && Objects.equals(getRoom_type(), that.getRoom_type());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTotal_inventory(), getHotel_id(), getRoom_type());
    }

    @Override
    public String toString() {
        return "HotelInventory{" +
                "id=" + id +
                ", total_inventory='" + total_inventory + '\'' +
                ", hotel_id='" + hotel_id + '\'' +
                ", room_type='" + room_type + '\'' +
                '}';
    }
}
