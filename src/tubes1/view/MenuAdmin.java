/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes1.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author
 */

public class MenuAdmin {
    public static void main(String[] args) {
        new MenuAdmin();
    }
    
    public MenuAdmin(){
        Font font1 = new Font("Serif", Font.BOLD, 15);
        
        JFrame frame = new JFrame("Menu Admin");
        frame.setSize(620, 400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel judul = new JLabel("Welcome Admin");
        judul.setBounds(120, 10, 400, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 50));

        JButton updateBarang = new JButton("Update Barang");
        updateBarang.setBounds(110, 130, 150, 50);
        updateBarang.setFont(font1);
        updateBarang.setCursor(new Cursor(Cursor.HAND_CURSOR));
        updateBarang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });

        JButton blacklist = new JButton("Blacklist User");
        blacklist.setBounds(340, 130, 150, 50);
        blacklist.setFont(font1);
        blacklist.setCursor(new Cursor(Cursor.HAND_CURSOR));
        blacklist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });

        JButton totalP = new JButton("Total Penjualan");
        totalP.setBounds(110, 200, 150, 50);
        totalP.setFont(font1);
        totalP.setCursor(new Cursor(Cursor.HAND_CURSOR));
        totalP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });

        JButton pesanan = new JButton("Atur Pesanan");
        pesanan.setBounds(340, 200, 150, 50);
        pesanan.setFont(font1);
        pesanan.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pesanan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });

        JButton stock = new JButton("Update Stock");
        stock.setBounds(225, 270, 150, 50);
        stock.setFont(font1);
        stock.setCursor(new Cursor(Cursor.HAND_CURSOR));
        stock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new UpdateStock();
            }
        });

        frame.add(stock);
        frame.add(pesanan);
        frame.add(totalP);
        frame.add(blacklist);
        frame.add(updateBarang);
        frame.add(judul);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
