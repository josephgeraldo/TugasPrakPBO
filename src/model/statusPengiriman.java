/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public enum statusPengiriman {
    PENGEMASAN,MENCARI_KURIR,DALAM_PERJALANAN,SUDAH_SAMPAI;
    public String getString() {
        if (this == PENGEMASAN) {
            return "Pengemasan";
        } else if(this == MENCARI_KURIR) {
            return "Menunggu Kurir";
        } else if(this == DALAM_PERJALANAN) {
            return "Diantar";
        } else {
            return "Sampai";
        }
    }
}
