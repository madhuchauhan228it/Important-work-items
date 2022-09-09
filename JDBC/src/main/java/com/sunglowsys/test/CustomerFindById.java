package com.sunglowsys.test;

import java.sql.*;

 class CustomerDetailFindById {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost/jdbc-db";
        Connection connection = DriverManager.getConnection(url, "postgres", "postgres");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from costumer where id = 2");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.print(resultSet.getLong(1) + ",");
            System.out.print(resultSet.getString(2) + ",");
            System.out.print(resultSet.getString(3) + ",");
            System.out.print(resultSet.getString(4) + ",");
            System.out.print(resultSet.getString(5) + ",");
        }
    }
}