/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.view_paket5jam;
import models.model;

/**
 *
 * @author basirudin
 */
public class controller_paket3 {

    private view_paket5jam theView;
    private model theModel;
    String username;

    static int jam = 5;
    static int menit = 0;
    static int detik = 0;
    static int milisecond = 1000;
//    static int biaya = 0;

    String jamString;
    String menitString;
    String detikString;
    String biayaString;

    String komputer;
    String paket = "3";
    String com;

    static boolean kondisi = true;

    public controller_paket3(String username) throws SQLException {
        this.username = username;
        theModel = new model();
        theView = new view_paket5jam();
        theView.setVisible(true);

        kondisi = true;
        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if (kondisi = true) {
                        try {
                            sleep(1);

                            if (milisecond < 0) {
                                milisecond = 1000;
                                detik--;
                            }
                            if (detik < 0) {
                                milisecond = 0;
                                detik = 6;
                                menit--;
                            }
                            if (menit < 0) {
                                milisecond = 0;
                                detik = 6;
                                menit = 6;
                                jam--;

                                if (jam < 0) {
                                    theModel.waktuPengguna(jamString, menitString, detikString, biayaString, paket, com, theModel.getid(username));
                                    System.out.println("sukses");
                                    System.exit(0);
                                }
                            }
                            milisecond--;

                            jamString = Integer.toString(jam);
                            menitString = Integer.toString(menit);
                            detikString = Integer.toString(detik);
                            biayaString = Integer.toString(theModel.selectPaket3());

                            theView.setJam().setText(jamString);
                            theView.setMenit().setText(menitString);
                            theView.setDetik().setText(detikString);
                            theView.setBiaya().setText(biayaString);
                        } catch (Exception e) {
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        t.start();

        Random random = new Random();
        int n = random.nextInt(5) + 1;
        System.out.println("n = " + n);

        if (n == 1) {
            komputer = "COM 01";
            com = "1";
        } else if (n == 2) {
            komputer = "COM 02";
            com = "2";
        } else if (n == 3) {
            komputer = "COM 03";
            com = "3";
        } else if (n == 4) {
            komputer = "COM 04";
            com = "4";
        } else if (n == 5) {
            komputer = "COM 05";
            com = "5";
        }

        theView.setUsername().setText(username);
        theView.setKomputer().setText(komputer);
        theView.btnStopListener(new stopListener());

    }

    private class stopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            kondisi = false;
            System.out.println("waktu = " + jam + " jam : " + menit + " menit : " + detik + " detik");
            System.out.println("biaya = " + biayaString + " rupiah");

            theView.getStop().setEnabled(true);
            String id = theView.getID().getText();
            try {
                if (id.isEmpty()) {
                    theModel.waktuPengguna(jamString, menitString, detikString, biayaString, paket, com, theModel.getid(username));
                    System.out.println("sukses");
                }
            } catch (Exception e) {
                Logger.getLogger(controller_pengguna.class.getName()).log(Level.SEVERE, null, e);
            }
            System.exit(0);
        }

    }
}
