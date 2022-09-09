package com.sunglowsys.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateCustomerDetail {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost/jdbc-db";
        Connection connection = DriverManager.getConnection(url,"postgres","postgres");
        PreparedStatement preparedStatement = connection.prepareStatement("Update costumer set first_name = 'Niharika' where id = 2");
        preparedStatement.executeUpdate();
        System.out.println("updated");

    }
}


