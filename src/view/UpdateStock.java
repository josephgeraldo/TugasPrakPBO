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
import tubes1.controler.*;

/**
 *
 * @author user
 */

public class UpdateStock {
    JFrame frame = new JFrame("Update Stock");
    public UpdateStock(){
        frame.setSize(600, 380);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1 = new Font("Serif", Font.PLAIN, 15);
        
        JLabel judul = new JLabel("Update Stock");
        judul.setBounds(200, 5, 500, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 35));
        
        JLabel barangLabel = new JLabel("Jenis Kue");
        barangLabel.setBounds(80, 90, 90, 40);
        barangLabel.setFont(font1);
        
        String kategori[] = {"Kue Ultah", "Kue Lemper", "Kue Mayo"};
        JComboBox cbKategori = new JComboBox(kategori);
        cbKategori.setBounds(200, 100, 310, 30);
        cbKategori.setFont(font1);
        
        JLabel stockLabel = new JLabel("Tambah Stock");
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
                frame.dispose();
                
            } 
        });
        
        JButton back = new JButton("Back");
        back.setBounds(30, 290, 80, 30);
        back.setFont(font1);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MenuAdmin();
            } 
        });
        
        frame.add(update);
        frame.add(back);
        frame.add(barangLabel);
        frame.add(stock);
        frame.add(stockLabel);
        frame.add(cbKategori);
        frame.add(judul);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
