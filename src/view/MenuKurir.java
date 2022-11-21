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
 * @author user
 */

public class MenuKurir {
    public static void main(String[] args) {
        new MenuKurir();
    }
    
    public MenuKurir(){
        Font font1 = new Font("Serif", Font.BOLD, 15);
        
        JFrame frame = new JFrame("Menu Kurir");
        frame.setSize(620, 300);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel judul = new JLabel("Welcome Kurir");
        judul.setBounds(120, 10, 400, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 50));
        
        JButton terimaP = new JButton("Terima Pesanan");
        terimaP.setBounds(30, 130, 150, 50);
        terimaP.setFont(font1);
        terimaP.setCursor(new Cursor(Cursor.HAND_CURSOR));
        terimaP.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });
        
        JButton riwayatP = new JButton("History");
        riwayatP.setBounds(220, 130, 150, 50);
        riwayatP.setFont(font1);
        riwayatP.setCursor(new Cursor(Cursor.HAND_CURSOR));
        riwayatP.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });
        
        JButton konfirmasi = new JButton("Konfirmasi");
        konfirmasi.setBounds(410, 130, 150, 50);
        konfirmasi.setFont(font1);
        konfirmasi.setCursor(new Cursor(Cursor.HAND_CURSOR));
        konfirmasi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });
        
        frame.add(konfirmasi);
        frame.add(riwayatP);
        frame.add(terimaP);
        frame.add(judul);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
