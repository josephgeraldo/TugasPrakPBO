package controler;

import model.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StatusPembelianController {
 
    public ArrayList<pesanan> getPesanan(){
        ArrayList <pesanan> Pesanan = new ArrayList<>();
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        try{
            java.sql.Statement stat = conn.con.createStatement();
            ResultSet result = stat.executeQuery("select * from pesanan where customer_id='" + SingletonUser.getInstance().getUser().getIDUser() + "'");
            while(result.next()){
                pesanan temp = new pesanan(result.getInt("pesanan_id"),result.getInt("id_user"),result.getInt("id_kurir"),result.getInt("id_produk"),result.getString("alamat_lengkap"),result.getInt("jumlah"),result.getDouble("harga_total"),result.getDouble("biaya_pengiriman"),PembayaranEnum.values()[result.getInt("jenis_pembayaran")],result.getInt("status_pembayaran"),statusPengiriman.values()[result.getInt("status_pengiriman")]);
                Pesanan.add(temp);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        conn.disconnect();
        return Pesanan;
    }
}
