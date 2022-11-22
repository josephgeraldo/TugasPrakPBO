/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.*;

public class Login {

    public String LoginController(String tipe, String userName, String pass) throws SQLException {
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        String tempPass = pass;
        pass = Hasher.password(pass);
        try{
            java.sql.Statement stat = conn.con.createStatement();
            ResultSet result = stat.executeQuery("select * from " + "user" + " where username ='" + userName + "'");
            
            if (result.next()) {

                if (pass.equals(result.getString("password"))) {
                    if (tipe.equals(result.getString("tipe"))) {
                        return "Login Berhasil!";
                    }
                    return "Password Salah!";
                } else {
                    return "User tidak ditemukan!";
                }

            } else {
                return "User tidak ditemukan!";
            }
        }catch(SQLException e) {
                e.printStackTrace();
            return "Error";
        }
    }
}
