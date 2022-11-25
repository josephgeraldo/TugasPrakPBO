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
import java.sql.ResultSetMetaData;
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
    JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
    JTextField textField;
    JFrame frame,frame1;
    JTable table;
    String from;
    JScrollPane sp;
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
        button2 = new JButton("Show User");
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
                    String sql = "UPDATE user SET tipe = '"+blackList+"' where username = '"+textField.getText()+"'";
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
                try{
                    frame1 = new JFrame("USER "+textField.getText());
                    frame1.setSize(400,470);
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tokokue","root","");
                    String sql = "SELECT * from user where username = '"+textField.getText()+"'";
                    Statement stm = con.createStatement();
                    ResultSet rs = stm.executeQuery(sql);
                    int i = 0;
                    int id = 0;
                    String uname;
                    String pass;
                    String telepon;
                    String name;
                    String address;
                    String city;
                    String prov;
                    String pos;
                    String type;
                    if(rs.next()){
                        i+=1;
                        if(i == 1){
                            JOptionPane.showMessageDialog(null, "USER KETEMU!!!");
                        }
                        id = rs.getInt("id_user");
                        uname = rs.getString("username");
                        pass = rs.getString("password");
                        telepon = rs.getString("no_telepon");
                        name = rs.getString("nama_lengkap");
                        address = rs.getString("alamat_lengkap");
                        city = rs.getString("kota");
                        prov = rs.getString("provinsi");
                        pos = rs.getString("kode_post");
                        type = rs.getString("tipe");  
                        
                        label1 = new JLabel("ID                    = "+id);
                        label1.setBounds(50,25,250,35);
                        label2 = new JLabel("Username    = "+uname);
                        label2.setBounds(50,60,250,35);
                        label3 = new JLabel("Password    = "+pass);
                        label3.setBounds(50,95,250,35);
                        label4 = new JLabel("No Telp        = "+telepon);
                        label4.setBounds(50,130,250,35);
                        label5 = new JLabel("Nama           = "+name);
                        label5.setBounds(50,165,250,35);
                        label6 = new JLabel("Alamat         = "+address);
                        label6.setBounds(50,200,250,35);
                        label7 = new JLabel("Kota              = "+city);
                        label7.setBounds(50,235,250,35);
                        label8 = new JLabel("Provinsi       = "+prov);
                        label8.setBounds(50,270,250,35);
                        label9 = new JLabel("Kode Pos      = "+pos);
                        label9.setBounds(50,305,250,35);
                        label10 = new JLabel("Tipe Acc       = "+type);
                        label10.setBounds(50,340,250,35);
                        
                        frame1.add(label1);
                        frame1.add(label2);
                        frame1.add(label3);
                        frame1.add(label4);
                        frame1.add(label5);
                        frame1.add(label6);
                        frame1.add(label7);
                        frame1.add(label8);
                        frame1.add(label9);
                        frame1.add(label10);
                        frame1.setLayout(null);
                        frame1.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "USER TIDAK ADA!!!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        JButton back = new JButton("<");
	back.setBounds(5,130,50,20);
	back.setCursor(new Cursor(Cursor.HAND_CURSOR));
	back.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent ae) {
			frame.dispose();
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
