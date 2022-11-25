/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class pesanan extends user {
    private int id_pesanan;
    private int customerId;
    private int kurirId;
    private int barangId;
    private int alamatId;
    private int jumlah;
    private Double hargaTotal;
    private Double biayaPengiriman;
    private PembayaranEnum jenisPembayaran;
    private boolean statusPembayaran;
    private statusPengiriman statusPengiriman;

    public pesanan(int id_pesanan, int customerId, int kurirId, int barangId, int alamatId, int jumlah, Double hargaTotal, Double biayaPengiriman, PembayaranEnum jenisPembayaran, boolean statusPembayaran, statusPengiriman statusPengiriman, int IDUser, String username, String password, String no_telp, String nama_lengkap, String alamat_lengkap, String kota, String provinsi, String kode_post, String tipe) {
        super(IDUser, username, password, no_telp, nama_lengkap, alamat_lengkap, kota, provinsi, kode_post, tipe);
        this.id_pesanan = id_pesanan;
        this.customerId = customerId;
        this.kurirId = kurirId;
        this.barangId = barangId;
        this.alamatId = alamatId;
        this.jumlah = jumlah;
        this.hargaTotal = hargaTotal;
        this.biayaPengiriman = biayaPengiriman;
        this.jenisPembayaran = jenisPembayaran;
        this.statusPembayaran = statusPembayaran;
        this.statusPengiriman = statusPengiriman;
    }

    public int getId_pesanan() {
        return id_pesanan;
    }

    public void setId_pesanan(int id_pesanan) {
        this.id_pesanan = id_pesanan;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getKurirId() {
        return kurirId;
    }

    public void setKurirId(int kurirId) {
        this.kurirId = kurirId;
    }

    public int getBarangId() {
        return barangId;
    }

    public void setBarangId(int barangId) {
        this.barangId = barangId;
    }

    public int getAlamatId() {
        return alamatId;
    }

    public void setAlamatId(int alamatId) {
        this.alamatId = alamatId;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Double getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(Double hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public Double getBiayaPengiriman() {
        return biayaPengiriman;
    }

    public void setBiayaPengiriman(Double biayaPengiriman) {
        this.biayaPengiriman = biayaPengiriman;
    }

    public PembayaranEnum getJenisPembayaran() {
        return jenisPembayaran;
    }

    public void setJenisPembayaran(PembayaranEnum jenisPembayaran) {
        this.jenisPembayaran = jenisPembayaran;
    }

    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(boolean statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public statusPengiriman getStatusPengiriman() {
        return statusPengiriman;
    }

    public void setStatusPengiriman(statusPengiriman statusPengiriman) {
        this.statusPengiriman = statusPengiriman;
    }

    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
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

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    
}
