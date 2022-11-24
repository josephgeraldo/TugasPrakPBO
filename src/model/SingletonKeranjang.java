package model;

import java.util.ArrayList;


public class SingletonKeranjang {
    private static SingletonKeranjang instance;
    private ArrayList <produk> listProduk = new ArrayList<>();
    private ArrayList <Integer> jumlah = new ArrayList<>();
    int length = 0;
    
    private SingletonKeranjang(){
        
    }

    public static SingletonKeranjang getInstance() {
        return instance;
    }

    public static void setInstance(SingletonKeranjang instance) {
        SingletonKeranjang.instance = instance;
    }

    public ArrayList<produk> getListProduk() {
        return listProduk;
    }

    public void setListProduk(ArrayList<produk> listProduk) {
        this.listProduk = listProduk;
    }

    public ArrayList<Integer> getJumlah() {
        return jumlah;
    }

    public void setJumlah(ArrayList<Integer> jumlah) {
        this.jumlah = jumlah;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public void addLength(){
        this.length++;
    }
    
    public void removeLength(){
        this.length--;
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
