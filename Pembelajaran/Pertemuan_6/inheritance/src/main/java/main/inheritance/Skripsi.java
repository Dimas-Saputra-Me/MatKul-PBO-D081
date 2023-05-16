/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.inheritance;

/**
 *
 * @author User
 */
public class Skripsi  extends Buku {
    private String npm;
    
    // Constructor
    public Skripsi(String npm, String penulis, String judul, String penerbit, int tahun){
        super(judul, penulis, penerbit, tahun);
        this.npm = npm;
    }
    
    // Method
    public String to_String(){
        return ("Judul: " + this.judul + "\nPenerbit: " + this.penerbit + "\nTahun: " + this.tahun + "\nPenulis: " + super.getPenulis() + "\nNPM: " + this.npm);
    }
}
