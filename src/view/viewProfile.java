package view;

import controler.*;
import model.*;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class viewProfile {

    public viewProfile() {
        ProfileController controller = new ProfileController();
        user customer = (user) SingletonUser.getInstance().getUser();
        JFrame frame = new JFrame("Profile");
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1 = new Font("Serif", Font.PLAIN, 20);

        //label judul
        JLabel judul = new JLabel("Profile");
        judul.setBounds(235, 5, 500, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 35));

        //label nama
        JLabel namaLabel = new JLabel("Nama");
        namaLabel.setBounds(100, 100, 90, 40);
        namaLabel.setFont(font1);

        //textfield nama
        JTextField tfNama = new JTextField();
        tfNama.setText(customer.getNama_lengkap());
        tfNama.setEditable(false);
        tfNama.setBounds(240, 105, 240, 30);
        tfNama.setFont(font1);

        //label username
        JLabel userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(100, 140, 90, 40);
        userNameLabel.setFont(font1);

        //textfield username
        JTextField tfUserName = new JTextField();
        tfUserName.setText(customer.getUsername());
        tfUserName.setEditable(false);
        tfUserName.setBounds(240, 145, 240, 30);
        tfUserName.setFont(font1);

        //label password
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(100, 180, 90, 40);
        passLabel.setFont(font1);

        //password
        JPasswordField pass = new JPasswordField();
        pass.setText(customer.getPassword());
        pass.setEditable(false);
        pass.setBounds(240, 185, 240, 30);
        pass.setFont(font1);

        //label telepon
        JLabel teleponLabel = new JLabel("Telepon");
        teleponLabel.setBounds(100, 220, 90, 40);
        teleponLabel.setFont(font1);

        //textfield telepon
        JTextField tfTelepon = new JTextField();
        tfTelepon.setText(customer.getNo_telp());
        tfTelepon.setEditable(false);
        tfTelepon.setBounds(240, 225, 240, 30);
        tfTelepon.setFont(font1);

        //label alamat
        JLabel alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(100, 260, 90, 40);
        alamatLabel.setFont(font1);

        //textfield alamat
        JTextField alamat = new JTextField();
        alamat.setText(customer.getAlamat_lengkap());
        alamat.setEditable(false);
        alamat.setBounds(240, 265, 240, 30);
        alamat.setFont(font1);


        //label kota
        JLabel kotaLabel = new JLabel("Kota");
        kotaLabel.setBounds(100, 380, 90, 40);
        kotaLabel.setFont(font1);

        //textfield kota
        JTextField tfKota = new JTextField();
        tfKota.setText(customer.getKota());
        tfKota.setEditable(false);
        tfKota.setBounds(240, 385, 240, 30);
        tfKota.setFont(font1);

        //label provinsi
        JLabel provinsiLabel = new JLabel("Provinsi");
        provinsiLabel.setBounds(100, 420, 90, 40);
        provinsiLabel.setFont(font1);

        //textfield provinsi
        JTextField tfProvinsi = new JTextField();
        tfProvinsi.setText(customer.getProvinsi());
        tfProvinsi.setEditable(false);
        tfProvinsi.setBounds(240, 425, 240, 30);
        tfProvinsi.setFont(font1);

        //label kodePos
        JLabel kodePosLabel = new JLabel("Kode Pos");
        kodePosLabel.setBounds(100, 460, 90, 40);
        kodePosLabel.setFont(font1);

        //textfield kodePos
        JTextField tfKodePos = new JTextField();
        tfKodePos.setText(customer.getKode_post());
        tfKodePos.setEditable(false);
        tfKodePos.setBounds(240, 465, 240, 30);
        tfKodePos.setFont(font1);

        //button edit
        JButton submit = new JButton("Edit");
        submit.setBounds(300, 510, 180, 50);
        submit.setFont(font1);
        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //button update
        JButton update = new JButton("Update");
        update.setBounds(300, 510, 180, 50);
        update.setFont(font1);
        update.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        
        //button back
        JButton backProfile = new JButton("Kembali");
        backProfile.setBounds(100, 510, 180, 50);
        backProfile.setFont(font1);
        backProfile.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton backUpdate = new JButton("Kembali");
        backUpdate.setBounds(100, 510, 180, 50);
        backUpdate.setFont(font1);
        backUpdate.setCursor(new Cursor(Cursor.HAND_CURSOR));

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tfNama.setEditable(true);
                tfUserName.setEditable(true);
                pass.setEditable(true);
                tfTelepon.setEditable(true);
                alamat.setEditable(true);
                tfKota.setEditable(true);
                tfProvinsi.setEditable(true);
                tfKodePos.setEditable(true);
                submit.setVisible(false);
                backProfile.setVisible(false);
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, controller.update(
                        tfNama.getText(),
                        tfUserName.getText(),
                        pass.getText(),
                        tfTelepon.getText(),
                        alamat.getText(),
                        tfKota.getText(),
                        tfProvinsi.getText(),
                        tfKodePos.getText()));
                frame.dispose();
                new viewProfile();
            }

        });
        backUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new viewProfile();
            }
        });
        backProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MenuClient();
            }
        });
        //button show pass
        JCheckBox show = new JCheckBox("Show");
        show.setBounds(490, 184, 60, 30);
        show.setCursor(new Cursor(Cursor.HAND_CURSOR));
        show.setFont(new Font("Serif", Font.PLAIN, 15));
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (show.isSelected()) {
                    pass.setEchoChar((char) 0);
                } else {
                    pass.setEchoChar('\u2022');
                }
            }
        });
        
        

        frame.add(judul);
        frame.add(namaLabel);
        frame.add(tfNama);
        frame.add(userNameLabel);
        frame.add(tfUserName);
        frame.add(passLabel);
        frame.add(pass);
        frame.add(teleponLabel);
        frame.add(tfTelepon);
        frame.add(alamatLabel);
        frame.add(alamat);
        frame.add(kotaLabel);
        frame.add(tfKota);
        frame.add(provinsiLabel);
        frame.add(tfProvinsi);
        frame.add(kodePosLabel);
        frame.add(tfKodePos);
        frame.add(submit);
        frame.add(backProfile);
        frame.add(show);
        frame.add(update);
        frame.add(backUpdate);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
