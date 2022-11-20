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
 * @author
 */

public class MenuAdmin {
    public static void main(String[] args) {
        new MenuAdmin();
    }
    
    public MenuAdmin(){
        Font font1 = new Font("Serif", Font.BOLD, 20);
        
        JFrame frame = new JFrame("Menu Admin");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel judul = new JLabel("Welcome Admin");
        judul.setBounds(175, 10, 400, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 45));
        
        frame.add(judul);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
