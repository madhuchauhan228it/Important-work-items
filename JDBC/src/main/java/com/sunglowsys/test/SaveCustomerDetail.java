package com.sunglowsys.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaveCustomerDetail {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/jdbc-db";
            Connection connection = DriverManager.getConnection(url, "postgres", "postgres");

            PreparedStatement preparedStatement = connection.prepareStatement("insert into costumer(id,first_name,last_name,email,mobile) values (?,?,?,?,?)");
            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "madhu");
            preparedStatement.setString(3, "Chauhan");
            preparedStatement.setString(4, "niharika34@gmail.com");
            preparedStatement.setString(5, "8909878908");

            int i = preparedStatement.executeUpdate();

            System.out.println("record inserted");
        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}
