/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Cent
 */
public class UpdateBarang {
    JFrame frame;
    JTextField textField1,textField2,textField3,textField4,textField5;
    JLabel label1,label2,label3,label4,label5;
    JButton button;
    public UpdateBarang(){
        frame = new JFrame("Update Barang");
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setSize(525, 450);
        label1 = new JLabel("Id_Produk            :");
        label2 = new JLabel("Nama Produk      :");
        label3 = new JLabel("Berat                     :");
        label4 = new JLabel("Harga                    :");
        label5 = new JLabel("Stock                    :");
        
        JLabel judul = new JLabel("Update Barang");
        judul.setBounds(130, 5, 500, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 35));
        
        label1.setBounds(100, 70, 120, 25);
        label2.setBounds(100, 110, 120, 25);
        label3.setBounds(100, 150, 120, 25);
        label4.setBounds(100, 190, 120, 25);
        label5.setBounds(100, 230, 120, 25);
        
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        
        textField1.setBounds(200, 70, 200, 25);
        textField2.setBounds(200, 110, 200, 25);
        textField3.setBounds(200, 150, 200, 25);
        textField4.setBounds(200, 190, 200, 25);
        textField5.setBounds(200, 230, 200, 25);
        
        button = new JButton("Submit");
        button.setBounds(300, 270, 100, 50);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tokokue","root","");
                    int id = Integer.parseInt(textField1.getText());
                    int harga = Integer.parseInt(textField4.getText());
                    int stock = Integer.parseInt(textField5.getText());
                    int berat = Integer.parseInt(textField3.getText());
                    Statement stm = con.createStatement();
                    String sql = "INSERT INTO produk VALUES("+id+",'"+textField2.getText()+"',"+berat+",'"+harga+"',"+stock+")";
                    stm.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data Barang Berhasil Di Tambahkan");
                    con.close();
                }catch (SQLException se){
                    se.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AturPesanan.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        });
        
        JButton back = new JButton("Kembali");
        back.setBounds(100, 270, 100, 50);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                new MenuAdmin();
                frame.setVisible(false);
            } 
        });
        
        frame.add(back);
        frame.add(button);
        frame.add(judul);
        frame.add(label1);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(textField4);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(textField5);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
