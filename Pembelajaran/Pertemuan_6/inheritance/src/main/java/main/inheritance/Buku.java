/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.inheritance;

/**
 *
 * @author User
 */
public class Buku extends Koleksi {
    private String penulis;
    
    // Constructor
    public Buku(String judul, String penulis, String penerbit, int tahun){
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }
    
    // Method
    public String to_String(){
        return ("Judul: " + this.judul + "\nPenerbit: " + this.penerbit + "\nTahun: " + this.tahun + "\nPenulis: " + this.penulis);
    }
    
    public String getPenulis(){
        return this.penulis;
    }
    
}
