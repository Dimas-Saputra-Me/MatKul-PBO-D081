/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.abstractclass;

/**
 *
 * @author User
 */
public class AbstractClass {

    public static void main(String[] args) {
        
//        Hewan kambing = new Hewan(); // Tidak bisa di-inisialisasi
        Kambing domba = new Kambing();
        domba.makan();
        domba.tidur();
        domba.speak();
        domba.berjalan();
        
    }
    
}
