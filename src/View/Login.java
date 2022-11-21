/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
public class Login {
    public Login(){
        Font font1 = new Font("Serif", Font.BOLD, 20);
        
        JFrame frame = new JFrame("Main Login");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel judul = new JLabel("Main Login");
        judul.setBounds(175, 10, 400, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 45));
        
        JButton admin = new JButton("Admin");
        admin.setBounds(210, 130, 150, 50);
        admin.setFont(font1);
        admin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        admin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MenuAdmin();
            }
        });
        
        JButton client = new JButton("Client");
        client.setBounds(210, 200, 150, 50);
        client.setFont(font1);
        client.setCursor(new Cursor(Cursor.HAND_CURSOR));
        client.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MenuClient();
            }
        });
        
        JButton kurir = new JButton("Kurir");
        kurir.setBounds(210, 270, 150, 50);
        kurir.setFont(font1);
        kurir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        kurir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MenuKurir();
            }
        });
        
        frame.add(kurir);
        frame.add(client);
        frame.add(admin);
        frame.add(judul);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
