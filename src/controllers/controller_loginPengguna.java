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
import views.view_loginPengguna;
import models.model;
import views.view_pengguna;

/**
 *
 * @author basirudin
 */
public class controller_loginPengguna {

    private view_loginPengguna theView;
    private model theModel;

    String username;

    public controller_loginPengguna() throws SQLException {
        theModel = new model();
        theView = new view_loginPengguna();
        theView.setVisible(true);

        theView.btnMulaiListener(new mulaiListener());
    }

    private class mulaiListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theView.getMulai().setEnabled(true);
            String id = theView.getID().getText();
            username = (String) theView.getUsername().getText();
            try {
                if (username.isEmpty()) {
                    theView.pesanLogin("isikan dulu namamu baru bisa mulai :v");
                } else if (id.isEmpty()) {
                    theModel.loginPengunjung(username);
                    theView.dispose();
//                    controller_pengguna pengguna = new controller_pengguna(username);
                    controller_pilihanPaket pilih = new controller_pilihanPaket(username);
                }
            } catch (Exception e) {
                Logger.getLogger(controller_loginPengguna.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }
}
