package model;

import java.util.ArrayList;


public class SingletonKeranjang {
    private static SingletonKeranjang instance;
    private ArrayList <produk> listProduk = new ArrayList<>();
    private ArrayList <Integer> jumlah = new ArrayList<>();
    int length = 0;
    
    private SingletonKeranjang(){
        
    }

    public ArrayList<produk> getListProduk() {
        return listProduk;
    }


    public ArrayList<Integer> getJumlah() {
        return jumlah;
    }
    
    public static SingletonKeranjang getInstance(){
        if(instance == null){
            instance = new SingletonKeranjang();
        }
        return instance;
    }
    
    public void reset(){
        this.listProduk = new ArrayList<>();
        this.jumlah = new ArrayList<>();
        this.length = 0;
    }
    
    public void addLength(){
        this.length++;
    }
    
    public void removeLength(){
        this.length--;
    }
    
    public int getLength(){
        return length;
    }
    
    public produk getProdukAt(int index) {
        return listProduk.get(index);
    }
    
    public void addBarang(produk p){
        addLength();
        this.listProduk.add(p);
    }
    

    public int getJumlahAt(int index) {
        return jumlah.get(index);
    }
    
    public void addJumlah(int jumlah) {
        this.jumlah.add(jumlah);
    }
    
    public void hapusBarang(int index){
        this.jumlah.remove(index);
        this.listProduk.remove(index);
        this.length--;
    }
}
