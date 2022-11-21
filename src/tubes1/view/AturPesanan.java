/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Cent
 */
public class AturPesanan {
    JLabel label1,label2,label3;
    JTextField textField1,textField2,textField3;
    JButton button;
    JFrame frame;
    public AturPesanan(){
        frame = new JFrame("Atur Pesanan");
        frame.setSize(320,270);
        frame.getContentPane().setBackground(Color.lightGray);
        label1 = new JLabel("Nama Customer      :");
        label1.setBounds(5,5,130,35);
        textField1 = new JTextField();
        textField1.setBounds(135,5, 140, 35);
        label2 = new JLabel("Alamat Customer    :");
        label2.setBounds(5,50,130,35);
        textField2 = new JTextField();
        textField2.setBounds(135,50, 140, 35);
        label3 = new JLabel("Harga Barang           :");
        label3.setBounds(5,100,130,35);
        textField3 = new JTextField();
        textField3.setBounds(135,100, 140, 35);
        button = new JButton("Submit");
        button.setBounds(115,170,80,35);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
