/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes1.model;

/**
 *
 * @author user
 */
public class produk implements statusProduk {
    String nama_barang;
    String berat;
    int harga;

    public produk(String nama_barang, String berat, int harga) {
        this.nama_barang = nama_barang;
        this.berat = berat;
        this.harga = harga;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
