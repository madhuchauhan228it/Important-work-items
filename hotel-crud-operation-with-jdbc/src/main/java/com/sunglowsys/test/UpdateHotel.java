package com.sunglowsys.test;

import java.sql.*;

public class UpdateHotel {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost/jdbc-db";
        Connection connection = DriverManager.getConnection(url,"postgres","postgres");
        PreparedStatement preparedStatement = connection.prepareStatement("update hotel set name = 'Niharika' where id = 2");
        preparedStatement.executeUpdate();
        System.out.println("updated");

    }
}
