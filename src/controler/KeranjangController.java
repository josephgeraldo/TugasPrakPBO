package controler;

import model.*;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.*;

public class KeranjangController {


    public boolean updateDatabase(ArrayList <produk> listProduk, ArrayList <Integer> listJumlah) {
        boolean berhasil;
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        try{
            for (int i = 0; i < listProduk.size(); i++) {
                int index = SingletonKeranjang.getInstance().getListProduk().indexOf(listProduk.get(i));
                PreparedStatement stat = conn.con.prepareStatement("UPDATE barang SET stock =  ? WHERE barang_id = ?");
                stat.setInt(1,listProduk.get(i).getStock());
                stat.setInt(2,listProduk.get(i).getId());
                stat.executeUpdate();
                EtalasePanelBarangController c = new EtalasePanelBarangController();
                c.getProduk();
                SingletonKeranjang.getInstance().getListProduk().remove(index);
                SingletonKeranjang.getInstance().getJumlah().remove(index);
                SingletonKeranjang.getInstance().removeLength();
            }
            JOptionPane.showMessageDialog(null, "Berhasil menghapus barang dari keranjang");
            berhasil = true;
        }
        catch (SQLException e){
            berhasil = false;
            JOptionPane.showMessageDialog(null, "Error menghapus barang dari keranjang");
        }
        conn.disconnect();
        return berhasil;
    }
}
