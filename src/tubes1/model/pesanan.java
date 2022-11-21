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
public class pesanan extends user {
    int id_pesanan;
    int jumlah;
    statusPembayaran statusPembayaran;
    statusPengiriman statusPengiriman;
    ArrayList<produk> produk;

    public pesanan(int id_pesanan, int jumlah, statusPembayaran statusPembayaran, statusPengiriman statusPengiriman, ArrayList<produk> produk, int user, String username, String password, String no_telp, String nama_lengkap, String alamat_lengkap, String kota, String provinsi, String kode_post) {
        super(user, username, password, no_telp, nama_lengkap, alamat_lengkap, kota, provinsi, kode_post);
        this.id_pesanan = id_pesanan;
        this.jumlah = jumlah;
        this.statusPembayaran = statusPembayaran;
        this.statusPengiriman = statusPengiriman;
        this.produk = produk;
    }

    public int getId_pesanan() {
        return id_pesanan;
    }

    public void setId_pesanan(int id_pesanan) {
        this.id_pesanan = id_pesanan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
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

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getAlamat_lengkap() {
        return alamat_lengkap;
    }

    public void setAlamat_lengkap(String alamat_lengkap) {
        this.alamat_lengkap = alamat_lengkap;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKode_post() {
        return kode_post;
    }

    public void setKode_post(String kode_post) {
        this.kode_post = kode_post;
    }

    
}
