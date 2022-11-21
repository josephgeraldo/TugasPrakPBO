/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */

public class TerimaPesanan {
    public TerimaPesanan(){
        Font font1 = new Font("Serif", Font.BOLD, 15);
        
        JFrame frame = new JFrame("Terima Pesanan Kue");
        frame.setSize(620, 300);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel judul = new JLabel("Pesanan Kue");
        judul.setBounds(150, 10, 300, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 50));
        
        JLabel pesananLabel = new JLabel("Pesanan Kue");
        pesananLabel.setBounds(80, 80, 200, 100);
        pesananLabel.setFont(font1);
        
        
        
        frame.add(pesananLabel);
        frame.add(judul);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
