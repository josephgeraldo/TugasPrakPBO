/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.PembayaranEnum;
import model.SingletonPesanan;
import model.pesanan;
import model.statusPengiriman;

/**
 *
 * @author Joseph
 */
public class SingletonPesananController {

    SingletonPesanan pesananS = SingletonPesanan.getInstance();

    public void addPesananToSingleTon() {
        pesananS.reset();
        DatabaseHandler conn = new DatabaseHandler();
        try {
            conn.connect();
            String query = "SELECT * FROM pesanan";
            PreparedStatement stmt = conn.con.prepareStatement(query);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                int pesananId = result.getInt("pesanan_id");
                int userId = result.getInt("id_user");
                int kurirId = result.getInt("id_kurir");
                int produkId = result.getInt("id_produk");
                String alamatLengkap = result.getString("alamat_lengkap");
                int jumlah = result.getInt("jumlah");
                double hargaTotal = result.getDouble("harga_total");
                double biayaPengiriman = result.getDouble("biaya_pengiriman");
                PembayaranEnum jenisPembayaran = PembayaranEnum.values()[result.getInt("jenis_pembayaran")];
                int statusPembayaran = result.getInt("status_pembayaran");
                statusPengiriman statusPengiriman1 = statusPengiriman.values()[result.getInt("status_pengiriman")];
                pesanan psn = new pesanan(pesananId, userId, kurirId, produkId, alamatLengkap, jumlah, hargaTotal, biayaPengiriman, jenisPembayaran, statusPembayaran, statusPengiriman1);
                pesananS.addPesanan(psn);
            }

            conn.disconnect();
        } catch (Exception e) {
        }
    }
}
