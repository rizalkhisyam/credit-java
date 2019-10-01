/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import db_pbo2.db_main;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author basirudin
 */
public class model_fungsi {

    db_main con;

    public model_fungsi() throws SQLException {
        this.con = new db_main("postgres", "sn", "pbo");
    }

    public boolean getDataStatus(String query) {
        boolean sukses = false;
        try {
            con.execute(query);
            sukses = true;
        } catch (Exception e) {
            sukses = false;
        }
        return sukses;
    }

    public int getDataInt(String query) throws SQLException {
        ResultSet hasil = con.getResult(query);
        hasil.next();
        int data = hasil.getInt(1);
        return data;
    }
    
    public String getDataString(String query) throws SQLException{
        ResultSet hasil = con.getResult(query);
        hasil.next();
        String data = hasil.getString(1);
        return data;
    }
}
