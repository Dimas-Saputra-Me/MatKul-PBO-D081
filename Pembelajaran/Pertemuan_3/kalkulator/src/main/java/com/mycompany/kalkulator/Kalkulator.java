/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulator;

import java.util.*;

/**
 *
 * @author User
 */
public class Kalkulator {
    
    public static void main(String[] args) {
             Scanner readInput = new Scanner(System.in);

             double angka1, angka2;
             String pilihan;
             System.out.print("Masukkan angka pertama: "); angka1 = readInput.nextDouble();
             System.out.print("Masukkan angka kedua: "); angka2 = readInput.nextDouble();
             System.out.print("| Tambah | Kurang | Kali | Bagi | Modulo |\nMasukkan pilihan operasi aritmatika: "); pilihan = readInput.next();
             
             Calculate kalkulator = new Calculate(angka1, angka2);
             
             switch(pilihan){
                 case "Tambah":
                     System.out.println("Hasil penjumlahan: " + kalkulator.tambah()); break;
                 case "Kurang":
                     System.out.println("Hasil pengurangan: " + kalkulator.kurangi()); break;
                 case "Kali":
                     System.out.println("Hasil perkalian: " + kalkulator.kali()); break;
                 case "Bagi":
                     System.out.println("Hasil pembagian: " + kalkulator.bagi()); break;
                 case "Modulo":
                     System.out.println("Hasil modulo: " + kalkulator.modulo()); break;
             }
             
             
    }
}
