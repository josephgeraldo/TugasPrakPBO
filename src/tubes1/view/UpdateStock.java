/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes1.view;

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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import tubes1.controler.*;

/**
 *
 * @author user
 */

public class UpdateStock {
    JFrame frame = new JFrame("Update Stock");
    public UpdateStock(){
        frame.setSize(600, 380);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1 = new Font("Serif", Font.PLAIN, 20);
        
        JLabel judul = new JLabel("Update Stock");
        judul.setBounds(240, 5, 500, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 35));
        
        JLabel barangLabel = new JLabel("Barang");
        barangLabel.setBounds(100, 100, 90, 40);
        barangLabel.setFont(font1);
        
        frame.add(judul);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
