package com.sunglowsys.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteById {
    public static void main(String[] args)throws SQLException,ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost/jdbc-db";
        Connection connection = DriverManager.getConnection(url,"postgres","postgres");
        PreparedStatement preparedStatement = connection.prepareStatement("delete from hotel where id = 2");
        preparedStatement.executeUpdate();
        System.out.println("deleted");

    }
}
