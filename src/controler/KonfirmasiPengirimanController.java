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
    SingletonPesananController controlPesanan = new SingletonPesananController();
    SingletonPesanan pesananS = SingletonPesanan.getInstance();

    public pesanan getPesananTerdepan() {
        controlPesanan.addPesananToSingleTon();
        ArrayList<pesanan> listPesanan = pesananS.getListProduk();
        ArrayList<pesanan> paket = new ArrayList<>();
        for (pesanan pesanan : listPesanan) {
            if (pesanan.getStatusPengiriman() == statusPengiriman.PENGEMASAN) {
                return pesanan;
            }
        }
        return null;
    }
    
    public String kirimBarang(int idPesanan) {
        DatabaseHandler conn = new DatabaseHandler();
        try {
            conn.connect();
            
            String query = "UPDATE pesanan SET status_pengiriman = ? WHERE pesanan_id = ?";
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, 1);
            stmt.setInt(2, idPesanan);
            stmt.execute();            
            conn.disconnect();
            return "Konfirmasi Pengiriman Kue Berhasil!!";
        } catch (Exception e) {
            return "Konfirmasi Pengiriman Kue Gagal!!!";
        }
    }
}
