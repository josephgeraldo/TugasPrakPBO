/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class user {
    int IDUser;
    String username;
    String password;
    String no_telp;
    String nama_lengkap;
    String alamat_lengkap;
    String kota;
    String provinsi;
    String kode_post;
    String tipe;

    public user(int IDUser, String username, String password, String no_telp, String nama_lengkap, String alamat_lengkap, String kota, String provinsi, String kode_post, String tipe) {
        this.IDUser = IDUser;
        this.username = username;
        this.password = password;
        this.no_telp = no_telp;
        this.nama_lengkap = nama_lengkap;
        this.alamat_lengkap = alamat_lengkap;
        this.kota = kota;
        this.provinsi = provinsi;
        this.kode_post = kode_post;
        this.tipe = tipe;
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
