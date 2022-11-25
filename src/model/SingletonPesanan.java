/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class SingletonPesanan {
    private static SingletonPesanan instance;
    private ArrayList<pesanan> listPesanan = new ArrayList<>();
    
    public static SingletonPesanan getInstance() {
        if (instance == null) {
            instance = new SingletonPesanan();
        }
        return instance;
    }
    
    public void reset(){
        this.listPesanan = new ArrayList<>();
    }
    
    public ArrayList<pesanan> getListProduk(){
        return listPesanan;
    }
    
    public pesanan getProduk(int index){
        return listPesanan.get(index);
    }
    
    public void addPesanan(pesanan p){
        this.listPesanan.add(p);
    }
}
