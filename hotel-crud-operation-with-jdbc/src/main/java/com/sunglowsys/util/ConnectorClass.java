package com.sunglowsys.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectorClass {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/athitih";
    private static String username = "root";
    private static String password = "root";

    private static Connection connection = null;

    public ConnectorClass()throws Exception {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,username,password);
    }
    public static Connection getConnection(){
        return connection;
    }
}
