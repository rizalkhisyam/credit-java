/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import views.view_admin;
import models.model;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author basirudin
 */
public class controller_admin {

    private view_admin theView;
    private model theModel;
    String username;
    String komputer;
    String paket1, paket2, paket3;
    String skemaHarga;
    boolean ubah;

    public controller_admin(String username) throws SQLException {
        theView = new view_admin();
        theModel = new model();
        theView.setVisible(true);
        this.username = username;

        System.out.println("user = " + username);
        String id = theModel.getIdUser(username);
        System.out.println("id = " + id);
        paket1 = String.valueOf(theModel.selectPaket1());
        paket2 = String.valueOf(theModel.selectPaket2());
        paket3 = String.valueOf(theModel.selectPaket3());

        skemaHarga = String.valueOf(theModel.selectPaket1());
        theView.getSkemaHarga().setText(skemaHarga);
        theView.getPaket().setSelectedIndex(0);

        //beranda
        theView.btnBatalBerandaListener(new batalBerandaListener());
        theView.btnPaketBerandaListener(new paketListener());
        theView.btnSimpanBerandaListener(new simpanBerandaListener());
        theView.btnUbahBerandaListener(new ubahBerandaListener());
        theView.btnPilihBerandaListener(new pilihBerandaListener());
        theView.getTabelPengguna().setModel(theModel.getTableModelSemua());

        //jadwal jaga
        theView.getTabelJadwal().setModel(theModel.selectCariSemuaJadwal());
        theView.btnOkJadwalListener(new okJadwalListener());
        theView.btnSimpanJadwalListener(new simpanJadwalListener());
        theView.btnUbahJadwalListener(new ubahJadwalListener());
        theView.btnBatalJadwalListner(new batalJadwalListener());
        theView.btnCariJadwalListener(new cariJadwalListener());

        //daftar user
        theView.btnTambahUserListener(new tambahUserListener());
        theView.btnUbahUserListener(new ubahUserListener());
        theView.btnHapusUserListener(new hapusUserListener());
        theView.btnSimpanUserListener(new simpanUserListener());
        theView.btnBatalUserListener(new batalUserListener());
        theView.getTabelUser().setModel(theModel.getTableUser());

        //info
        theView.getTanggalCatatan().setText(theModel.getTglCatatan());
        theView.getNamaCatatan().setText(theModel.getNamaCatatan());
        theView.getKontakCatatan().setText(theModel.getKontakCatatan());
        theView.getCatatan().setText(theModel.getCatatan());
        theView.btnUbahProfilListener(new ubahProfilListener());
        theView.btnBatalProfilListener(new batalProfilListener());
        theView.btnSimpanProfilListener(new simpanProfilListener());
        theView.btnUbahCatatanListener(new ubahCatatanListener());
        theView.btnSimpanCatatanListener(new simpaCatatanListener());
        theView.btnBatalCatatanListener(new batalCatatanListener());

        theView.getIdProfil().setText(id);
        theView.getNamaProfil().setText(theModel.getNamaProfil(id, username));
        theView.getUsernameProfil().setText(theModel.getUsernameProfil(id, username));
        theView.getPasswordProfil().setText(theModel.getPasswordProfil(id, username));
        theView.getKontakProfil().setText(theModel.getKontakProfil(id, username));
        theView.getAlamatProfil().setText(theModel.getAlamatProfil(id, username));
        theView.getAksesProfil().setText(theModel.getLevelProfil(id, username));
        int index = 0;
        String gender = theModel.getGenderProfil(id, username);
        if (gender.equalsIgnoreCase("cowok")) {
            index = 0;
        } else if (gender.equalsIgnoreCase("cewek")) {
            index = 1;
        }
        theView.getGenderProfil().setSelectedIndex(index);
    }

    //beranda
    private class pilihBerandaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            komputer = (String) theView.getKomputer().getSelectedItem();
            System.out.println("komputer = " + komputer);
            try {
                if (komputer == "SEMUA") {
                    theView.getTabelPengguna().setModel(theModel.getTableModelSemua());
                } else {
                    theView.getTabelPengguna().setModel(theModel.getTableModel(komputer));
                }
            } catch (SQLException ex) {
                Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class paketListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int paket = theView.getPaket().getSelectedIndex();
            System.out.println("index paket = " + paket);
            if (paket == 0) {
                try {
                    theView.getSkemaHarga().setText(Integer.toString(theModel.selectPaket1()));
                } catch (SQLException ex) {
                    Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (paket == 1) {
                try {
                    theView.getSkemaHarga().setText(Integer.toString(theModel.selectPaket2()));
                } catch (SQLException ex) {
                    Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (paket == 2) {
                try {
                    theView.getSkemaHarga().setText(Integer.toString(theModel.selectPaket3()));
                } catch (SQLException ex) {
                    Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class ubahBerandaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theView.getBatalBeranda().setEnabled(true);
            theView.getSkemaHarga().setEnabled(true);
            theView.getSimpanBeranda().setEnabled(true);
            theView.getPaket().setEnabled(true);
            theView.getUbahBeranda().setEnabled(false);
        }
    }

    private class simpanBerandaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theView.getBatalBeranda().setEnabled(false);
            theView.getSkemaHarga().setEnabled(false);
            theView.getPaket().setEnabled(false);
            theView.getSimpanBeranda().setEnabled(false);
            theView.getUbahBeranda().setEnabled(true);
            String harga = String.valueOf(theView.getSkemaHarga().getText());
            System.out.println("harga paket = " + harga);

            int paket = theView.getPaket().getSelectedIndex();
            System.out.println("index = " + paket);

            if (paket == 0) {
                try {
                    theModel.updatePaket1(harga);
                    System.out.println("update skema harga paket 1");
                } catch (SQLException ex) {
                    Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (paket == 1) {
                try {
                    theModel.updatePaket2(harga);
                    System.out.println("update skema harga paket 2");
                } catch (SQLException ex) {
                    Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (paket == 2) {
                try {
                    theModel.updatePaket3(harga);
                    System.out.println("update skema harga paket 3");
                } catch (SQLException ex) {
                    Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            theView.getPaket().setSelectedIndex(0);
            theView.getSkemaHarga().setText(skemaHarga);
        }

    }

    private class batalBerandaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theView.getBatalBeranda().setEnabled(false);
            theView.getSkemaHarga().setEnabled(false);
            theView.getPaket().setEnabled(false);
            theView.getSimpanBeranda().setEnabled(false);
            theView.getUbahBeranda().setEnabled(true);
            System.out.println("batal ubah skema harga");

            theView.getPaket().setSelectedIndex(0);
            theView.getSkemaHarga().setText(skemaHarga);
        }
    }

    //jadwal jaga
    private class okJadwalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cariJadwal = (String) theView.getCariJadwal().getSelectedItem();
            System.out.println("cari jadwal = " + cariJadwal);
            try {
                if (cariJadwal == "Semua") {
                    theView.getTabelJadwal().setModel(theModel.selectCariSemuaJadwal());
                } else {
                    theView.getTabelJadwal().setModel(theModel.selectCariJadwal(cariJadwal));
                }
            } catch (SQLException ex) {
                Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class cariJadwalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cariJadwal = (String) theView.getCariJadwal().getSelectedItem();
            System.out.println("cari jadwal = " + cariJadwal);
            try {
                if (cariJadwal == "Semua") {
                    theView.getTabelJadwal().setModel(theModel.selectCariSemuaJadwal());
                } else {
                    theView.getTabelJadwal().setModel(theModel.selectCariJadwal(cariJadwal));
                }
            } catch (SQLException ex) {
                Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class ubahJadwalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int baris = theView.getTabelJadwal().getSelectedRow();
            if (baris != -1) {
                theView.getListJadwal().setEnabled(true);
                theView.getSimpanJadwal().setEnabled(true);
                theView.getBatalJadwal().setEnabled(true);
                theView.getUbahJadwal().setEnabled(false);
                theView.getCariJadwal().setEnabled(false);
                theView.getOkJadwal().setEnabled(false);
                theView.getTabelJadwal().setEnabled(false);

                String id = (String) theView.getTabelJadwal().getValueAt(baris, 0);
                System.out.println("id jadwal = " + id);
                try {
                    theView.getIdJadwal().setText(id);
                    theView.getNamaJadwal().setText(theModel.getNamaJadwal(id));
                    theView.getGenderJadwal().setText(theModel.getGenderJadwal(id));
                    theView.getKontakJadwal().setText(theModel.getKontakJadwal(id));

                    String hari = theModel.getHariJadwal(id);
                    System.out.println("hari = " + hari);
                    int index = 0;
                    if (hari.equalsIgnoreCase("senin 07.00 - 12.00")) {
                        index = 0;
                    } else if (hari.equalsIgnoreCase("senin 12.00 - 18.00")) {
                        index = 1;
                    } else if (hari.equalsIgnoreCase("senin 18.00 - 24.00")) {
                        index = 2;
                    } else if (hari.equalsIgnoreCase("selasa 07.00 - 12.00")) {
                        index = 3;
                    } else if (hari.equalsIgnoreCase("selasa 12.00 - 18.00")) {
                        index = 4;
                    } else if (hari.equalsIgnoreCase("selasa 18.00 - 24.00")) {
                        index = 5;
                    } else if (hari.equalsIgnoreCase("rabu 07.00 - 12.00")) {
                        index = 6;
                    } else if (hari.equalsIgnoreCase("rabu 12.00 - 18.00")) {
                        index = 7;
                    } else if (hari.equalsIgnoreCase("rabu 18.00 - 24.00")) {
                        index = 8;
                    } else if (hari.equalsIgnoreCase("kamis 07.00 - 12.00")) {
                        index = 9;
                    } else if (hari.equalsIgnoreCase("kamis 12.00 - 18.00")) {
                        index = 10;
                    } else if (hari.equalsIgnoreCase("kamis 18.00 - 24.00")) {
                        index = 11;
                    } else if (hari.equalsIgnoreCase("jumat 07.00 - 12.00")) {
                        index = 12;
                    } else if (hari.equalsIgnoreCase("jumat 12.00 - 18.00")) {
                        index = 13;
                    } else if (hari.equalsIgnoreCase("jumat 18.00 - 24.00")) {
                        index = 14;
                    } else if (hari.equalsIgnoreCase("sabtu 07.00 - 12.00")) {
                        index = 15;
                    } else if (hari.equalsIgnoreCase("sabtu 12.00 - 18.00")) {
                        index = 16;
                    } else if (hari.equalsIgnoreCase("sabtu 18.00 - 24.00")) {
                        index = 17;
                    } else if (hari.equalsIgnoreCase("minggu 07.00 - 12.00")) {
                        index = 18;
                    } else if (hari.equalsIgnoreCase("minggu 12.00 - 18.00")) {
                        index = 19;
                    } else if (hari.equalsIgnoreCase("minggu 18.00 - 24.00")) {
                        index = 20;
                    } else if (hari.equalsIgnoreCase("belum")) {
                        index = 0;
                    }
                    System.out.println("a = " + index);
                    theView.getListJadwal().setSelectedIndex(index);
                } catch (SQLException ex) {
                    Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class simpanJadwalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String iduser = theView.getIdJadwal().getText();
                System.out.println("iduser = " + iduser);
                String jadwal = (String) theView.getListJadwal().getSelectedItem();

                theView.getListJadwal().setEnabled(false);
                theView.getSimpanJadwal().setEnabled(false);
                theView.getBatalJadwal().setEnabled(false);
                theView.getUbahJadwal().setEnabled(true);
                theView.getCariJadwal().setEnabled(true);
                theView.getOkJadwal().setEnabled(true);
                theView.getTabelJadwal().setEnabled(true);

                theView.getNamaJadwal().setText("nama");
                theView.getKontakJadwal().setText("nomor");
                theView.getGenderJadwal().setText("gender");
                theView.getIdJadwal().setText("id");
                theView.getListJadwal().setSelectedIndex(0);

                if (theView.getIdJadwal().getText().isEmpty()) {
                    System.out.println("-");
                } else {
                    theModel.updateJadwal(jadwal, iduser);
                    System.out.println("update");
                }

                theView.getTabelJadwal().setModel(theModel.selectCariSemuaJadwal());
            } catch (SQLException ex) {
                Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class batalJadwalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theView.getListJadwal().setEnabled(false);
            theView.getSimpanJadwal().setEnabled(false);
            theView.getBatalJadwal().setEnabled(false);
            theView.getUbahJadwal().setEnabled(true);
            theView.getCariJadwal().setEnabled(true);
            theView.getOkJadwal().setEnabled(true);
            theView.getTabelJadwal().setEnabled(true);

            theView.getNamaJadwal().setText("nama");
            theView.getKontakJadwal().setText("nomor");
            theView.getGenderJadwal().setText("gender");
            theView.getIdJadwal().setText("id");
            theView.getListJadwal().setSelectedIndex(0);
        }
    }

    //daftar user
    private class tambahUserListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theView.getTabelUser().setEnabled(false);
            theView.getTambahUser().setEnabled(false);
            theView.getUbahUser().setEnabled(false);
            theView.getHapusUser().setEnabled(false);

            theView.getNamaUser().setEnabled(true);
            theView.getUsernameUser().setEnabled(true);
            theView.getPasswordUser().setEnabled(true);
            theView.getKontakUser().setEnabled(true);
            theView.getAlamatUser().setEnabled(true);
            theView.getGenderUser().setEnabled(true);
            theView.getLevelUser().setEnabled(true);

            theView.getSimpanUser().setEnabled(true);
            theView.getBatalUser().setEnabled(true);

            theView.getIdUser().setText("");
            theView.getNamaUser().setText("");
            theView.getUsernameUser().setText("");
            theView.getPasswordUser().setText("");
            theView.getKontakUser().setText("");
            theView.getAlamatUser().setText("");
            theView.getGenderUser().setSelectedIndex(0);
            theView.getLevelUser().setSelectedIndex(0);
        }
    }

    private class ubahUserListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int baris = theView.getTabelUser().getSelectedRow();
            System.out.println("baris = " + baris);
            if (baris != -1) {
                theView.getTabelUser().setEnabled(false);
                theView.getTambahUser().setEnabled(false);
                theView.getUbahUser().setEnabled(false);
                theView.getHapusUser().setEnabled(false);

                theView.getNamaUser().setEnabled(true);
                theView.getKontakUser().setEnabled(true);
                theView.getAlamatUser().setEnabled(true);

                theView.getSimpanUser().setEnabled(true);
                theView.getBatalUser().setEnabled(true);

                String id = (String) theView.getTabelUser().getValueAt(baris, 0);
                System.out.println("id = " + id);

                try {
                    theView.getIdUser().setText(id);
                    theView.getNamaUser().setText(theModel.getNamaUser(id));
                    theView.getUsernameUser().setText(theModel.getUsernameUser(id));
                    theView.getPasswordUser().setText(theModel.getPasswordUser(id));
                    theView.getAlamatUser().setText(theModel.getAlamatUser(id));
                    theView.getKontakUser().setText(theModel.getKontakUser(id));
                    String gender = theModel.getGenderUser(id);
                    System.out.println("gender = " + gender);
                    int index = 0;
                    if (gender.equalsIgnoreCase("1")) {
                        index = 0;
                    } else if (gender.equalsIgnoreCase("1")) {
                        index = 1;
                    }
                    theView.getGenderUser().setSelectedIndex(index);

                    String level = theModel.getLevelUser(id);
                    System.out.println("level = " + level);
                    int index2 = 0;
                    if (level.equalsIgnoreCase("11")) {
                        index2 = 0;
                    } else if (level.equalsIgnoreCase("13")) {
                        index2 = 1;
                    }
                    theView.getLevelUser().setSelectedIndex(index2);

                    System.out.println("sukses ambil data");
                } catch (SQLException ex) {
                    Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (baris < 0) {
                JOptionPane.showMessageDialog(theView, "pilih dulu datanya!");
            }
        }
    }

    private class hapusUserListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int baris = theView.getTabelUser().getSelectedRow();
            System.out.println("baris = " + baris);
            if (baris != -1) {
                JOptionPane.showMessageDialog(theView, "belum fungsi");
            } else if (baris < 0) {
                JOptionPane.showMessageDialog(theView, "pilih dulu datanya");

            }
        }
    }

    private class simpanUserListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String gender, level;

                theView.getTabelUser().setEnabled(true);
                theView.getTambahUser().setEnabled(true);
                theView.getUbahUser().setEnabled(true);
                theView.getHapusUser().setEnabled(true);

                theView.getNamaUser().setEnabled(false);
                theView.getUsernameUser().setEnabled(false);
                theView.getPasswordUser().setEnabled(false);
                theView.getKontakUser().setEnabled(false);
                theView.getAlamatUser().setEnabled(false);
                theView.getGenderUser().setEnabled(false);
                theView.getLevelUser().setEnabled(false);

                theView.getSimpanUser().setEnabled(false);
                theView.getBatalUser().setEnabled(false);

                String iduser = theView.getIdUser().getText();
                String namauser = theView.getNamaUser().getText();
                String usernameuser = theView.getUsernameUser().getText();
                String passworduser = theView.getPasswordUser().getText();
                String kontakuser = theView.getKontakUser().getText();
                String alamatuser = theView.getAlamatUser().getText();
                String genderuser = (String) theView.getGenderUser().getSelectedItem();
                if (genderuser.equalsIgnoreCase("cowok")) {
                    gender = "1";
                } else {
                    gender = "2";
                }
                String leveluser = (String) theView.getLevelUser().getSelectedItem();
                if (leveluser.equalsIgnoreCase("admin")) {
                    level = "11";
                } else {
                    level = "13";
                }

                if (namauser.isEmpty() || kontakuser.isEmpty() || alamatuser.isEmpty() || usernameuser.isEmpty() || passworduser.isEmpty()) {
                    JOptionPane.showMessageDialog(theView, "Gagal simpan, karna ada data kosong");
                } else if (iduser.isEmpty()) {
                    theModel.insertUser(usernameuser, passworduser, kontakuser, alamatuser, gender, level, namauser);
                    System.out.println("simpan");
                    System.out.println("gender = " + gender + ", level = " + level);
                } else {
                    theModel.updateUser(namauser, kontakuser, alamatuser, iduser);
                    System.out.println("update");
                }

                theView.getIdUser().setText("");
                theView.getNamaUser().setText("nama");
                theView.getUsernameUser().setText("username");
                theView.getPasswordUser().setText("password");
                theView.getKontakUser().setText("kontak");
                theView.getAlamatUser().setText("alamat");
                theView.getGenderUser().setSelectedIndex(0);
                theView.getLevelUser().setSelectedIndex(0);

                theView.getTabelUser().setModel(theModel.getTableUser());
                theView.getTabelJadwal().setModel(theModel.selectCariSemuaJadwal());
            } catch (Exception e) {
            }

        }
    }

    private class batalUserListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theView.getTabelUser().setEnabled(true);
            theView.getTambahUser().setEnabled(true);
            theView.getUbahUser().setEnabled(true);
            theView.getHapusUser().setEnabled(true);

            theView.getNamaUser().setEnabled(false);
            theView.getUsernameUser().setEnabled(false);
            theView.getPasswordUser().setEnabled(false);
            theView.getKontakUser().setEnabled(false);
            theView.getAlamatUser().setEnabled(false);
            theView.getGenderUser().setEnabled(false);
            theView.getLevelUser().setEnabled(false);
            theView.getSimpanUser().setEnabled(false);
            theView.getBatalUser().setEnabled(false);

            theView.getIdUser().setText("");
            theView.getNamaUser().setText("nama");
            theView.getUsernameUser().setText("username");
            theView.getPasswordUser().setText("password");
            theView.getKontakUser().setText("kontak");
            theView.getAlamatUser().setText("alamat");
            theView.getGenderUser().setSelectedIndex(0);
            theView.getLevelUser().setSelectedIndex(0);
        }
    }

    //info
    private class ubahProfilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("ubah profil");
            theView.getNamaProfil().setEnabled(true);
            theView.getAlamatProfil().setEnabled(true);
            theView.getGenderProfil().setEnabled(true);
            theView.getKontakProfil().setEnabled(true);
            theView.getPasswordProfil().setEnabled(true);
            theView.getUsernameProfil().setEnabled(true);

            theView.getSimpanProfil().setEnabled(true);
            theView.getBatalProfil().setEnabled(true);
            theView.getUbahProfil().setEnabled(false);
        }
    }

    private class batalProfilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                theView.getNamaProfil().setEnabled(false);
                theView.getAlamatProfil().setEnabled(false);
                theView.getGenderProfil().setEnabled(false);
                theView.getKontakProfil().setEnabled(false);
                theView.getPasswordProfil().setEnabled(false);
                theView.getUsernameProfil().setEnabled(false);

                theView.getSimpanProfil().setEnabled(false);
                theView.getBatalProfil().setEnabled(false);
                theView.getUbahProfil().setEnabled(true);

                String id = theModel.getIdUser(username);
                theView.getIdProfil().setText(id);
                theView.getNamaProfil().setText(theModel.getNamaProfil(id, username));
                theView.getUsernameProfil().setText(theModel.getUsernameProfil(id, username));
                theView.getPasswordProfil().setText(theModel.getPasswordProfil(id, username));
                theView.getKontakProfil().setText(theModel.getKontakProfil(id, username));
                theView.getAlamatProfil().setText(theModel.getAlamatProfil(id, username));
                theView.getAksesProfil().setText(theModel.getLevelProfil(id, username));
                int index = 0;
                String gender = theModel.getGenderProfil(id, username);
                if (gender.equalsIgnoreCase("cowok")) {
                    index = 0;
                } else if (gender.equalsIgnoreCase("cewek")) {
                    index = 1;
                }
                theView.getGenderProfil().setSelectedIndex(index);
            } catch (Exception e) {
            }
        }
    }

    private class simpanProfilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                theView.getNamaProfil().setEnabled(false);
                theView.getAlamatProfil().setEnabled(false);
                theView.getGenderProfil().setEnabled(false);
                theView.getKontakProfil().setEnabled(false);
                theView.getPasswordProfil().setEnabled(false);
                theView.getUsernameProfil().setEnabled(false);

                theView.getSimpanProfil().setEnabled(false);
                theView.getBatalProfil().setEnabled(false);
                theView.getUbahProfil().setEnabled(true);

                String idProfil = theView.getIdProfil().getText();
                String namaProfil = theView.getNamaProfil().getText();
                String usernameProfil = theView.getUsernameProfil().getText();
                String passwordProfil = theView.getPasswordProfil().getText();
                String kontakProfil = theView.getKontakProfil().getText();
                String alamatProfil = theView.getAlamatProfil().getText();
                String gender2 = (String) theView.getGenderProfil().getSelectedItem();
                String genderProfil;
                if (gender2.equalsIgnoreCase("cowok")) {
                    genderProfil = "1";
                } else {
                    genderProfil = "2";
                }

                if (namaProfil.isEmpty() || usernameProfil.isEmpty() || passwordProfil.isEmpty() || kontakProfil.isEmpty() || alamatProfil.isEmpty() || alamatProfil.isEmpty()) {
                    JOptionPane.showMessageDialog(theView, "gagal ubah, ada data kosong");
                } else if (idProfil.isEmpty()) {
                    System.out.println("kosong");
                } else {
                    theModel.updateProfil(namaProfil, usernameProfil, passwordProfil, kontakProfil, alamatProfil, genderProfil, idProfil);
                    System.out.println("update");
                }

                String id = theModel.getIdUser(username);
                theView.getIdProfil().setText(id);
                theView.getNamaProfil().setText(theModel.getNamaProfil(id, username));
                theView.getUsernameProfil().setText(theModel.getUsernameProfil(id, username));
                theView.getPasswordProfil().setText(theModel.getPasswordProfil(id, username));
                theView.getKontakProfil().setText(theModel.getKontakProfil(id, username));
                theView.getAlamatProfil().setText(theModel.getAlamatProfil(id, username));
                theView.getAksesProfil().setText(theModel.getLevelProfil(id, username));
                int index = 0;
                String gender = theModel.getGenderProfil(id, username);
                if (gender.equalsIgnoreCase("cowok")) {
                    index = 0;
                } else if (gender.equalsIgnoreCase("cewek")) {
                    index = 1;
                }
                theView.getGenderProfil().setSelectedIndex(index);
                theView.getNamaCatatan().setText(theModel.getNamaCatatan());
                theView.getKontakCatatan().setText(theModel.getKontakCatatan());
            } catch (Exception e) {

            }
        }
    }

    private class ubahCatatanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("ubah catatan");
            theView.getCatatan().setEnabled(true);
            theView.getSimpanCatatan().setEnabled(true);
            theView.getBatalCatatan().setEnabled(true);
            theView.getUbahCatatan().setEnabled(false);
        }
    }

    private class simpaCatatanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String catatan = theView.getCatatan().getText();
                String id = theModel.getIdUser(username);
                theModel.updateCatatan(catatan, id);
                System.out.println("sukses update catatan");

                theView.getTanggalCatatan().setText(theModel.getTglCatatan());
                theView.getCatatan().setText(theModel.getCatatan());
                theView.getNamaCatatan().setText(theModel.getNamaCatatan());
                theView.getKontakCatatan().setText(theModel.getKontakCatatan());

                theView.getSimpanCatatan().setEnabled(false);
                theView.getBatalCatatan().setEnabled(false);
                theView.getUbahCatatan().setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class batalCatatanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                theView.getCatatan().setEnabled(false);

                theView.getSimpanCatatan().setEnabled(false);
                theView.getUbahCatatan().setEnabled(true);
                theView.getBatalCatatan().setEnabled(false);

                theView.getTanggalCatatan().setText(theModel.getTglCatatan());
                theView.getCatatan().setText(theModel.getCatatan());
            } catch (SQLException ex) {
                Logger.getLogger(controller_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
