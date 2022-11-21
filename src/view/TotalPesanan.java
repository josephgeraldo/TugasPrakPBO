/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        button.setBounds(20,90,90,35);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                if(rButton1.isSelected()){
                    //print total perhari
                }
                else{
                    //print data perminggu
                }
            }
        });
        
        frame.add(rButton1);
        frame.add(rButton2);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
