/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes1.model;

/**
 *
 * @author user
 */
public enum metodePembayaranEnum {
    BCA,GOPAY,DANA,OVO;
    
    public String getString(){
        if (this==BCA) {
            return "BCA";
        }else if (this==GOPAY) {
            return "Go-Pay";
        }else if (this == DANA) {
            return "Dana";
        }else{
            return "OVO";
        }
    }
}
