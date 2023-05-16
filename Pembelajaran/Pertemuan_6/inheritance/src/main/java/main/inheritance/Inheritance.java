/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.inheritance;

/**
 *
 * @author User
 */
public class Inheritance {

    public static void main(String[] args) {
        System.out.println("CLASS KOLEKSI");
        Koleksi koleksi = new Koleksi("Judul", "Penerbit", 2023);
        System.out.println(koleksi.to_String());

        System.out.println("\n\nCLASS BUKU");
        Buku buku = new Buku("Judul", "Penulis", "Penerbit", 2023);
        System.out.println(buku.to_String());
        
        System.out.println("\n\nCLASS MAJALAH");
        Majalah majalah = new Majalah("Judul", "Edisi", "Penerbit", 2023);
        System.out.println(majalah.to_String());

        System.out.println("\n\nCLASS SKRIPSI");
        Skripsi skripsi = new Skripsi("NPM", "Penulis", "Judul", "Penerbit", 2023);
        System.out.println(skripsi.to_String());
    }
    
}
