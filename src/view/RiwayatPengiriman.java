/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.ControllerKurir;
import controler.DatabaseHandler;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;



/**
 *
 * @author Joseph
 */

public class RiwayatPengiriman {
    static DatabaseHandler conn = new DatabaseHandler();
    public RiwayatPengiriman() {
        String columns[] = {"IDKurir", "Username", "KapasitasBerat", "TotalBerat", "IDUser", "IDPesanan", "StatusBayar", "StatusKirim"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        JTable table = new JTable(model);
        table.setShowGrid(true);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumn eventColumn = table.getColumnModel().getColumn(0);
        eventColumn.setPreferredWidth(150);
        TableColumn eventColumn2 = table.getColumnModel().getColumn(1);
        eventColumn2.setPreferredWidth(100);
        TableColumn eventColumn3 = table.getColumnModel().getColumn(2);
        eventColumn3.setPreferredWidth(150);
        TableColumn eventColumn4 = table.getColumnModel().getColumn(3);
        eventColumn4.setPreferredWidth(150);
        TableColumn eventColumn5 = table.getColumnModel().getColumn(4);
        eventColumn5.setPreferredWidth(150);
        TableColumn eventColumn6 = table.getColumnModel().getColumn(5);
        eventColumn6.setPreferredWidth(150);
        TableColumn eventColumn7 = table.getColumnModel().getColumn(6);
        eventColumn7.setPreferredWidth(150);
        TableColumn eventColumn8 = table.getColumnModel().getColumn(7);
        eventColumn8.setPreferredWidth(150);
        JScrollPane pane = new JScrollPane(table);

        conn.connect();
        String query = "SELECT k.id_kurir, k.username, k.kapasitas_berat, k.total_berat_bawaan, p.pesanan_id, p.id_user, p.status_pembayaran, p.status_pengiriman FROM pesanan p INNER JOIN kurir k ON k.id_kurir = p.id_kurir";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String kurir = rs.getString("id_kurir");
                String username = rs.getString("username");
                String kBerat = rs.getString("kapasitas_berat");
                String berat = rs.getString("total_berat_bawaan");
                String idPesanan = rs.getString("pesanan_id");
                String idUser = rs.getString("id_user");
                String statusBayar = rs.getString("status_pembayaran");
                String statusKirim = rs.getString("status_pengiriman");

                String[] baris = {kurir, username, kBerat, berat, idPesanan, idUser, statusBayar, statusKirim};
                model.addRow(baris);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Tabel History");
        JPanel panel = new JPanel();

        JButton buttonExit = new JButton("BACK");
        buttonExit.setBounds(600, 460, 100, 40);

        panel.add(pane);
        frame.add(buttonExit);
        frame.add(panel);
        frame.add(panel);
        frame.setSize(600, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        buttonExit.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae
            ) {
                new MenuKurir();
            }
        });
    }
}

