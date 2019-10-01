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
import views.view_pilihanPaket;
import models.model;

/**
 *
 * @author basirudin
 */
public class controller_pilihanPaket {

    private view_pilihanPaket theView;
    private model theModel;
    String username;

    public controller_pilihanPaket(String username) throws SQLException {
        theView = new view_pilihanPaket();
        theModel = new model();
        this.username = username;
        theView.setVisible(true);

        theView.setPaket().setText(String.valueOf(theModel.selectPaket1()));
        theView.setPaket3Jam().setText(String.valueOf(theModel.selectPaket2()));
        theView.setPaket5Jam().setText(String.valueOf(theModel.selectPaket3()));

        theView.btnPaketListener(new paket1Listener());
        theView.btnPaket3jamListener(new paket2Listener());
        theView.btnPaket5JamListener(new paket3Listener());
    }

    private class paket1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                theView.dispose();
                controller_pengguna paket1 = new controller_pengguna(username);
            } catch (SQLException ex) {
                Logger.getLogger(controller_pilihanPaket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class paket2Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                theView.dispose();
                controller_paket2 paket2 = new controller_paket2(username);
            } catch (SQLException ex) {
                Logger.getLogger(controller_pilihanPaket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class paket3Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                theView.dispose();
                controller_paket3 paket3 = new controller_paket3(username);
            } catch (SQLException ex) {
                Logger.getLogger(controller_pilihanPaket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
