/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controler.*;
/**
 *
 * @author user
 */
public class Order {
    
    public static void main(String[] args) {
        new Order();
    }
    
    public Order(){
        EtalaseController controller = new EtalaseController();
        controller.getFrame();
    }
}
