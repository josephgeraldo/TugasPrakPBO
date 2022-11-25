package view;

import controler.*;
import model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.*;

public class KeranjangScreen {

    PanelKeranjang[] keranjang;
    ArrayList<produk> listProduk = new ArrayList<>();
    ArrayList<Integer> listJumlah = new ArrayList<>();

    public void getChosen() {
        for (int i = 0; i < SingletonKeranjang.getInstance().getLength(); i++) {
            if (keranjang[i].chosen) {
                listProduk.add(keranjang[i].Produk);
                listJumlah.add(keranjang[i].jumlah);
            }
        }
    }

    public boolean update(ArrayList<produk> listProduk, ArrayList<Integer> listJumlah) {
        KeranjangController c = new KeranjangController();
        return c.updateDatabase(listProduk,  listJumlah);
    }


    public KeranjangScreen() {
        //font
        Font fontButton = new Font("Serif", Font.PLAIN, 14);

        //frame
        JFrame frame = new JFrame("Keranjang");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        //Button back
        JButton back = new JButton("back");
        back.setBounds(0, 0, 100, 50);
        back.setFont(fontButton);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Order();
            }
        });

        //Button delete
        JButton delete = new JButton("Delete");
        delete.setBounds(380, 0, 100, 50);
        delete.setFont(fontButton);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getChosen();
                if (listProduk.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Belum ada barang yang dipilih");
                } else {
                    if (update(listProduk,  listJumlah)) {
                        frame.dispose();
                        new KeranjangScreen();
                    }
                }
            }
        });

        //Button bayar
        JButton bayar = new JButton("bayar");
        bayar.setBounds(490, 0, 100, 50);
        bayar.setFont(fontButton);
        bayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getChosen();
                if (listProduk.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Belum ada barang yang dipilih");
                } else {
                    frame.dispose();
                    new BayarScreen(listProduk,  listJumlah);
                }
            }
        });

        //Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBounds(5, 55, 575, 600);

        //panel list
        JPanel panelList = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1;
        gbc.weighty = 1;
        panelList.add(new JPanel(), gbc);
        mainPanel.add(new JScrollPane(panelList));
        int jumlahBarang = SingletonKeranjang.getInstance().getLength();
        keranjang = new PanelKeranjang[jumlahBarang];
        for (int i = 0; i < jumlahBarang; i++) {
            keranjang[i] = new PanelKeranjang(i);
            gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.weightx = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            panelList.add(keranjang[i], gbc, 0);
        }
        frame.add(back);
        frame.add(delete);
        frame.add(bayar);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
