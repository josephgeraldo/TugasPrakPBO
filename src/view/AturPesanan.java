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
    JLabel label,label1,label2;
    JTextField textField,textField1,textField2;
    JButton button,button1;
    JFrame frame;
    public static void main(String[] args) {
        new AturPesanan();
    }
    public AturPesanan(){
        frame = new JFrame("Atur Pesanan");
        frame.setSize(320,270);
        frame.getContentPane().setBackground(Color.lightGray);
        label = new JLabel("Id Pesanan                  :");
        label.setBounds(5,5,130,35);
        textField = new JTextField();
        textField.setBounds(135,5, 140, 35);
        label1 = new JLabel("Status Bayar               :");
        label1.setBounds(5,50,130,35);
        textField1 = new JTextField(); 
        textField1.setBounds(135,50, 140, 35);
        label2 = new JLabel("Status Pengiriman    :");
        label2.setBounds(5,100,130,35);
        textField2 = new JTextField();
        textField2.setBounds(135,100, 140, 35);
        button = new JButton("Submit");
        button.setBounds(115,150,80,35);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1 = new JButton("<");
        button1.setBounds(4,215,45,15);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                if (textField.getText().isEmpty() || textField1.getText().isEmpty() || textField2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!");
                }else{
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tokokue","root","");
                        int id = Integer.parseInt(textField.getText());
                        Statement stm = con.createStatement();
                        String sql = "UPDATE pesanan SET status_pembayaran = '"+textField1.getText()+"', status_pengiriman = '"+textField2.getText()+"' where pesanan_id = '"+id+"'";
                        stm.executeUpdate(sql);
                        textField.setText("");
                        textField1.setText("");
                        textField2.setText("");
                        JOptionPane.showMessageDialog(null, "Data Pesanan Berhasil Di Atur");
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
        frame.add(textField);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(button);
        frame.add(button1);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
