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
                //
            }
        });
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                //
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
