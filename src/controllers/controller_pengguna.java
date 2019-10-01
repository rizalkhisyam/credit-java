/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.view_pengguna;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.model;
import org.postgresql.util.PSQLException;

/**
 *
 * @author basirudin
 */
public class controller_pengguna {

    private view_pengguna theView;
    private model theModel;

    static int jam = 0;
    static int menit = 0;
    static int detik = 0;
    static int milisecond = 0;
    static int biaya = 0, biaya2 = 0;

    String jamString;
    String menitString;
    String detikString;
    String biayaString;

    String komputer;
    String paket = "1";
    String com;

    static boolean kondisi = true;

    String username;

    public controller_pengguna(String username) throws PSQLException, SQLException {
        theView = new view_pengguna();
        theModel = new model();
        this.username = username;
        theView.setVisible(true);

        biaya = theModel.selectPaket1() / 5;
        biaya2 = theModel.selectPaket1() / 5;

        kondisi = true;
        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if (kondisi = true) {
                        try {
                            sleep(1);

                            if (milisecond > 1000) {
                                milisecond = 0;
                                detik++;
                            }
                            if (detik > 6) {
                                milisecond = 0;
                                detik = 0;
                                menit++;
                                biaya += biaya2;
                            }
                            if (menit > 6) {
                                milisecond = 0;
                                detik = 0;
                                menit = 0;
                                jam++;
                            }
                            milisecond++;

                            jamString = Integer.toString(jam);
                            menitString = Integer.toString(menit);
                            detikString = Integer.toString(detik);
                            biayaString = Integer.toString(biaya);

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

        theView.btnStopListener(new stopListener());
        theView.setUsername().setText(username);
        theView.setKomputer().setText(komputer);
        System.out.println("nama pengunjung = " + username);
        System.out.println("id = " + theModel.getid(username));
    }

    private class stopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            kondisi = false;
            System.out.println("waktu = " + jam + " jam : " + menit + " menit : " + detik + " detik");
            System.out.println("biaya = " + biaya + " rupiah");

            theView.getStop().setEnabled(true);
            String id = theView.getID().getText();
            try {
//                theModel.waktuPengguna(jamString, menitString, detikString, biayaString, com, paket, theModel.getid(username));
                System.out.println("jam = " + jamString);
                System.out.println("menit = " + menitString);
                System.out.println("detik = " + detikString);
                System.out.println("sukses");
                theModel.waktuPengguna(jamString, menitString, detikString, biayaString, paket, com,theModel.getid(username));

            } catch (Exception e) {
                Logger.getLogger(controller_pengguna.class.getName()).log(Level.SEVERE, null, e);
            }
            System.exit(0);
        }

    }

}
