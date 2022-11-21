/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import controler.DatabaseHandler;
import model.SingeltonProduk;
import model.produk;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author user
 */
public class SingeltonProdukControler {

    SingeltonProduk produkS = SingeltonProduk.getInstance();

    public void addProdukToSingleton() {
        produkS.reset();
        DatabaseHandler c = new DatabaseHandler();

        try {
            c.connect();

            PreparedStatement stmt;
            String query = "SELECT * FROM barang";
            stmt = c.con.prepareStatement(query);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                int id = result.getInt("barang_id");
                String nama_barang = result.getString("nama");
                double berat = result.getDouble("berat");
                double harga = result.getDouble("harga");
                int stock = result.getInt("stock");
                produk Produk = new produk(id, nama_barang, berat, harga, stock);
                produkS.addProduk(Produk);
            }

            c.disconnect();
        } catch (Exception e) {
        }

    }
}
