/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import controler.DatabaseHandler;
import model.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;


/**
 *
 * @author user
 */

public class KonfirmasiPengirimanController {
    SingletonPesananController pesananCt = new SingletonPesananController();
//    SingletonPesanan pesananS = SingletonPesanan.getInstance();
//
//    public pesanan getPesananTerdepan() {
//        pesananCt.addPesananToSingleton();
//        ArrayList<pesanan> listPesanan = pesananS.getListProduk();
//        ArrayList<pesanan> paket = new ArrayList<>();
//        for (pesanan pesanan : listPesanan) {
//            if (pesanan.getStatusPengiriman() == statusPengiriman.PENGEMASAN) {
//                return pesanan;
//            }
//        }
//        return null;
//    }
//    
//    public String getNamaCustomer(int id) {
//        SingletonCustomerController customerCt = new SingletonCustomerController();
//        SingletonCustomer customerS = SingletonCustomer.getInstance();
//        customerCt.addCustomerToDB();
//        for (Customer customer : customerS.getListCustomer()) {
//            if (customer.getId()==id) {
//                return customer.getName();
//            }
//        }
//        return "";
//    }
//    
//    public String getNamaProduk(int id) {
//        SingletonProdukController produkCt = new SingletonProdukController();
//        SingletonProduk produkS = SingletonProduk.getInstance();
//        produkCt.addProdukToSingleton();
//        for (Produk produk : produkS.getListProduk()) {
//            if (produk.getId()==id) {
//                return produk.getNama();
//            }
//        }
//        return null;
//    }
//    
//    public String kirimBarang(int idPesanan) {
//        DatabaseHandler c = new DatabaseHandler();
//        try {
//            c.connect();
//            
//            String query = "UPDATE pesanan SET status_pengiriman = ? WHERE pesanan_id = ?";
//            PreparedStatement stmt = c.con.prepareStatement(query);
//            stmt.setInt(1, 1);
//            stmt.setInt(2, idPesanan);
//            stmt.execute();            
//            c.disconnect();
//            return "konfirmasi kirim barang berhasil!";
//        } catch (Exception e) {
//            return "konfirmasi kirim barang gagal!";
//        }
//    }
}
