/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
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
public class TotalPesanan {
    JButton button;
    JRadioButton rButton1, rButton2;
    JFrame frame;
    public TotalPesanan(){
        frame = new JFrame("Total Pesanan");
        frame.setSize(250,170);
        frame.getContentPane().setBackground(Color.lightGray);
        rButton1 = new JRadioButton();
        rButton2 = new JRadioButton();
        
        rButton1.setText("Perhari");
        rButton2.setText("Perminggu");
        
        rButton1.setBounds(20,20,90,30);
        rButton2.setBounds(20,50,90,30);
        rButton1.setBackground(Color.lightGray);
        rButton2.setBackground(Color.lightGray);
        button = new JButton("Submit");
        button.setBounds(100,90,90,35);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                if(rButton1.isSelected()){
                    try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tokokue","root","");
                        Statement stm = con.createStatement();
                        String sql = "SELECT COUNT(pesanan_id) AS total from pesanan";
                        ResultSet rs = stm.executeQuery("SELECT count(pesanan_id) as totalCount from pesanan where currTime = curdate()");
                        int id = 0;
                        if(rs.next()){
                            id = rs.getInt("totalCount");
                        }
                        JOptionPane.showMessageDialog(null, "Total : "+id);
                        con.close();
                    }catch (SQLException se){
                        se.printStackTrace();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(AturPesanan.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }else if(rButton2.isSelected()){
                    try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tokokue","root","");
                        Statement stm = con.createStatement();
                        ResultSet rs = stm.executeQuery("SELECT count(pesanan_id) as totalCount from pesanan where currTime >= curdate() - INTERVAL 7 DAY");
                        int id = 0;
                        if(rs.next()){
                            id = rs.getInt("totalCount");
                        }
                        JOptionPane.showMessageDialog(null, "Total : "+id);
                        con.close();
                    }catch (SQLException se){
                        se.printStackTrace();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(AturPesanan.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "SILAHKAN PILIH SALAH SATU");
                }
            }
        });
        
        JButton back = new JButton("<");
	back.setBounds(20,90,50,35);
	back.setCursor(new Cursor(Cursor.HAND_CURSOR));
	back.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent ae) {
			frame.dispose();
			new MenuAdmin();
		}
	});
        
        frame.add(back);
        frame.add(rButton1);
        frame.add(rButton2);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
