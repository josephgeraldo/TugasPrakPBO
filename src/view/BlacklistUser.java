/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.DatabaseHandler;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Cent
 */
public class BlacklistUser {
    JButton button1,button2;
    JLabel label;
    JTextField textField;
    JFrame frame;
    public BlacklistUser(){
        frame = new JFrame("Blacklist User");
        frame.setSize(320,200);
        frame.getContentPane().setBackground(Color.lightGray);
        label = new JLabel("Masukkan Username  :");
        label.setBounds(5,5,130,35);
        textField = new JTextField();
        textField.setBounds(137,5, 140, 35);
        button1 = new JButton("Blacklist");
        button1.setBounds(108,60,90,35);
        button2 = new JButton("Show List");
        button2.setBounds(108,100,90,20);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String blackList = "Blacklist";
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tokokue","root","");
                    String sql = "UPDATE user SET tipe = '%"+blackList+"%' where username = '%"+textField.getText()+"%'";
                    PreparedStatement stm = con.prepareStatement(sql);
                    stm.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Username Berhasil Di Blacklist");
                    con.close();
                }catch (SQLException se){
                    se.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AturPesanan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                DatabaseHandler conn = new DatabaseHandler();
                conn.connect();
                try{
                    java.sql.Statement stat = conn.con.createStatement();
                    ResultSet result = stat.executeQuery("select * from user");
                    while(result.next()){
                        label.setText(result.getString("username"));
                    }
                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        });
        
        JButton back = new JButton("<");
	back.setBounds(5,130,50,20);
	back.setCursor(new Cursor(Cursor.HAND_CURSOR));
	back.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent ae) {
			frame.setVisible(false);
			new MenuAdmin();
		}
	});
        
        frame.add(label);
        frame.add(back);
        frame.add(button1);
        frame.add(button2);
        frame.add(textField);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
