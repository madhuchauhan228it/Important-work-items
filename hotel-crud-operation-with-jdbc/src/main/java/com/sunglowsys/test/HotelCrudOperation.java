package com.sunglowsys.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class HotelCrudOperation {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/jdbc-db";
            Connection connection = DriverManager.getConnection(url,"postgres","postgres");

            PreparedStatement preparedStatement = connection.prepareStatement("insert into hotel(id,name,code,hotel_type,email,mobile) values (?,?,?,?,?,?)");
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Madhu");
            preparedStatement.setString(3, "a123");
            preparedStatement.setString(4, "5 star");
            preparedStatement.setString(5, "madhu@gmail.com");
            preparedStatement.setString(6, "93963676522");

            int i = preparedStatement.executeUpdate();

            System.out.println("record inserted");
            connection.close();

        }catch (Exception e) {
            e.printStackTrace();

        }



    }
}
