/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public enum PengirimanEnum {
    PENGEMASAN,MENUNGGU_KURIR,DIANTAR,SAMPAI;
    public String getString() {
        if (this == PENGEMASAN) {
            return "Pengemasan";
        } else if(this == MENUNGGU_KURIR) {
            return "Menunggu Kurir";
        } else if(this == DIANTAR) {
            return "Diantar";
        } else {
            return "Sampai";
        }
    }
}
