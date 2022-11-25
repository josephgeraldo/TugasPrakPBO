/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.DatabaseHandler;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.PengirimanEnum;
import model.statusPengiriman;

/**
 *
 * @author joseph
 */
public class TerimaPesanan {
    static DatabaseHandler conn = new DatabaseHandler();
    PengirimanEnum kemas = PengirimanEnum.valueOf("PENGEMASAN");
    PengirimanEnum tunggu = PengirimanEnum.valueOf("MENUNGGU_KURIR");
    PengirimanEnum antar = PengirimanEnum.valueOf("DIANTAR");
    PengirimanEnum sampai = PengirimanEnum.valueOf("SAMPAI");
    public TerimaPesanan() {
        PengirimanEnum kemas = PengirimanEnum.valueOf("PENGEMASAN");
        PengirimanEnum tunggu = PengirimanEnum.valueOf("MENUNGGU_KURIR");
        PengirimanEnum antar = PengirimanEnum.valueOf("DIANTAR");
        PengirimanEnum sampai = PengirimanEnum.valueOf("SAMPAI");

        String columns[] = {"IDPesanan", "IDProduk", "IDUser", "Berat", "Jumlah", "Harga", "StatusPengiriman"};

        DefaultTableModel model = new DefaultTableModel(null, columns);
        JTable table = new JTable(model);
        table.setShowGrid(true);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumn eventColumn = table.getColumnModel().getColumn(0);
        eventColumn.setPreferredWidth(100);
        TableColumn eventColumn2 = table.getColumnModel().getColumn(1);
        eventColumn2.setPreferredWidth(100);
        TableColumn eventColumn3 = table.getColumnModel().getColumn(2);
        eventColumn3.setPreferredWidth(100);
        TableColumn eventColumn4 = table.getColumnModel().getColumn(3);
        eventColumn4.setPreferredWidth(100);
        TableColumn eventColumn5 = table.getColumnModel().getColumn(4);
        eventColumn5.setPreferredWidth(100);
        TableColumn eventColumn6 = table.getColumnModel().getColumn(5);
        eventColumn6.setPreferredWidth(150);
        JScrollPane pane = new JScrollPane(table);

        conn.connect();
        String query = "SELECT * FROM pesanan";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String id_pesanan = rs.getString("id_pesanan");
                String id_produk = rs.getString("id_produk");
                String id_user = rs.getString("id_user");
                String berat = rs.getString("berat");
                String jumlah = rs.getString("jumlah");
                String harga = rs.getString("harga");
                String status_pengiriman = rs.getString("status_pengiriman");
                
                String status_kirim = rs.getString("status_pengiriman");
                if (status_kirim.equals(kemas.ordinal())) {
                    kemas = PengirimanEnum.PENGEMASAN;
                } else if (status_kirim.equals(tunggu.ordinal())) {
                    tunggu = PengirimanEnum.MENUNGGU_KURIR;
                } else if (status_kirim.equals(antar)) {
                    antar = PengirimanEnum.MENUNGGU_KURIR;
                } else if (status_kirim.equals(sampai)) {
                    sampai = PengirimanEnum.SAMPAI;;
                }
                
                String[] baris = {id_pesanan, id_produk, id_user, berat, jumlah, harga, status_pengiriman};
                model.addRow(baris);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("View Pengiriman");
        JPanel panel = new JPanel();

        JButton buttonUpdate = new JButton("AMBIL");
        buttonUpdate.setBounds(110, 460, 100, 40);
        
        panel.add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(buttonUpdate);
        frame.add(panel);
        frame.add(panel);
        frame.setSize(700, 800);
        frame.setVisible(true);

        buttonUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {   
                new AddDataKurir();
            }
        });
    }
}