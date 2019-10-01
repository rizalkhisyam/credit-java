/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_pbo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author basirudin
 */
public class db_main {

    private Statement stm;
    private Connection con;

    public db_main(String username, String password, String db) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/pbo";
        con = DriverManager.getConnection(url, username, password);
        stm = con.createStatement();

        System.out.println("connected url = " + url + ", user = " + username + ", pass = " + password);
    }

    public void execute(String sql) throws SQLException {
        this.stm.executeUpdate(sql);
    }

    public ResultSet getResult(String sql) throws SQLException {
        return stm.executeQuery(sql);
    }
}
