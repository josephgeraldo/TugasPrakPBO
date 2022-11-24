/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import controler.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */

public class UpdateStock {
    JFrame frame = new JFrame("Update Stock");
    public static void main(String[] args) {
        new UpdateStock();
    }
    public UpdateStock(){
        frame.setSize(600, 380);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1 = new Font("Serif", Font.PLAIN, 15);
        
        JLabel judul = new JLabel("Update Stock");
        judul.setBounds(200, 5, 500, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 35));
        
        JLabel barangLabel = new JLabel("Nama Kue");
        barangLabel.setBounds(80, 90, 90, 40);
        barangLabel.setFont(font1);
        
        JTextField namaBarang = new JTextField();
        namaBarang.setBounds(200, 100, 310, 30);
        namaBarang.setFont(font1);
        
        JLabel stockLabel = new JLabel("Ubah Stock");
        stockLabel.setBounds(80, 180, 90, 40);
        stockLabel.setFont(font1);
        
        JTextField stock = new JTextField();
        stock.setBounds(200, 190, 240, 30);
        stock.setFont(font1);
        
        JButton update = new JButton("Update");
        update.setBounds(200, 250, 180, 50);
        update.setFont(font1);
        update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tokokue","root","");
                    int ubhStock = Integer.parseInt(stock.getText());
                    Statement stm = con.createStatement();
                    String sql = "UPDATE barang SET stock = '"+ubhStock+"' where nama_kue = '"+namaBarang.getText()+"'";
                    stm.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Stock Berhasil Di Update");
                    con.close();
                }catch (SQLException se){
                    se.printStackTrace();
                }catch (ClassNotFoundException ex) {
                    Logger.getLogger(AturPesanan.class.getName()).log(Level.SEVERE, null, ex);
                } 
            } 
        });
        
        JButton back = new JButton("Back");
        back.setBounds(30, 290, 80, 30);
        back.setFont(font1);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                new MenuAdmin();
            } 
        });
        
        frame.add(update);
        frame.add(back);
        frame.add(barangLabel);
        frame.add(stock);
        frame.add(stockLabel);
        frame.add(namaBarang);
        frame.add(judul);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
