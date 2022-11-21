/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes1.controler;

import java.sql.ResultSet;
import java.sql.SQLException;
import tubes1.model.user;
import tubes1.model.SingeltonProfile;

/**
 *
 * @author user
 */
public class Login {
    public String LoginController(String tipe, String userName, String pass) {
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        String tempPass = pass;
        pass = Hasher.password(pass);
        try {
            java.sql.Statement stat = conn.con.createStatement();
            ResultSet result = stat.executeQuery("select * from " + tipe + " where username='" + userName + "'");

            if (result.next()) {
                if (pass.equals(result.getString("pass"))) {
                    if (tipe.equals("customers")) {
                        
                    } else if (tipe.equals("admin")) {
                        
                    } else if (tipe.equals("kurir")) {
                        
                    }
                    return "Login Berhasil!";
                } else {
                    return "Password Salah!";
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
