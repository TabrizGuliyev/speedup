/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsptechs.main;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Penthos
 */
public class MySqlIdeDB {

    public static Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public static List<String> getAllDB() {

        Statement stmt = null;
        ResultSet resultset = null;
        List<String> list = new ArrayList<>();

        try (Connection conn = connect()) {
            stmt = conn.createStatement();
            resultset = stmt.executeQuery("SHOW DATABASES;");

            if (stmt.execute("SHOW DATABASES;")) {
                resultset = stmt.getResultSet();
            }

            while (resultset.next()) {
                String result = resultset.getString("Database");
                list.add(result);

            }
            return list;
        } catch (Exception ex) {
            // handle any errors
            ex.printStackTrace();
            return null;
        }
    }

    public static List<String> allTables(String bazaName) {
        Statement stmt = null;
        ResultSet resultset = null;
        List<String> list = new ArrayList<>();
        try (Connection conn = connect();) {
            stmt = conn.createStatement();
            System.out.println("saasas");
            resultset = stmt.executeQuery("SHOW TABLES FROM " + bazaName);
            System.out.println("asr=" + resultset);
            while (resultset.next()) {
                String result = resultset.getString(1);
                list.add(result);
            }
            return list;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;

        }
    }
}
