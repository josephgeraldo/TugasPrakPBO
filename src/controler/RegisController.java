/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisController {

    public String register(String nama_lengkap, String username, String password, String no_telepon, String alamat_lengkap, String kota, String provinsi, String kode_post) {
        DatabaseHandler con = new DatabaseHandler();
        con.connect();
        String query = "INSERT INTO user(nama_lengkap,username,password,no_telepon,alamat_lengkap,kota,provinsi,kode_post) VALUES(?,?,?,?,?,?,?,?)";
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(password.getBytes());
            byte[] bytes = m.digest();
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            password = s.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement stmt = con.con.prepareStatement(query);
            stmt.setString(1, nama_lengkap);
            stmt.setString(2, username);
            stmt.setString(3, password);
            stmt.setString(4, no_telepon);
            stmt.setString(5, alamat_lengkap);
            stmt.setString(6, kota);
            stmt.setString(7, provinsi);
            stmt.setString(8, kode_post);
            stmt.executeUpdate();
            return "Berhasil melakukan registrasi";
            
        } catch (SQLException e) {
            if (e.getMessage().contains("'username'")) {
                return "Username sudah terdaftar!!!";
            } else if (e.getMessage().contains("'no_telepon'")) {
                return "Nomor telepon sudah terdaftar!!!";
            } else {
                e.printStackTrace();
                return "Error!!!";
            }
        }
    }
}