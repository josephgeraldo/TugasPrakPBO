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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cent
 */
public class BlacklistUser {
    JButton button1,button2;
    JLabel label;
    JTextField textField;
    JFrame frame,frame1;
    JTable table;
    String from;
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
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tokokue","root","");
                    String blackList = "blacklist";
                    String sql = "UPDATE user SET tipe = '"+blackList+"' where username = '"+textField.getText()+"'";
                    Statement stm = con.createStatement();
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
                String columnNames[] = {"id_user","username","password","no_telepon","nama_lengkap","alamat_lengkap","kota","provinsi","kode_post","tipe"};
                frame1 = new JFrame("List User");
                frame1.setSize(1000,400);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(columnNames);
                table = new JTable();
                table.setModel(model);
                table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                table.setFillsViewportHeight(true);
                JScrollPane scroll = new JScrollPane(table);
                scroll.setHorizontalScrollBarPolicy(
                        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                scroll.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                String idUser,uname,pass,noTelp,namaLengkap,alamat,kota,prov,kodePos,tipeAcc;
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tokokue","root","");
                    String sql = "SELECT * from user";
                    PreparedStatement stm = con.prepareStatement(sql);
                    ResultSet rs = stm.executeQuery();
                    int i = 0;
                    while(rs.next()){
                        idUser = rs.getString("id_user");
                        uname = rs.getString("username");
                        pass = rs.getString("password");
                        noTelp = rs.getString("no_telepon");
                        namaLengkap = rs.getString("nama_lengkap");
                        alamat = rs.getString("alamat_lengkap");
                        kota = rs.getString("kota");
                        prov = rs.getString("provinsi");
                        kodePos = rs.getString("kode_post");
                        tipeAcc = rs.getString("tipe");
                        model.addRow(new Object[]{idUser,uname,pass,noTelp,namaLengkap,alamat,kota,prov,kodePos,tipeAcc});
                        i++;
                    }
                    if (i < 1) {
                        JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                frame1.add(scroll);
                frame1.setLayout(null);
                frame1.setVisible(true);
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
