/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.inheritance;

/**
 *
 * @author User
 */
public class Majalah extends Koleksi {
    private String edisi;
    
    // Constructor
    public Majalah(String judul, String edisi, String penerbit, int tahun){
        super(judul, penerbit, tahun);
        this.edisi =edisi;
    }
    
    // Method
    public String to_String(){
        return ("Judul: " + this.judul + "\nPenerbit: " + this.penerbit + "\nTahun: " + this.tahun + "\nEdisi: " + this.edisi);
    }
}
