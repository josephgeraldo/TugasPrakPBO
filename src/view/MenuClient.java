/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

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
import model.Etalase;


/**
 *
 * @author user
 */
public class MenuClient {
    public static void main(String[] args) {
        new MenuClient();
    }
    
    public MenuClient(){
        Font font1 = new Font("Serif", Font.BOLD, 15);
        
        JFrame frame = new JFrame("Menu Client");
        frame.setSize(620, 450);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel judul = new JLabel("Welcome Client");
        judul.setBounds(120, 10, 400, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 50));
        
        JButton order = new JButton("Order");
        order.setBounds(110, 130, 150, 50);
        order.setFont(font1);
        order.setCursor(new Cursor(Cursor.HAND_CURSOR));
        order.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new Order();
            }
        });
        
        JButton payment = new JButton("Payment");
        payment.setBounds(340, 130, 150, 50);
        payment.setFont(font1);
        payment.setCursor(new Cursor(Cursor.HAND_CURSOR));
        payment.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                
            }
        });
        
        JButton updateA = new JButton("Update Akun");
        updateA.setBounds(110, 200, 150, 50);
        updateA.setFont(font1);
        updateA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        updateA.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });
        
        JButton statusP = new JButton("Status Pembelian");
        statusP.setBounds(340, 200, 150, 50);
        statusP.setFont(font1);
        statusP.setCursor(new Cursor(Cursor.HAND_CURSOR));
        statusP.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });
        
        JButton history = new JButton("History");
        history.setBounds(110, 270, 150, 50);
        history.setFont(font1);
        history.setCursor(new Cursor(Cursor.HAND_CURSOR));
        history.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });
        
        JButton keranjang = new JButton("Keranjang");
        keranjang.setBounds(340, 270, 150, 50);
        keranjang.setFont(font1);
        keranjang.setCursor(new Cursor(Cursor.HAND_CURSOR));
        keranjang.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                //
            }
        });
        
        frame.add(keranjang);
        frame.add(history);
        frame.add(statusP);
        frame.add(updateA);
        frame.add(payment);
        frame.add(order);
        frame.add(judul);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
