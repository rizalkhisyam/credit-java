/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.*;

/**
 *
 * @author basirudin
 */
public class controller_home {

    private view_home theView;
    String username;

    public controller_home() {
        theView = new view_home();

        theView.setVisible(true);

        theView.btnPenggunaListener(new penggunaListener());
        theView.btnPemilikListener(new pemilikListener());

    }

    private class penggunaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                controller_loginPengguna pengguna = new controller_loginPengguna();
                theView.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(controller_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class pemilikListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                controller_loginUser user = new controller_loginUser();
                theView.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(controller_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
