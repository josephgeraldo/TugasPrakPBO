/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.DatabaseHandler;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cent
 */
public class AturPesanan {
    JLabel label,label1,label2,label3;
    JTextField textField,textField1,textField2,textField3;
    JButton button;
    JFrame frame;
    public AturPesanan(){
        frame = new JFrame("Atur Pesanan");
        frame.setSize(320,270);
        frame.getContentPane().setBackground(Color.lightGray);
        label = new JLabel("Id Pesanan      :");
        label.setBounds(5,5,130,35);
        textField = new JTextField();
        textField.setBounds(135,5, 140, 35);
        label1 = new JLabel("Nama Customer      :");
        label1.setBounds(5,50,130,35);
        textField1 = new JTextField();
        textField1.setBounds(135,50, 140, 35);
        label2 = new JLabel("Alamat Customer    :");
        label2.setBounds(5,100,130,35);
        textField2 = new JTextField();
        textField2.setBounds(135,100, 140, 35);
        label3 = new JLabel("Harga Barang           :");
        label3.setBounds(5,150,130,35);
        textField3 = new JTextField();
        textField3.setBounds(135,150, 140, 35);
        button = new JButton("Submit");
        button.setBounds(115,190,80,35);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                if (textField.getText().isEmpty() || textField1.getText().isEmpty() || textField2.getText().isEmpty() || textField3.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!");
                }else{
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tokokue","root","");
                        Statement stm = con.createStatement();
                        int cv = Integer.parseInt(textField3.getText());
                        int id = Integer.parseInt(textField.getText());
                        String sql = "INSERT INTO pesanan VALUES("+id+",'"+textField1.getText()+"','"+textField2.getText()+"','"+cv+"')";
                        stm.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Data Pesanan Berhasil Di Input");
                        con.close();
                    }catch (SQLException se){
                        se.printStackTrace();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(AturPesanan.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
        });
        
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(textField);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
