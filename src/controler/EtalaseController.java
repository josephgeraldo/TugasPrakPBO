package controler;

import model.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import view.*;

public class EtalaseController {

    JPanel panelListBarang;
    JFrame frame;
    int iterasi = 0;
    JPanel panel;
    JSpinner[] jumlah = new JSpinner[4];
    int stock;
    int[] tempIndex = new int[4];

    public void refreshFrame() {
        frame.invalidate();
        frame.validate();
        frame.repaint();
    }

    public JPanel getPanel(int iterasi) {
        //panel utama
        EtalasePanelBarangController[] controller = new EtalasePanelBarangController[4];
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(600, 600));
        panel.setLayout(new GridLayout(2, 2));
        for (int i = 0; i < 4; i++) {
            controller[i] = new EtalasePanelBarangController();
            JPanel temp = controller[i].getPanelBarang(iterasi + i);
            panel.add(temp);
        }
        return panel;
    }

    public JFrame getFrame() {
        EtalasePanelBarangController controller = new EtalasePanelBarangController();
        controller.getProduk();
        Font fontButton = new Font("Serif", Font.PLAIN, 10);
        frame = new JFrame("Etalase");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null);

        //panel judul
        JPanel panelJudul = new JPanel();
        panelJudul.setPreferredSize(new Dimension(600, 100));
        panelJudul.setLayout(null);

        //label judul
        JLabel judul = new JLabel("Etalase");
        judul.setBounds(225, 10, 200, 100);
        judul.setFont(new Font("Serif", Font.BOLD, 35));

        //button keranjang
        JButton buttonKeranjang = new JButton("Keranjang");
        buttonKeranjang.setFont(fontButton);
        buttonKeranjang.setBounds(500, 10, 75, 50);
        buttonKeranjang.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonKeranjang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    new KeranjangScreen();
                
            }
        });

        //pengisian panel judul
        panelJudul.add(judul);
        panelJudul.add(buttonKeranjang);

        //panel barang
        panelListBarang = getPanel(iterasi);

        //button next
        JButton next = new JButton(">");
        next.setSize(100, 600);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<produk> p = SingeltonProduk.getInstance().getListProduk();
                if (p.size() - (iterasi + 4) <= 4) {
                    iterasi = p.size() - 4;
                } else {
                    iterasi += 4;
                }
                frame.remove(panelListBarang);
                panelListBarang = getPanel(iterasi);
                frame.add(panelListBarang, BorderLayout.CENTER);
                refreshFrame();
            }
        });

        //button prev
        JButton prev = new JButton("<");
        prev.setSize(100, 600);
        prev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (iterasi - 4 < 0) {
                    iterasi = 0;
                } else {
                    iterasi -= 4;
                }
                frame.remove(panelListBarang);
                panelListBarang = getPanel(iterasi);
                frame.add(panelListBarang, BorderLayout.CENTER);
                refreshFrame();
            }
        });
        
        JButton back = new JButton("back");
        back.setBounds(0, 0, 100, 50);
        back.setFont(fontButton);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new MenuClient();
            }
        });

        //pengisian frame
        frame.add(back);
        frame.add(panelJudul, BorderLayout.NORTH);
        frame.add(panelListBarang, BorderLayout.CENTER);
        frame.add(next, BorderLayout.EAST);
        frame.add(prev, BorderLayout.WEST);
        frame.setVisible(true);
        return frame;
    }
}
