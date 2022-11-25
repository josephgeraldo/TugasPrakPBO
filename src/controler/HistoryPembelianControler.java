
package controler;

import controler.*;
import model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HistoryPembelianControler {
    public ArrayList<pesanan> getRiwayat(){
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        ArrayList<pesanan> riwayatPembelian = new ArrayList<>();
        try{
            java.sql.Statement stat = conn.con.createStatement();
            ResultSet result = stat.executeQuery("select * from pesanan where id_user='" + SingletonUser.getInstance().getUser().getIDUser() + "' and status_pengiriman = 3");
            while(result.next()){
                pesanan temp = new pesanan(result.getInt("pesanan_id"),result.getInt("id_user"),result.getInt("id_produk"),result.getInt("jumlah"),result.getString("alamat_lengkap"),result.getInt("jumlah"),result.getDouble("harga_total"),result.getDouble("biaya_pengiriman"),PembayaranEnum.values()[result.getInt("jenis_pembayaran")],result.getInt("statusPengiriman"),statusPengiriman.values()[result.getInt("status_pengiriman")]);
                riwayatPembelian.add(temp);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return riwayatPembelian;
    }
}
