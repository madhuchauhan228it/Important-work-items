package com.sunglowsys.repository;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.util.ConnectorClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class HotelRepositoryImpl implements HotelRepository {

    private Connection DatabaseConnection;

    @Override
    public Hotel createHotel(Hotel hotel) {
        String sql = "insert into hotel(name,code,hotel_type,email,mobile) value(?,?,?,?,?,?)";
        try {

            Connection connection = ConnectorClass.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, hotel.getId());
            preparedStatement.setString(2, hotel.getName());
            preparedStatement.setString(3, hotel.getCode());
            preparedStatement.setString(4, hotel.getHotel_type());
            preparedStatement.setString(5, hotel.getEmail());
            preparedStatement.setString(6, hotel.getMobile());

            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return hotel;
    }

    @Override
    public Hotel updateHotel(Hotel hotel, Long id) {
        String SQL="update hotel set name=? where id=?;";
        try {
            Connection connection = ConnectorClass.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, hotel.getName());
            preparedStatement.setInt(2, Math.toIntExact(id));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Hotel> getAll() {
        return null;
    }

    @Override
    public Hotel findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
