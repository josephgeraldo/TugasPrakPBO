package model;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class PanelRiwayat extends JPanel {

    public PanelRiwayat(pesanan riwayatPembelian) {
        //font
        Font fontNamaProduk = new Font("Serif", Font.PLAIN, 20);
        Font fontHarga = new Font("Serif", Font.PLAIN, 16);
        setBorder(new MatteBorder(0, 0, 1, 0, Color.GRAY));
        setSize(600, 200);
        //nama barang
        produk Produk = null;
        for (int i = 0; i < SingeltonProduk.getInstance().getListProduk().size(); i++) {
            produk temp = SingeltonProduk.getInstance().getProduk(i);
            if (temp.getId_produk() == riwayatPembelian.getBarangId()) {
                Produk = temp;
            }
        }
        if (Produk == null) {
            add(new JLabel("Error"));
        } else {
            JLabel namaBarang = new JLabel("Nama : " + Produk.getNama_barang());
            namaBarang.setFont(fontNamaProduk);
            namaBarang.setAlignmentX(JLabel.LEFT);
            //jumlah
            JLabel jumlah = new JLabel(String.valueOf("Jumlah : " + riwayatPembelian.getJumlah()));
            jumlah.setFont(fontNamaProduk);

            //hartot
            JLabel harTot = new JLabel("Harga Total : " + riwayatPembelian.getHargaTotal());
            harTot.setFont(fontNamaProduk);
            //biayaPengiriman
            JLabel biayaPengiriman = new JLabel("Biaya Pengiriman : " + riwayatPembelian.getBiayaPengiriman());
            biayaPengiriman.setFont(fontNamaProduk);
            //jenis pembayaran
            JLabel jenisPembayaran = new JLabel("Metode Pembayaran : " + riwayatPembelian.getJenisPembayaran());
            jenisPembayaran.setFont(fontNamaProduk);

            JPanel pNama = new JPanel();
            pNama.add(namaBarang);

            JPanel pJumlah = new JPanel();
            pJumlah.add(jumlah);

            JPanel pHartot = new JPanel();
            pHartot.add(harTot);

            JPanel pBiayaPengiriman = new JPanel();
            pBiayaPengiriman.add(biayaPengiriman);

            JPanel pJenisPembayaran = new JPanel();
            pJenisPembayaran.add(jenisPembayaran);

            add(pNama);
            add(pJumlah);
            add(pHartot);
            add(pBiayaPengiriman);
            add(pJenisPembayaran);
        }
        setBorder(new MatteBorder(0, 0, 1, 0, Color.GRAY));
        setPreferredSize(new Dimension(100, 300));
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }
}
