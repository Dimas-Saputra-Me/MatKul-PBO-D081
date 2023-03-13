/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author User
 */
public class Manusia {
    protected String nama;
    protected String alamat;
    
    // Constructor
    protected Manusia(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    
    // Method
    protected void speak(){
        System.out.println("Halo, Dunia");
    }
    
    protected void perkenalan() {
        System.out.println("Halo, nama saya " + this.nama + ", Saya tinggal di " + this.alamat);
    }
}
