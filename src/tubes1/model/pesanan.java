/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes1.model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class pesanan {
    int pesanan;
    statusPembayaran statusPembayaran;
    statusPengiriman statusPengiriman;
    ArrayList<produk> produk;

    public int getPesanan() {
        return pesanan;
    }

    public void setPesanan(int pesanan) {
        this.pesanan = pesanan;
    }

    public statusPembayaran getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(statusPembayaran statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public statusPengiriman getStatusPengiriman() {
        return statusPengiriman;
    }

    public void setStatusPengiriman(statusPengiriman statusPengiriman) {
        this.statusPengiriman = statusPengiriman;
    }

    public ArrayList<produk> getProduk() {
        return produk;
    }

    public void setProduk(ArrayList<produk> produk) {
        this.produk = produk;
    }

    public pesanan(int pesanan, statusPembayaran statusPembayaran, statusPengiriman statusPengiriman, ArrayList<produk> produk) {
        this.pesanan = pesanan;
        this.statusPembayaran = statusPembayaran;
        this.statusPengiriman = statusPengiriman;
        this.produk = produk;
    }
}
