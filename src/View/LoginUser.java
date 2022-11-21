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

public class LoginUser {
    public LoginUser(String tipeUser){
        Font font1 = new Font("Serif", Font.BOLD, 18);
        
        JFrame frame = new JFrame("Login User");
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel judul = new JLabel("Login User");
        judul.setBounds(175, 10, 400, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 45));
        
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(50, 75, 90, 40);
        userLabel.setFont(font1);

        JTextField username = new JTextField();
        username.setBounds(150, 80, 310, 30);
        username.setFont(font1);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(50, 115, 90, 40);
        passLabel.setFont(font1);

        JTextField password = new JTextField();
        password.setBounds(150, 120, 310, 30);
        password.setFont(font1);
        
        JButton login = new JButton("Login");
        login.setBounds(210, 180, 150, 50);
        login.setFont(font1);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });
        
        frame.add(login);
        frame.add(judul);
        frame.add(userLabel);
        frame.add(username);
        frame.add(passLabel);
        frame.add(password);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
