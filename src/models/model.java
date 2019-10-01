/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import db_pbo2.db_main;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.postgresql.jdbc.PgResultSet;
import org.postgresql.util.PSQLException;

/**
 *
 * @author basirudin
 */
public class model extends model_fungsi {

    db_main con;

    public model() throws PSQLException, SQLException {
        con = new db_main("postgres", "sn", "pbo");
    }

    //login
    public String loginUser(String username, String password) throws SQLException {
        String user = "";
        String query = "select username from tb_user where username='" + username + "' and password='" + password + "'";
//        ResultSet rs = con.getResult(query);
        PgResultSet rs = (PgResultSet) con.getResult(query);
        rs.next();
        user = rs.getString(1);
        return user;
    }

    public int levelLogin(String username, String password) throws SQLException {
        int level = 0;
        String query = "select * from tb_user where username='" + username + "' and password='" + password + "'";
//        ResultSet rs = con.getResult(query);
        PgResultSet rs = (PgResultSet) con.getResult(query);
        rs.next();
        level = Integer.valueOf(rs.getString(7));
        return level;
    }

    //id
    public String getid(String namapengguna) throws SQLException {
        String query = "select idpengguna from tb_pengguna where namapengguna='" + namapengguna + "'";
//        ResultSet hasil = con.getResult(query);
        PgResultSet hasil = (PgResultSet) con.getResult(query);
        hasil.next();
        String data = hasil.getString(1);
        return data;
    }

    public String getIdUser(String username) throws SQLException {
        String query = "select iduser from tb_user where username = '" + username + "'";
        PgResultSet hasil = (PgResultSet) con.getResult(query);
        hasil.next();
        String data = hasil.getString(1);
        return data;
    }

    //pengguna
    public boolean loginPengunjung(String username) throws SQLException {
        SimpleDateFormat date = new SimpleDateFormat();
        Date a = new Date();
        String waktuMulai = date.format(a);
        String query = "insert into tb_pengguna (namapengguna, waktumulai, waktuberakhir) values"
                + " ('" + username + "','" + waktuMulai + "','" + waktuMulai + "')";
//        String query = "insert into tb_pengguna values (null, '" + username + "', null, null, null, null, '" + waktuMulai + "', '" + waktuMulai + "')";
        return getDataStatus(query);
    }

    public boolean waktuPengguna(String jam, String menit, String detik, String biaya, String paket, String komputer, String idpengguna) {
        SimpleDateFormat date = new SimpleDateFormat();
        Date a = new Date();
        String waktuBerakhir = date.format(a);
        String query = "update tb_pengguna set jam='" + (jam + "") + "', menit='" + (menit + "") + "', biaya='" + (biaya + "")
                + "',waktuBerakhir='" + (waktuBerakhir + "") + "',komputer='" + (komputer + "") + "',paket='" + (paket + "")
                + "' where idpengguna=" + idpengguna;
//        String query = "update tb_pengguna set jam='" + jam + "', menit='" + menit + "', biaya='" + biaya
//                + "',waktuBerakhir='" + waktuBerakhir + "',komputer='" + komputer + "',paket='" + paket
//                + "' where idpengguna=" + idpengguna;
        System.out.println("query = " + query);
        return getDataStatus(query);
    }

    //admin
    public DefaultTableModel getTableModel(String komputer) throws SQLException {
        String kolom[] = {"ID", "Nama", "Jam (waktu)", "Menit (waktu)", "Biaya (rupiah)", "Paket", "Komputer", "Waktu Mulai", "Waktu Berakhir"};
        DefaultTableModel tabel = new DefaultTableModel(null, kolom);

//        String query = "select * from tb_pengguna";
        String query = "select pengguna.idpengguna, pengguna.namapengguna, pengguna.jam, pengguna.menit, "
                + "pengguna.biaya, paket.paket, komputer.komputer, pengguna.waktumulai, pengguna.waktuberakhir "
                + "from tb_pengguna pengguna join tb_paket paket on pengguna.paket=paket.idpaket "
                + "join tb_komputer komputer on pengguna.komputer=komputer.idkomputer where komputer.komputer='" + komputer + "'";
        ResultSet rs = con.getResult(query);

        while (rs.next()) {
            String row[] = new String[kolom.length];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getString(i + 1);
            }
            tabel.addRow(row);
        }
        return tabel;
    }

    public DefaultTableModel getTableModelSemua() throws SQLException {
        String kolom[] = {"ID", "Nama", "Jam (waktu)", "Menit (waktu)", "Biaya (rupiah)", "Paket", "Komputer", "Waktu Mulai", "Waktu Berakhir"};
        DefaultTableModel tabel = new DefaultTableModel(null, kolom);

//        String query = "select * from tb_pengguna";
        String query = "select pengguna.idpengguna, pengguna.namapengguna, pengguna.jam, pengguna.menit, pengguna.biaya, paket.paket,\n"
                + "komputer.komputer, pengguna.waktumulai, pengguna.waktuberakhir from tb_pengguna pengguna \n"
                + "join tb_paket paket on pengguna.paket=paket.idpaket join tb_komputer komputer on pengguna.komputer=komputer.idkomputer\n"
                + "where komputer.komputer='COM 01' or komputer.komputer='COM 02' or komputer.komputer='COM 03' or komputer.komputer='COM 04' or komputer.komputer='COM 05'"
                + "order by pengguna.idpengguna asc";
        ResultSet rs = con.getResult(query);

        while (rs.next()) {
            String row[] = new String[kolom.length];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getString(i + 1);
            }
            tabel.addRow(row);
        }
        return tabel;
    }

    public DefaultTableModel getTableUser() throws SQLException {
        String kolom[] = {"ID", "Nama", "Username", "Password", "Kontak", "Alamat", "Gender", "Hak Akses"};
        DefaultTableModel tabel = new DefaultTableModel(null, kolom);

//        String query = "select * from tb_pengguna";
        String query = "select users.iduser, users.nama, users.username, users.password, users.kontak, "
                + "users.alamat, gender.gender, lvl.level from tb_user users join tb_gender gender on "
                + "users.gender=gender.idgender join tb_level lvl on users.level=lvl.idlevel "
                + "order by users.iduser asc";
        ResultSet rs = con.getResult(query);

        while (rs.next()) {
            String row[] = new String[kolom.length];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getString(i + 1);
            }
            tabel.addRow(row);
        }
        return tabel;
    }

    //jadwal
    public DefaultTableModel selectCariJadwal(String hari) throws SQLException {
        String kolom[] = {"ID", "Nama", "Kontak", "Gender", "Jadwal Jaga"};
        DefaultTableModel tabel = new DefaultTableModel(null, kolom);

//        String query = "select * from tb_pengguna";
        String query = "select users.iduser, users.nama, users.kontak,gender.gender, users.jadwal from tb_user users join tb_gender gender on users.gender=gender.idgender where level=13 and users.jadwal like '%" + hari + "%'";
        ResultSet rs = con.getResult(query);

        while (rs.next()) {
            String row[] = new String[kolom.length];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getString(i + 1);
            }
            tabel.addRow(row);
        }
        return tabel;
    }

    public DefaultTableModel selectCariSemuaJadwal() throws SQLException {
        String kolom[] = {"ID", "Nama", "Kontak", "Gender", "Jadwal Jaga"};
        DefaultTableModel tabel = new DefaultTableModel(null, kolom);

//        String query = "select * from tb_pengguna";
        String query = "select users.iduser, users.nama, users.kontak,gender.gender, users.jadwal from tb_user users join tb_gender gender on users.gender=gender.idgender where level=13 order by users.iduser asc";
        ResultSet rs = con.getResult(query);

        while (rs.next()) {
            String row[] = new String[kolom.length];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getString(i + 1);
            }
            tabel.addRow(row);
        }
        return tabel;
    }

    public String getNamaJadwal(String id) throws SQLException {
        String query = "select users.nama from tb_user users join tb_gender gender "
                + "on users.gender=gender.idgender where users.level=13 and users.iduser=" + id;
        return getDataString(query);
    }

    public String getGenderJadwal(String id) throws SQLException {
        String query = "select gender.gender from tb_user users join tb_gender gender "
                + "on users.gender=gender.idgender where users.level=13 and users.iduser=" + id;
        return getDataString(query);
    }

    public String getKontakJadwal(String id) throws SQLException {
        String query = "select users.kontak from tb_user users join tb_gender gender "
                + "on users.gender=gender.idgender where users.level=13 and users.iduser=" + id;
        return getDataString(query);
    }

    public String getHariJadwal(String id) throws SQLException {
        String query = "select users.jadwal from tb_user users join tb_gender gender "
                + "on users.gender=gender.idgender where users.level=13 and users.iduser=" + id;
        return getDataString(query);
    }

    public boolean updateJadwal(String jadwal, String id) {
        String query = "update tb_user set jadwal='" + (jadwal + "") + "' where iduser='" + (id + "") + "'";
        System.out.println("update = " + query);
        return getDataStatus(query);
    }

    //ambil harga paket
    public int selectPaket1() throws SQLException {
        String query = "select harga from tb_paket where idpaket = 1";
        return getDataInt(query);
    }

    public int selectPaket2() throws SQLException {
        String query = "select harga from tb_paket where idpaket = 2";
        return getDataInt(query);
    }

    public int selectPaket3() throws SQLException {
        String query = "select harga from tb_paket where idpaket = 3";
        return getDataInt(query);
    }

    public boolean updatePaket1(String harga) throws SQLException {
        String query = "update tb_paket set harga='" + harga + "' where idpaket=1";
        return getDataStatus(query);
    }

    public boolean updatePaket2(String harga) throws SQLException {
        String query = "update tb_paket set harga='" + harga + "' where idpaket=2";
        return getDataStatus(query);
    }

    public boolean updatePaket3(String harga) throws SQLException {
        String query = "update tb_paket set harga='" + harga + "' where idpaket=3";
        return getDataStatus(query);
    }

    //daftar user
    public boolean insertUser(String username, String password, String kontak, String alamat, String gender, String level, String nama) {
        String query = "insert into tb_user (username, password, kontak, alamat, gender, level, nama, jadwal)"
                + " values ('" + username + "', '" + password + "', '" + kontak + "', '" + alamat + "', '" + gender + "', '" + level + "', '" + nama + "','belum')";
        System.out.println("simpan = " + query);
        return getDataStatus(query);
    }

    public boolean updateUser(String nama, String kontak, String alamat, String id) {
        String query = "update tb_user set nama='" + (nama + "") + "', kontak='" + (kontak + "") + "', alamat='" + (alamat + "") + "' where iduser='" + (id + "") + "'";
        return getDataStatus(query);
    }

    public String getNamaUser(String id) throws SQLException {
        String query = "select nama from tb_user where iduser=" + id;
        return getDataString(query);
    }

    public String getUsernameUser(String id) throws SQLException {
        String query = "select username from tb_user where iduser=" + id;
        return getDataString(query);
    }

    public String getPasswordUser(String id) throws SQLException {
        String query = "select password from tb_user where iduser=" + id;
        return getDataString(query);
    }

    public String getKontakUser(String id) throws SQLException {
        String query = "select kontak from tb_user where iduser=" + id;
        return getDataString(query);
    }

    public String getAlamatUser(String id) throws SQLException {
        String query = "select alamat from tb_user where iduser=" + id;
        return getDataString(query);
    }

    public String getGenderUser(String id) throws SQLException {
        String query = "select gender from tb_user where iduser=" + id;
        return getDataString(query);
    }

    public String getLevelUser(String id) throws SQLException {
        String query = "select level from tb_user where iduser=" + id;
        return getDataString(query);
    }

    //info
    public String getNamaProfil(String id, String username) throws SQLException {
        String query = "select nama from tb_user where username='" + username + "' and iduser='" + id + "'";
        return getDataString(query);
    }

    public String getUsernameProfil(String id, String username) throws SQLException {
        String query = "select username from tb_user where username='" + username + "' and iduser='" + id + "'";
        return getDataString(query);
    }

    public String getPasswordProfil(String id, String username) throws SQLException {
        String query = "select password from tb_user where username='" + username + "' and iduser='" + id + "'";
        return getDataString(query);
    }

    public String getKontakProfil(String id, String username) throws SQLException {
        String query = "select kontak from tb_user where username='" + username + "' and iduser='" + id + "'";
        return getDataString(query);
    }

    public String getAlamatProfil(String id, String username) throws SQLException {
        String query = "select alamat from tb_user where username='" + username + "' and iduser='" + id + "'";
        return getDataString(query);
    }

    public String getGenderProfil(String id, String username) throws SQLException {
        String query = "select gender.gender from tb_user users join tb_gender gender on users.gender=gender.idgender where users.username='" + username + "' and users.iduser='" + id + "'";
        return getDataString(query);
    }

    public String getLevelProfil(String id, String username) throws SQLException {
        String query = "select level.level from tb_user users join tb_level level on users.level=level.idlevel where users.username='" + username + "' and users.iduser='" + id + "'";
        return getDataString(query);
    }

    public boolean updateCatatan(String catatan, String id) {
        SimpleDateFormat date = new SimpleDateFormat();
        Date a = new Date();
        String tglBuat = date.format(a);
        String query = "update tb_catatan set catatan = '" + (catatan + "") + "', pembuat = '" + (id + "") + "', tglbuat = '" + (tglBuat + "") + "'";
        return getDataStatus(query);
    }

    public boolean updateProfil(String nama, String username, String password, String kontak, String alamat, String gender, String id) {
        String query = "update tb_user set nama='" + (nama + "") + "', username='" + (username + "") + "', password='" + (password + "") + "', kontak='" + (kontak) + "', alamat='" + (alamat + "") + "', gender='" + (gender + "") + "' where iduser='" + (id + "") + "'";
        System.out.println("update = " + query);
        return getDataStatus(query);
    }

    public String getTglCatatan() throws SQLException {
        String query = "select tglbuat from tb_catatan where idcatatan = 1";
        return getDataString(query);
    }

    public String getCatatan() throws SQLException {
        String query = "select catatan from tb_catatan where idcatatan = 1";
        return getDataString(query);
    }

    public String getNamaCatatan() throws SQLException {
        String query = "select users.nama from tb_user users join tb_catatan catatan on catatan.pembuat=users.iduser where catatan.idcatatan=1";
        return getDataString(query);
    }

    public String getKontakCatatan() throws SQLException {
        String query = "select users.kontak, users.kontak from tb_user users join tb_catatan catatan on catatan.pembuat=users.iduser where catatan.idcatatan=1";
        return getDataString(query);
    }
}
