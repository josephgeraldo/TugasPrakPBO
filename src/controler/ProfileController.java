package controler;

import model.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProfileController {

    user customer = (user) SingletonUser.getInstance().getUser();
    int index = 0;
    String query;


    public String update(String nama, String userName, String pass, String telepon, String alamat, String kota, String provinsi, String kodePos) {
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        String tempPass=pass;
        pass = Hasher.password(pass);
        try {
            java.sql.Statement stat = conn.con.createStatement();
            stat.executeUpdate("update user set nama_lengkap='" + nama + "',username='" + userName + "',password='" + pass + "',no_telepon='" + telepon + ",alamat_lengkap='" + alamat +  "',kota='" + kota + "',provinsi='" + provinsi + "',kode_post='" + kodePos + "' where id_user=" + customer.getIDUser());
            customer.setNama_lengkap(nama);
            customer.setUsername(userName);
            customer.setPassword(tempPass);
            customer.setNo_telp(telepon);
            customer.setAlamat_lengkap(alamat);
            customer.setKota(kota);
            customer.setProvinsi(provinsi);
            customer.setKode_post(kodePos);
            return "Berhasil melakukan update data";

        } catch (SQLException e) {
            e.printStackTrace();
            return "Gagal melakukan update data";
        }
    }
}
