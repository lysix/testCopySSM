package com.ly.sort;

import java.sql.*;

public class sql {

    public static void main(String[] args) {

        try {
            Class.forName("");
            Connection connection = DriverManager.getConnection("");


            PreparedStatement pst = connection.prepareStatement("sql");

            Statement statement = connection.createStatement();
            boolean b = statement.execute("");
            statement.getResultSet();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
