package tubes1.view;

import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register {
    public Register() {
        JFrame frm = new JFrame("Registrasi Client");
        frm.setSize(500, 400);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font_1 = new Font("Serif", Font.PLAIN, 15);

        JLabel judul = new JLabel("Registrasi Client");
        judul.setBounds(200, 10, 300, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 20));

        JLabel labelUsername = new JLabel("Username");
        labelUsername.setBounds(100, 100, 90, 50);
        labelUsername.setFont(font_1);

        JTextField fieldUsername = new JTextField();
        fieldUsername.setBounds(240, 145, 240, 30);
        fieldUsername.setFont(font_1);

        JLabel labelPass = new JLabel("Password");
        labelPass.setBounds(100, 180, 90, 40);
        labelPass.setFont(font_1);

        JPasswordField fieldPass = new JPasswordField();
        fieldPass.setBounds(240, 185, 240, 30);
        fieldPass.setFont(font_1);
                
        JLabel labelNoTelp = new JLabel("Telepon");
        labelNoTelp.setBounds(100, 220, 90, 40);
        labelNoTelp.setFont(font_1);

        JTextField fieldTelepon = new JTextField();
        fieldTelepon.setBounds(240, 225, 240, 30);
        fieldTelepon.setFont(font_1);

        JLabel labelNamaLengkap = new JLabel("Nama Lengkap: ");
        labelNamaLengkap.setBounds(100, 100, 90, 40);
        labelNamaLengkap.setFont(font_1);

        JTextField fieldNamaLengkap = new JTextField();
        fieldNamaLengkap.setBounds(240, 105, 240, 30);
        fieldNamaLengkap.setFont(font_1);
        
        JLabel labelAlamatLengkap = new JLabel("Alamat Lengkap: ");
        labelNamaLengkap.setBounds(100, 100, 90, 40);
        labelNamaLengkap.setFont(font_1);

        JTextField fieldAlamatLengkap = new JTextField();
        fieldAlamatLengkap.setBounds(240, 105, 240, 30);
        fieldAlamatLengkap.setFont(font_1);
        
        JLabel labelKota = new JLabel("Kota");
        labelKota.setBounds(100, 380, 90, 40);
        labelKota.setFont(font_1);

        JTextField fieldKota = new JTextField();
        fieldKota.setBounds(240, 385, 240, 30);
        fieldKota.setFont(font_1);       

        JLabel labelProvinsi = new JLabel("Provinsi");
        labelProvinsi.setBounds(100, 420, 90, 40);
        labelProvinsi.setFont(font_1);

        JTextField fieldProvinsi = new JTextField();
        fieldProvinsi.setBounds(240, 425, 240, 30);
        fieldProvinsi.setFont(font_1);
        
        JLabel labelKodePost = new JLabel("Kode Pos");
        labelKodePost.setBounds(100, 460, 90, 40);
        labelKodePost.setFont(font_1);

        JTextField fieldKodePost = new JTextField();
        fieldKodePost.setBounds(240, 465, 240, 30);
        fieldKodePost.setFont(font_1);

        JButton submit = new JButton("Submit");
        submit.setBounds(300, 510, 180, 50);
        submit.setFont(font_1);
        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        JButton back = new JButton("Back");
        back.setBounds(100, 510, 180, 50);
        back.setFont(font_1);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        frm.add(judul);
        frm.add(labelUsername);
        frm.add(fieldUsername);
        frm.add(labelPass);
        frm.add(fieldPass);        
        frm.add(labelNoTelp);
        frm.add(fieldTelepon);
        frm.add(labelNamaLengkap);
        frm.add(fieldNamaLengkap);
        frm.add(labelAlamatLengkap);
        frm.add(fieldAlamatLengkap);
        frm.add(labelKota);
        frm.add(fieldKota);
        frm.add(labelProvinsi);
        frm.add(fieldProvinsi);
        frm.add(labelKodePost);
        frm.add(fieldKodePost);
        frm.add(submit);
        frm.add(back);
        frm.setLayout(null);
        frm.setVisible(true);
    }
}
