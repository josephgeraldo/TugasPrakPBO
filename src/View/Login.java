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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author user
 */
public class Login implements ActionListener{
    JFrame frame = new JFrame("Main Login");
    public Login(){
        Font font1 = new Font("Serif", Font.BOLD, 20);
        
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
        admin.addActionListener(this);
        admin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        JButton client = new JButton("Client");
        client.setBounds(210, 200, 150, 50);
        client.setFont(font1);
        client.addActionListener(this);
        client.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        JButton kurir = new JButton("Kurir");
        kurir.setBounds(210, 270, 150, 50);
        kurir.setFont(font1);
        kurir.addActionListener(this);
        kurir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        frame.add(kurir);
        frame.add(client);
        frame.add(admin);
        frame.add(judul);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch(command) {
            case "Admin": 
                frame.dispose();
                new LoginUser("admin");
                break;
            case "Client":
                frame.dispose();
                new LoginUser("client");
                break;
            case "Kurir":
                frame.dispose();
                new LoginUser("kurir");
                break;
            default: 
                break;
        }
    }
}
