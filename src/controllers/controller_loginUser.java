/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import views.view_loginUser;
import models.model;

/**
 *
 * @author basirudin
 */
public class controller_loginUser {

    private view_loginUser theView;
    private model theModel;

    String username;
    String user;
    int level;

    public controller_loginUser() throws SQLException {
        theView = new view_loginUser();
        theModel = new model();
        this.username = username;
        theView.setVisible(true);

        theView.btnMasukListener(new masukListener());
    }

    private class masukListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                user = theModel.loginUser(theView.getUsername(), theView.getPassword());
                level = theModel.levelLogin(theView.getUsername(), theView.getPassword());

                if (level == 11) {
                    theView.dispose();
                    controller_admin admin = new controller_admin(theView.getUsername());
                    System.out.println("admin");
                } else if (level == 13) {
                    theView.dispose();
                    controller_operator operator = new controller_operator(theView.getUsername());
                    System.out.println("operator");
                }
            } catch (SQLException e) {
                theView.pesanLogin("mau ngapain? daftar dulu sono :v");
            }
        }

    }
}
