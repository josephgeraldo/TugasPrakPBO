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
public class keranjang {
    ArrayList<produk> listBarang;

    public keranjang(ArrayList<produk> listBarang) {
        this.listBarang = listBarang;
    }

    public ArrayList<produk> getListBarang() {
        return listBarang;
    }

    public void setListBarang(ArrayList<produk> listBarang) {
        this.listBarang = listBarang;
    }
    public void addBarang(produk Produk){
        this.listBarang.add(Produk);
    }
    public void removeBarang(produk Produk){
        this.listBarang.remove(Produk);
    }
}
