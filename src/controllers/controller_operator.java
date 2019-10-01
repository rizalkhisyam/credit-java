/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.SQLException;
import views.view_operator;
import models.model;

/**
 *
 * @author basirudin
 */
public class controller_operator {

    private model theModel;
    private view_operator theView;
    String username;

    public controller_operator(String username) throws SQLException {
        theModel = new model();
        theView = new view_operator();
        theView.setVisible(true);
        this.username = username;

        System.out.println("username = " + username);
        String id = theModel.getIdUser(username);
        System.out.println("id = " + id);
    }
}
