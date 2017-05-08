package com.fadi;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import static java.lang.System.getProperties;

/**
 * Created by Fadi on 02-May-17.
 */
public class DAO {
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/world";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    private Connection connection;
    private Properties properties;


    public Connection connect() {
        if (connection == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                connection = DriverManager.getConnection(DATABASE_URL, getProperties());
            } catch (ClassNotFoundException | SQLException e) {
                // Java 7+
                e.printStackTrace();
            }
        }
        return connection;
    }
    private Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            properties.setProperty("user", USERNAME);
            properties.setProperty("password", PASSWORD);
        }
        return properties;
    }
}
