/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author basirudin
 */
public class view_admin extends javax.swing.JFrame {

    /**
     * Creates new form view_admin
     */
    public view_admin() {
        initComponents();
        //beranda
        tf_skemaHarga.setEnabled(false);
        btn_batalBeranda.setEnabled(false);
        btn_simpanBeranda.setEnabled(false);
        cb_paket.setEnabled(false);

        //daftar user
        tf_alamatUser.setEnabled(false);
        tf_idUser.setEnabled(false);
        tf_kontakUser.setEnabled(false);
        tf_namaUser.setEnabled(false);
        tf_passwordUser.setEnabled(false);
        tf_usernameUser.setEnabled(false);
        cb_genderUser.setEnabled(false);
        cb_levelUser.setEnabled(false);
        btn_simpanUser.setEnabled(false);
        btn_batalUser.setEnabled(false);

        //jadwal
        btn_batalJadwal.setEnabled(false);
        btn_simpanJadwal.setEnabled(false);
        cb_listJadwal.setEnabled(false);
        tf_namaJadwal.setEnabled(false);
        tf_kontakJadwal.setEnabled(false);
        tf_genderJadwal.setEnabled(false);

        //info
        tf_aksesProfil.setEnabled(false);
        tf_alamatProfil.setEnabled(false);
        tf_genderProfil.setEnabled(false);
        tf_idProfil.setEnabled(false);
        tf_kontakProfil.setEnabled(false);
        tf_namaProfil.setEnabled(false);
        tf_passwordProfil.setEnabled(false);
        tf_usernameProfil.setEnabled(false);
        btn_simpanProfil.setEnabled(false);
        btn_batalProfil.setEnabled(false);
        btn_simpanCatatan.setEnabled(false);
        btn_batalCatatan.setEnabled(false);
        txt_catatan.setEnabled(false);
    }

    //beranda
    public JTable getTabelPengguna() {
        return tabel_pengguna;
    }
    
    public JComboBox getKomputer() {
        return cb_komputer;
    }
    
    public void btnPilihBerandaListener(ActionListener e) {
        this.cb_komputer.addActionListener(e);
    }
    
    public void btnBatalBerandaListener(ActionListener e) {
        this.btn_batalBeranda.addActionListener(e);
    }
    
    public void btnPaketBerandaListener(ActionListener e) {
        this.cb_paket.addActionListener(e);
    }
    
    public void btnUbahBerandaListener(ActionListener e) {
        this.btn_ubahBeranda.addActionListener(e);
    }
    
    public void btnSimpanBerandaListener(ActionListener e) {
        this.btn_simpanBeranda.addActionListener(e);
    }
    
    public JButton getSimpanBeranda() {
        return btn_simpanBeranda;
    }
    
    public JButton getUbahBeranda() {
        return btn_ubahBeranda;
    }
    
    public JComboBox getPaket() {
        return cb_paket;
    }
    
    public JTextField getSkemaHarga() {
        return tf_skemaHarga;
    }
    
    public JButton getBatalBeranda() {
        return btn_batalBeranda;
    }

    //daftar user
    public void btnTambahUserListener(ActionListener e) {
        this.btn_tambahUser.addActionListener(e);
    }
    
    public void btnUbahUserListener(ActionListener e) {
        this.btn_ubahUser.addActionListener(e);
    }
    
    public void btnHapusUserListener(ActionListener e) {
        this.btn_hapusUser.addActionListener(e);
    }
    
    public void btnSimpanUserListener(ActionListener e) {
        this.btn_simpanUser.addActionListener(e);
    }
    
    public void btnBatalUserListener(ActionListener e) {
        this.btn_batalUser.addActionListener(e);
    }
    
    public JTable getTabelUser() {
        return tb_dataUser;
    }
    
    public JButton getTambahUser() {
        return btn_tambahUser;
    }
    
    public JButton getUbahUser() {
        return btn_ubahUser;
    }
    
    public JButton getHapusUser() {
        return btn_hapusUser;
    }
    
    public JButton getSimpanUser() {
        return btn_simpanUser;
    }
    
    public JButton getBatalUser() {
        return btn_batalUser;
    }
    
    public JTextField getIdUser() {
        return tf_idUser;
    }
    
    public JTextField getNamaUser() {
        return tf_namaUser;
    }
    
    public JTextField getUsernameUser() {
        return tf_usernameUser;
    }
    
    public JTextField getPasswordUser() {
        return tf_passwordUser;
    }
    
    public JTextField getKontakUser() {
        return tf_kontakUser;
    }
    
    public JTextField getAlamatUser() {
        return tf_alamatUser;
    }
    
    public JComboBox getGenderUser() {
        return cb_genderUser;
    }
    
    public JComboBox getLevelUser() {
        return cb_levelUser;
    }

    //jadwal jaga
    public void btnCariJadwalListener(ActionListener e) {
        this.cb_cariJadwal.addActionListener(e);
    }

    public void btnOkJadwalListener(ActionListener e) {
        this.btn_okJadwal.addActionListener(e);
    }
    
    public void btnUbahJadwalListener(ActionListener e) {
        this.btn_ubahJadwal.addActionListener(e);
    }
    
    public void btnSimpanJadwalListener(ActionListener e) {
        this.btn_simpanJadwal.addActionListener(e);
    }
    
    public void btnBatalJadwalListner(ActionListener e) {
        this.btn_batalJadwal.addActionListener(e);
    }
    
    public JButton getOkJadwal() {
        return btn_okJadwal;
    }
    
    public JTextField getIdJadwal() {
        return tf_idJadwal;
    }
    
    public JComboBox getListJadwal() {
        return cb_listJadwal;
    }
    
    public JComboBox getCariJadwal() {
        return cb_cariJadwal;
    }
    
    public JTable getTabelJadwal() {
        return tb_jadwal;
    }
    
    public JTextField getGenderJadwal() {
        return tf_genderJadwal;
    }
    
    public JTextField getNamaJadwal() {
        return tf_namaJadwal;
    }
    
    public JTextField getKontakJadwal() {
        return tf_kontakJadwal;
    }
    
    public JButton getSimpanJadwal() {
        return btn_simpanJadwal;
    }
    
    public JButton getBatalJadwal() {
        return btn_batalJadwal;
    }
    
    public JButton getUbahJadwal() {
        return btn_ubahJadwal;
    }

    //info
    public void btnUbahProfilListener(ActionListener e) {
        this.btn_ubahProfil.addActionListener(e);
    }
    
    public void btnSimpanProfilListener(ActionListener e) {
        this.btn_simpanProfil.addActionListener(e);
    }
    
    public void btnUbahCatatanListener(ActionListener e) {
        this.btn_ubahCatatan.addActionListener(e);
    }
    
    public void btnSimpanCatatanListener(ActionListener e) {
        this.btn_simpanCatatan.addActionListener(e);
    }
    
    public void btnBatalProfilListener(ActionListener e) {
        this.btn_batalProfil.addActionListener(e);
    }
    
    public void btnBatalCatatanListener(ActionListener e) {
        this.btn_batalCatatan.addActionListener(e);
    }
    
    public JButton getBatalProfil() {
        return btn_batalProfil;
    }
    
    public JButton getBatalCatatan() {
        return btn_batalCatatan;
    }
    
    public JButton getUbahProfil() {
        return btn_ubahProfil;
    }
    
    public JButton getSimpanProfil() {
        return btn_simpanProfil;
    }
    
    public JButton getSimpanCatatan() {
        return btn_simpanCatatan;
    }
    
    public JButton getUbahCatatan() {
        return btn_ubahCatatan;
    }
    
    public JTextField getNamaProfil() {
        return tf_namaProfil;
    }
    
    public JTextField getUsernameProfil() {
        return tf_usernameProfil;
    }
    
    public JTextField getPasswordProfil() {
        return tf_passwordProfil;
    }
    
    public JTextField getAlamatProfil() {
        return tf_alamatProfil;
    }
    
    public JTextField getKontakProfil() {
        return tf_kontakProfil;
    }
    
    public JTextField getAksesProfil() {
        return tf_aksesProfil;
    }
    
    public JComboBox getGenderProfil() {
        return tf_genderProfil;
    }
    
    public JTextField getIdProfil() {
        return tf_idProfil;
    }
    
    public JTextField getTanggalCatatan() {
        return tf_tanggalCatatan;
    }
    
    public JTextArea getCatatan() {
        return txt_catatan;
    }

    public JTextField getNamaCatatan() {
        return tf_namaCatatan;
    }

    public JTextField getKontakCatatan() {
        return tf_kontakCatatan;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cb_komputer = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_pengguna = new javax.swing.JTable();
        btn_batalBeranda = new javax.swing.JButton();
        cb_paket = new javax.swing.JComboBox<>();
        tf_skemaHarga = new javax.swing.JTextField();
        btn_simpanBeranda = new javax.swing.JButton();
        btn_ubahBeranda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_jadwal = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        tf_namaJadwal = new javax.swing.JTextField();
        tf_kontakJadwal = new javax.swing.JTextField();
        cb_listJadwal = new javax.swing.JComboBox<>();
        btn_simpanJadwal = new javax.swing.JButton();
        btn_batalJadwal = new javax.swing.JButton();
        cb_cariJadwal = new javax.swing.JComboBox<>();
        btn_okJadwal = new javax.swing.JButton();
        btn_ubahJadwal = new javax.swing.JButton();
        tf_genderJadwal = new javax.swing.JTextField();
        tf_idJadwal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_dataUser = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        tf_namaUser = new javax.swing.JTextField();
        tf_usernameUser = new javax.swing.JTextField();
        tf_passwordUser = new javax.swing.JTextField();
        tf_alamatUser = new javax.swing.JTextField();
        tf_kontakUser = new javax.swing.JTextField();
        cb_genderUser = new javax.swing.JComboBox<>();
        cb_levelUser = new javax.swing.JComboBox<>();
        btn_simpanUser = new javax.swing.JButton();
        btn_batalUser = new javax.swing.JButton();
        tf_idUser = new javax.swing.JTextField();
        btn_hapusUser = new javax.swing.JButton();
        btn_ubahUser = new javax.swing.JButton();
        btn_tambahUser = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        tf_namaProfil = new javax.swing.JTextField();
        tf_usernameProfil = new javax.swing.JTextField();
        tf_passwordProfil = new javax.swing.JTextField();
        tf_alamatProfil = new javax.swing.JTextField();
        tf_kontakProfil = new javax.swing.JTextField();
        tf_aksesProfil = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        tf_genderProfil = new javax.swing.JComboBox<>();
        btn_simpanProfil = new javax.swing.JButton();
        tf_idProfil = new javax.swing.JTextField();
        btn_batalProfil = new javax.swing.JButton();
        btn_ubahProfil = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        tf_tanggalCatatan = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_catatan = new javax.swing.JTextArea();
        btn_simpanCatatan = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        btn_ubahCatatan = new javax.swing.JButton();
        btn_batalCatatan = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        tf_namaCatatan = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        tf_kontakCatatan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HALAMAN ADMIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cb_komputer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEMUA", "COM 01", "COM 02", "COM 03", "COM 04", "COM 05" }));
        cb_komputer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabel_pengguna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_pengguna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabel_pengguna.setEnabled(false);
        tabel_pengguna.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tabel_pengguna);

        btn_batalBeranda.setText("batal");
        btn_batalBeranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cb_paket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAKET 1 (/JAM)", "PAKET 2 (3 JAM)", "PAKET 3 (5 JAM)" }));
        cb_paket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tf_skemaHarga.setText("skema harga");

        btn_simpanBeranda.setText("simpan");

        btn_ubahBeranda.setText("ubah harga");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_skemaHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_paket, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_simpanBeranda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batalBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ubahBeranda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(cb_komputer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_komputer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batalBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_paket, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_skemaHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpanBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ubahBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("beranda", jPanel1);

        tb_jadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tb_jadwal);

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tf_namaJadwal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_namaJadwal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_namaJadwal.setText("nama");
        tf_namaJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tf_kontakJadwal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_kontakJadwal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_kontakJadwal.setText("nomor");
        tf_kontakJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cb_listJadwal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_listJadwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senin 07.00 - 12.00", "Senin 12.00 - 18.00", "Senin 18.00 - 24.00", "Selasa 07.00 - 12.00", "Selasa 12.00 - 18.00", "Selasa 18.00 - 24.00", "Rabu 07.00 - 12.00", "Rabu 12.00 - 18.00", "Rabu 18.00 - 24.00", "Kamis 07.00 - 12.00", "Kamis 12.00 - 18.00", "Kamis 18.00 - 24.00", "Jumat 07.00 - 12.00", "Jumat 12.00 - 18.00", "Jumat 18.00 - 24.00", "Sabtu 07.00 - 12.00", "Sabtu 12.00 - 18.00", "Sabtu 18.00 - 24.00", "Minggu 07.00 - 12.00", "Minggu 12.00 - 18.00", "Minggu 18.00 - 24.00" }));
        cb_listJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_simpanJadwal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_simpanJadwal.setText("simpan");

        btn_batalJadwal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_batalJadwal.setText("batal");

        cb_cariJadwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" }));

        btn_okJadwal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_okJadwal.setText("OK");

        btn_ubahJadwal.setText("ubah jadwal");

        tf_genderJadwal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_genderJadwal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_genderJadwal.setText("gender");

        tf_idJadwal.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_namaJadwal)
                    .addComponent(btn_ubahJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_kontakJadwal)
                    .addComponent(cb_listJadwal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_simpanJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batalJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cb_cariJadwal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_okJadwal))
                    .addComponent(tf_genderJadwal)
                    .addComponent(tf_idJadwal))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_okJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_cariJadwal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_namaJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_kontakJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_genderJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_listJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_idJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btn_ubahJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpanJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batalJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("jadwal jaga warnet", jPanel2);

        tb_dataUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tb_dataUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tb_dataUser);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tf_namaUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_namaUser.setText("nama");

        tf_usernameUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_usernameUser.setText("username");

        tf_passwordUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_passwordUser.setText("password");

        tf_alamatUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_alamatUser.setText("kontak");

        tf_kontakUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_kontakUser.setText("alamat");

        cb_genderUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_genderUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cowok", "cewek" }));

        cb_levelUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_levelUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "operator" }));

        btn_simpanUser.setText("simpan");

        btn_batalUser.setText("batal");

        tf_idUser.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_namaUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_usernameUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_passwordUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_alamatUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_kontakUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_genderUser, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_levelUser, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_simpanUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batalUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tf_idUser))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_namaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_usernameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_passwordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_alamatUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_kontakUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_genderUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_levelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_idUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpanUser)
                    .addComponent(btn_batalUser))
                .addContainerGap())
        );

        btn_hapusUser.setText("hapus");

        btn_ubahUser.setText("ubah");

        btn_tambahUser.setText("tambah");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_tambahUser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ubahUser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapusUser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_hapusUser)
                            .addComponent(btn_ubahUser)
                            .addComponent(btn_tambahUser))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("daftar user", jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField4.setText("Nama");
        jTextField4.setBorder(null);
        jTextField4.setFocusable(false);
        jTextField4.setOpaque(false);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.setText("Profil");
        jTextField5.setBorder(null);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField6.setText("Username");
        jTextField6.setBorder(null);
        jTextField6.setFocusable(false);
        jTextField6.setOpaque(false);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField7.setText("Password");
        jTextField7.setBorder(null);
        jTextField7.setFocusable(false);
        jTextField7.setOpaque(false);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField8.setText("Alamat");
        jTextField8.setBorder(null);
        jTextField8.setFocusable(false);
        jTextField8.setOpaque(false);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField9.setText("Kontak");
        jTextField9.setBorder(null);
        jTextField9.setFocusable(false);
        jTextField9.setOpaque(false);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField10.setText("Hak Akses");
        jTextField10.setBorder(null);
        jTextField10.setFocusable(false);
        jTextField10.setOpaque(false);

        tf_namaProfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_usernameProfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_passwordProfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_alamatProfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_kontakProfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_aksesProfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField17.setText("Gender");
        jTextField17.setBorder(null);
        jTextField17.setOpaque(false);

        tf_genderProfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_genderProfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cowok", "cewek" }));

        btn_simpanProfil.setText("simpan");

        tf_idProfil.setEditable(false);
        tf_idProfil.setBorder(null);

        btn_batalProfil.setText("batal");

        btn_ubahProfil.setText("ubah");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_namaProfil)
                            .addComponent(tf_usernameProfil)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_idProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_ubahProfil)
                            .addComponent(jTextField17)
                            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(jTextField9)
                            .addComponent(jTextField8)
                            .addComponent(jTextField7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btn_batalProfil, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_simpanProfil))
                            .addComponent(tf_passwordProfil, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_alamatProfil, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_kontakProfil, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_aksesProfil)
                            .addComponent(tf_genderProfil, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_idProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_namaProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_usernameProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_passwordProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_alamatProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_kontakProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_aksesProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tf_genderProfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpanProfil)
                    .addComponent(btn_batalProfil)
                    .addComponent(btn_ubahProfil))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1.setEditable(false);
        jTextField1.setText("diubah");
        jTextField1.setBorder(null);
        jTextField1.setFocusable(false);
        jTextField1.setOpaque(false);

        tf_tanggalCatatan.setEditable(false);
        tf_tanggalCatatan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tf_tanggalCatatan.setText("tanggal");
        tf_tanggalCatatan.setBorder(null);
        tf_tanggalCatatan.setOpaque(false);

        txt_catatan.setColumns(20);
        txt_catatan.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txt_catatan.setLineWrap(true);
        txt_catatan.setRows(5);
        jScrollPane4.setViewportView(txt_catatan);

        btn_simpanCatatan.setText("simpan");
        btn_simpanCatatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setText("Catatan");
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);

        btn_ubahCatatan.setText("ubah");

        btn_batalCatatan.setText("batal");

        jTextField2.setEditable(false);
        jTextField2.setText("pembuat");
        jTextField2.setBorder(null);

        tf_namaCatatan.setEditable(false);
        tf_namaCatatan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tf_namaCatatan.setText("nama");
        tf_namaCatatan.setBorder(null);

        jTextField12.setEditable(false);
        jTextField12.setText("kontak");
        jTextField12.setBorder(null);

        tf_kontakCatatan.setEditable(false);
        tf_kontakCatatan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tf_kontakCatatan.setText("kontak");
        tf_kontakCatatan.setBorder(null);

        jLabel2.setText(":");

        jLabel3.setText(":");

        jLabel4.setText(":");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(jTextField12)
                                    .addComponent(jTextField1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(tf_namaCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_kontakCatatan)
                                            .addComponent(tf_tanggalCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btn_ubahCatatan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_batalCatatan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_simpanCatatan))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_namaCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_kontakCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tanggalCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpanCatatan)
                    .addComponent(btn_ubahCatatan)
                    .addComponent(btn_batalCatatan))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("info", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 780, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batalBeranda;
    private javax.swing.JButton btn_batalCatatan;
    private javax.swing.JButton btn_batalJadwal;
    private javax.swing.JButton btn_batalProfil;
    private javax.swing.JButton btn_batalUser;
    private javax.swing.JButton btn_hapusUser;
    private javax.swing.JButton btn_okJadwal;
    private javax.swing.JButton btn_simpanBeranda;
    private javax.swing.JButton btn_simpanCatatan;
    private javax.swing.JButton btn_simpanJadwal;
    private javax.swing.JButton btn_simpanProfil;
    private javax.swing.JButton btn_simpanUser;
    private javax.swing.JButton btn_tambahUser;
    private javax.swing.JButton btn_ubahBeranda;
    private javax.swing.JButton btn_ubahCatatan;
    private javax.swing.JButton btn_ubahJadwal;
    private javax.swing.JButton btn_ubahProfil;
    private javax.swing.JButton btn_ubahUser;
    private javax.swing.JComboBox<String> cb_cariJadwal;
    private javax.swing.JComboBox<String> cb_genderUser;
    private javax.swing.JComboBox<String> cb_komputer;
    private javax.swing.JComboBox<String> cb_levelUser;
    private javax.swing.JComboBox<String> cb_listJadwal;
    private javax.swing.JComboBox<String> cb_paket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tabel_pengguna;
    private javax.swing.JTable tb_dataUser;
    private javax.swing.JTable tb_jadwal;
    private javax.swing.JTextField tf_aksesProfil;
    private javax.swing.JTextField tf_alamatProfil;
    private javax.swing.JTextField tf_alamatUser;
    private javax.swing.JTextField tf_genderJadwal;
    private javax.swing.JComboBox<String> tf_genderProfil;
    private javax.swing.JTextField tf_idJadwal;
    private javax.swing.JTextField tf_idProfil;
    private javax.swing.JTextField tf_idUser;
    private javax.swing.JTextField tf_kontakCatatan;
    private javax.swing.JTextField tf_kontakJadwal;
    private javax.swing.JTextField tf_kontakProfil;
    private javax.swing.JTextField tf_kontakUser;
    private javax.swing.JTextField tf_namaCatatan;
    private javax.swing.JTextField tf_namaJadwal;
    private javax.swing.JTextField tf_namaProfil;
    private javax.swing.JTextField tf_namaUser;
    private javax.swing.JTextField tf_passwordProfil;
    private javax.swing.JTextField tf_passwordUser;
    private javax.swing.JTextField tf_skemaHarga;
    private javax.swing.JTextField tf_tanggalCatatan;
    private javax.swing.JTextField tf_usernameProfil;
    private javax.swing.JTextField tf_usernameUser;
    private javax.swing.JTextArea txt_catatan;
    // End of variables declaration//GEN-END:variables
}
