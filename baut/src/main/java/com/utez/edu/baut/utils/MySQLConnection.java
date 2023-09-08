package com.utez.edu.baut.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String BDNAME = "baut";
    private static final String USER = "root";
    private static final String PASSWORD = "root";


    public static Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection("jdbc:mysql://"+HOST+":"+PORT+"/"+BDNAME+"?serverTimezone=UTC",USER,PASSWORD);
    }

    public static void main(String[] args) {
        try{
            MySQLConnection.getConnection();
            System.out.println("conexion exitosa");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
