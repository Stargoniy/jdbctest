package com.in6k.jdbctest;

import java.sql.*;

public class Main {
    public static final String connection = "jdbc:mysql://localhost:3306/employee";
    public static final String user = "root";
    public static final String password = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection(connection, user, password);
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT name FROM employees");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }
}
