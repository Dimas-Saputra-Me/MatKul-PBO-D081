/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.inheritance;

/**
 *
 * @author User
 */
public class Koleksi {
     protected String judul, penerbit;
     protected int tahun;
     
     // Constructor 
     public Koleksi(String judul, String penerbit, int tahun){
         this.judul = judul;
         this.penerbit = penerbit;
         this.tahun = tahun;
     }
     
     // Method  
     public String to_String(){
         return ("Judul: " + this.judul + "\nPenerbit: " + this.penerbit + "\nTahun: " + this.tahun);
     }
     
}
