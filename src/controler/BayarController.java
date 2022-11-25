package controler;

import model.*;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.UIManager.getInt;
import static javax.swing.UIManager.getString;

public class BayarController {
    
    public boolean createPesanan(ArrayList <produk> listProduk, ArrayList <Integer> listJumlah,int metodeBayar){
        boolean berhasil;
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        try{
            for (int i = 0; i < listProduk.size(); i++) {
                produk p = listProduk.get(i);
                int index = SingletonKeranjang.getInstance().getListProduk().indexOf(listProduk.get(i));
                PreparedStatement stat = conn.con.prepareStatement("INSERT INTO pesanan (`id_user`,`alamat_lengkap`, `id_kurir`,`id_produk`,`jumlah`,"
                        + "`harga_total`,`biaya_pengiriman`,`jenis_pembayaran`,`status_pembayaran`,`status_pengiriman`) VALUES (?,?,?,?,?,?,?,?,?,?)");
                stat.setInt(1, SingletonUser.getInstance().getUser().getIDUser());
                stat.setString(2, SingletonUser.getInstance().getUser().getAlamat_lengkap());
                stat.setInt(3, 301);
                stat.setInt(4, p.getId_produk());
                stat.setInt(5, listJumlah.get(i));
                stat.setDouble(6,p.getHarga()*listJumlah.get(i));
                stat.setInt(7,20000);
                stat.setInt(8,metodeBayar);
                if(metodeBayar == 1){
                    stat.setInt(9,0);
                }else{
                    stat.setInt(9,1);
                }
                stat.setInt(10,0);
                stat.executeUpdate();
                SingletonKeranjang.getInstance().getListProduk().remove(index);
                SingletonKeranjang.getInstance().getJumlah().remove(index);
                SingletonKeranjang.getInstance().removeLength();
            }
            JOptionPane.showMessageDialog(null, "Berhasil melakukan pembayaran");
            berhasil = true;
        }
        catch (SQLException e){
            e.printStackTrace();
            berhasil = false;
            JOptionPane.showMessageDialog(null, "Gagal melakukan pembayaran!!");
        }
        conn.disconnect();
        return berhasil;
    }
}
