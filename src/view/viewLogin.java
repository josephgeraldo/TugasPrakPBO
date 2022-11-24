/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import controler.Login;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author user
 */
public class viewLogin {
    JFrame frame = new JFrame("Login");

    public viewLogin(String tipeUser) {
        Login controller = new Login();
        frame.setSize(600, 380);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1 = new Font("Serif", Font.PLAIN, 20);

//        BufferedImage foto = null;
//        try {
//            foto = ImageIO.read(new File("F:\\ITHB\\Semester 3\\PrakPBO\\Tubes\\TugasPrakPBO2\\img\\cake.png"));
//        } catch (IOException ex) {
//            Logger.getLogger(viewLogin.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Image fixedFoto = foto.getScaledInstance(60, 60, Image.SCALE_DEFAULT);
//        JLabel picFoto = new JLabel(new ImageIcon(fixedFoto));
//        picFoto.setBounds(70,1,100,60);
        

        //label judul
        JLabel judul = new JLabel("Login");
        judul.setBounds(240, 5, 500, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 35));

        //label username
        JLabel userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(100, 100, 90, 40);
        userNameLabel.setFont(font1);
        
        //textfield username
        JTextField tfUserName = new JTextField();
        tfUserName.setBounds(240, 105, 240, 30);
        tfUserName.setFont(font1);

        //label password
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(100, 140, 90, 40);
        passLabel.setFont(font1);

        //pass
        JPasswordField pass = new JPasswordField();
        pass.setBounds(240, 145, 240, 30);
        pass.setFont(font1);

        JButton submit = new JButton("Login");
        submit.setBounds(300, 200, 180, 50);
        submit.setFont(font1);
        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        submit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String result = null;
                result = controller.LoginController(tipeUser,tfUserName.getText(),pass.getText());
                if(result.equals("Login Berhasil!")){
                    frame.dispose();
                    JOptionPane.showMessageDialog(null,result);
                    if (tipeUser.equals("client")) {
                        new MenuClient();                        
                    } else if(tipeUser.equals("admin")) {
                        new MenuAdmin();
                    } else if(tipeUser.equals("kurir")) {
                        new MenuKurir();
                    }
                }else if(result.equals("Password Salah!")){
                    JOptionPane.showMessageDialog(null,result);
                    pass.setText("");
                    pass.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null,result);
                    tfUserName.setText("");
                    pass.setText("");
                    tfUserName.requestFocus();
                }
            }  
        });

        JButton back = new JButton("Kembali");
        back.setBounds(100, 200, 180, 50);
        back.setFont(font1);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new ChooseLogin();
            } 
        });
        
//        frame.add(picFoto);
        frame.add(judul);
        frame.add(userNameLabel);
        frame.add(tfUserName);
        frame.add(passLabel);
        frame.add(pass);
        frame.add(back);
        frame.add(submit);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
