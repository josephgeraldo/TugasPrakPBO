/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.ControllerKurir;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Joseph
 */

public class AddDataKurir {
    public AddDataKurir() {

        JFrame frame = new JFrame("Menu Kurir");
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null);
        Font myFont = new Font("Serif", Font.BOLD, 18);

        JLabel label = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();
        JLabel label7 = new JLabel();
        JLabel label8 = new JLabel();

        label8.setText("FORM KURIR");
        label8.setBounds(10, 30, 300, 30);
        Font myFont5 = new Font("Arial Black", Font.BOLD, 28);
        label8.setFont(myFont5);
        label8.setForeground(Color.BLUE);
        label8.setOpaque(true);

        label3.setText("Username");
        label3.setBounds(10, 200, 100, 30);
        label3.setFont(myFont);

        label6.setText("Kapasitas Berat Barang");
        label6.setBounds(10, 350, 200, 30);
        label6.setFont(myFont);

        label7.setText("Total Berat Barang");
        label7.setBounds(10, 400, 200, 30);
        label7.setFont(myFont);

        JTextField username = new JTextField();
        JTextField kapasitasBarang = new JTextField();
        JTextField totalKapasitas = new JTextField();

        username.setBounds(210, 200, 200, 30);

        kapasitasBarang.setBounds(210, 350, 100, 30);

        totalKapasitas.setBounds(210, 400, 100, 30);

        JButton buttonSave = new JButton("SAVE");
        buttonSave.setBounds(10, 460, 100, 40);
        JButton buttonRefresh = new JButton("REFRESH");
        buttonRefresh.setBounds(250, 460, 100, 40);

        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(username);
        frame.add(kapasitasBarang);
        frame.add(totalKapasitas);
        frame.add(buttonRefresh);
        frame.add(buttonSave);
        frame.setLayout(null);
        frame.setVisible(true);

        buttonSave.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae
            ) {
                if (username.getText().isEmpty() || kapasitasBarang.getText().isEmpty() || totalKapasitas.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Semua kolom wajib diisi!");
                } else {
                    ControllerKurir.addKurir(username.getText(), kapasitasBarang.getText(), totalKapasitas.getText());
                }

            }
        });

        buttonRefresh.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae
            ) {
                username.setText("");
                kapasitasBarang.setText("");
                totalKapasitas.setText("");
            }
        });
    }
}
