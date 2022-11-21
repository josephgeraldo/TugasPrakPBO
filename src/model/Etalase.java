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
public class Etalase {
    ArrayList<produk> listProduk;

    public Etalase(ArrayList<produk> listProduk) {
        this.listProduk = listProduk;
    }

    public ArrayList<produk> getListProduk() {
        return listProduk;
    }

    public void setListProduk(ArrayList<produk> listProduk) {
        this.listProduk = listProduk;
    }
}
