package com.sunglowsys.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class School {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/jdbc-db";
            Connection connection = DriverManager.getConnection(url, "postgres", "postgres");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into school(id,first_name,last_name,class,email) values (?,?,?,?,?,?)");
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Sumit");
            preparedStatement.setString(3, "Chauhan");
            preparedStatement.setString(4, "vi");
            preparedStatement.setString(5, "sumit34@gmail.com");

            int i = preparedStatement.executeUpdate();

            System.out.println("record inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }


