package com.skurd;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseTest {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/skurd";
        String user = "root";
        String password = "rohitkumar__rk";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            System.out.println("MySQL connection successful!");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }