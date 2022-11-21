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
public class SingeltonProduk {
    private static SingeltonProduk instance;
    private ArrayList<produk> listProduk = new ArrayList<>();
    
    private SingeltonProduk(){
        
    }
    
    public static SingeltonProduk getInstance(){
        if(instance == null){
            instance = new SingeltonProduk();
        }
        return instance;
    }
    
    public void reset(){
        this.listProduk = new ArrayList<>();
    }
    
    public ArrayList<produk> getListProduk(){
        return listProduk;
    }
    
    public produk getProduk(int index){
        return listProduk.get(index);
    }
    
    public void addProduk(produk p){
        this.listProduk.add(p);
    }
}
