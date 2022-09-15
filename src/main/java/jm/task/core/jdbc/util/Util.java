package jm.task.core.jdbc.util;

import java.sql.*;


public class Util {

    public static void main(String[] args) throws SQLException {
        Util util = new Util();
        util.getConnection();
    }

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";

    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {

        Connection connection = null;

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
