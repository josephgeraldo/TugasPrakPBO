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
public class pesanan {
    private int id_pesanan;
    private int customerId;
    private int kurirId;
    private int barangId;
    private String alamat_lengkap;
    private int jumlah;
    private Double hargaTotal;
    private Double biayaPengiriman;
    private PembayaranEnum jenisPembayaran;
    private int statusPembayaran;
    private statusPengiriman statusPengiriman;

    public pesanan(int id_pesanan, int customerId, int kurirId, int barangId, String alamat_lengkap, int jumlah, Double hargaTotal, Double biayaPengiriman, PembayaranEnum jenisPembayaran, int statusPembayaran, statusPengiriman statusPengiriman) {
        this.id_pesanan = id_pesanan;
        this.customerId = customerId;
        this.kurirId = kurirId;
        this.barangId = barangId;
        this.alamat_lengkap = alamat_lengkap;
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

    public String getAlamat_lengkap() {
        return alamat_lengkap;
    }

    public void setAlamat_lengkap(String alamat_lengkap) {
        this.alamat_lengkap = alamat_lengkap;
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

    public int getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(int statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public statusPengiriman getStatusPengiriman() {
        return statusPengiriman;
    }

    public void setStatusPengiriman(statusPengiriman statusPengiriman) {
        this.statusPengiriman = statusPengiriman;
    }

    
}
