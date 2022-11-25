package controler;

import model.*;
import controler.DatabaseHandler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.PreparedStatement;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JSpinner.DefaultEditor;

public class EtalasePanelBarangController {

    JSpinner jumlah;
    int stock;

    public void updateDatabase(int id, int stokBaru) {
        DatabaseHandler conn = new DatabaseHandler();
        
        conn.connect();
        try {
            PreparedStatement stat = conn.con.prepareStatement("UPDATE produk SET stock  =  ? WHERE id_produk = ?");
            stat.setInt(1, stokBaru);
            stat.setInt(2, id);
            stat.executeUpdate();
            getProduk();
            JOptionPane.showMessageDialog(null, "Berhasil menambahkan barang ke keranjang");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error!! Gagal menambahkan barang ke keranjang");
//            JOptionPane.showMessageDialog(null, pointer);
        }
        conn.disconnect();
    }

    public void getProduk() {
        produk Produk;
        SingeltonProduk.getInstance().reset();
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        try {
            java.sql.Statement stat = conn.con.createStatement();
            ResultSet result = stat.executeQuery("select * from produk");
            while (result.next()) {
                int id_produk = result.getInt("id_produk");
                int berat = result.getInt("berat");
                String nama = result.getString("nama_produk");
                int stock = result.getInt("stock");
                Double harga = result.getDouble("harga");
                Produk = new produk(id_produk, nama, berat, harga, stock);
                SingeltonProduk.getInstance().addProduk(Produk);
            }
        } catch (SQLException e) {

        }
        conn.disconnect();
    }

    public void updateStok(int index) {
        produk temp = SingeltonProduk.getInstance().getProduk(index);
        stock = temp.getStock();
    }

    public JPanel getPanelBarang(int index) {
        JPanel panelBarang = new JPanel();
        produk Produk = SingeltonProduk.getInstance().getProduk(index);
        stock = Produk.getStock();
        panelBarang = new JPanel();
        panelBarang.setSize(250, 300);
        panelBarang.setBackground(Color.WHITE);
        panelBarang.setLayout(null);

        //label nama
        String txt = Produk.getNama_barang();
        JLabel lblNamaProduk = new JLabel(txt);
        lblNamaProduk.setBounds(10, 215, 200, 25);
        lblNamaProduk.setFont(new Font("Serif", Font.PLAIN, 22));

        //label harga
        JLabel lblHarga = new JLabel("Rp. " + String.valueOf(Produk.getHarga()));
        lblHarga.setBounds(10, 240, 120, 20);
        lblHarga.setFont(new Font("Serif", Font.PLAIN, 17));

        //button add to cart
        JButton btn = new JButton("add to cart");
        btn.setFont(new Font("Serif", Font.PLAIN, 10));
        btn.setBounds(190, 225, 50, 50);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int jumlahBeli = (Integer) jumlah.getValue();
                if(stock == 0){
                        JOptionPane.showMessageDialog(null, "Maaf untuk ukuran tersebut stok habis");
                    }else if(jumlahBeli == 0){
                        JOptionPane.showMessageDialog(null, "Jumlah beli harus lebih dari 0!!");
                    }else if(jumlahBeli > stock){
                        JOptionPane.showMessageDialog(null, "Maaf untuk ukuran tersebut stok tersisa " + stock);
                    } else {
                        try{
                            SingletonKeranjang.getInstance().addBarang(Produk);
                            SingletonKeranjang.getInstance().addJumlah(jumlahBeli);
                            updateDatabase(Produk.getId_produk(),stock-jumlahBeli);
                            updateStok(index);
                        }catch(Exception a){
                            JOptionPane.showMessageDialog(null, "Maaf gagal menambahkan barang ke dalam keranjang");
                        }
                    }
            
            }
        });

        //Spinner jumlah
        jumlah = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));

        jumlah.setBounds(
                135, 240, 40, 20);
        ((DefaultEditor) jumlah.getEditor()).getTextField().setEditable(false);

        //input panel
        panelBarang.add(lblNamaProduk);
        panelBarang.add(lblHarga);
        panelBarang.add(jumlah);
        panelBarang.add(btn);
        return panelBarang;
    }
}
