/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.SingletonUser;
import model.user;

public class Login {

    public String LoginController(String tipe, String userName, String pass) {
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        String tempPass = pass;
        pass = Hasher.password(pass);
        try {
            java.sql.Statement stat = conn.con.createStatement();
            ResultSet result = stat.executeQuery("select * from " + "user" + " where username ='" + userName + "'");
            
            if (result.next()) {

                if (pass.equals(result.getString("password"))) {
                    if (tipe.equals(result.getString("tipe"))) {
                        int id = result.getInt("id_user");
                        String username = result.getString("username");
                        String no_telp = result.getString("no_telepon");
                        String nama_lengkap = result.getString("nama_lengkap");
                        String alamat = result.getString("alamat_lengkap");
                        String kota = result.getString("kota");
                        String provinsi = result.getString("provinsi");
                        String kode_post = result.getString("kode_post");
                        user customer = new user( id,username,pass,no_telp,nama_lengkap,alamat, kota, provinsi, kode_post,tipe);
                        SingletonUser.getInstance().setUser(customer);
                        return "Login Berhasil!";
                    }
                    return "Password Salah!";
                } else {
                    return "User tidak ditemukan!";
                }

            } else {
                return "User tidak ditemukan!";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error";
        }
    }
}
