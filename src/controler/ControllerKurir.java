/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import model.kurir;
import controler.DatabaseHandler;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Joseph
 */

public class ControllerKurir {
    static DatabaseHandler conn = new DatabaseHandler();
    static kurir kurir;
    public static void addKurir(String username, String kapasitas, String totalBerat) {
        conn.connect();
        String query = "INSERT INTO kurir(username, kapasitas_berat_barang, total_berat_barang) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, kapasitas);
            stmt.setString(3, totalBerat);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil melakukan penamabahan");

        } catch (SQLException e) {
            if (e.getMessage().contains("'username'")) {
                JOptionPane.showMessageDialog(null, "Username sudah digunakan");
            } else if (e.getMessage().contains("'pass'")) {
                JOptionPane.showMessageDialog(null, "Password sudah digunakan");
            } else {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error fatal !");
            }

        }

    }
}
