/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.tugas5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tugas5 {

    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        
        System.out.print("Masukkan berapa banyak bangun Bola yang anda inginkan : ");
        int n = readInput.nextInt();
        
        Bola[] bola = new Bola[n];
        
         // Pengisian elemen ke dalam array
         for(int i=0; i<n; i++){
             System.out.print("Masukkan radius bola ke-" + (i+1) + " : ");
             int radius = readInput.nextInt();
             bola[i] = new Bola(radius);
         }
         
         // Cetak volume kubus menggunakan enhanced loop
        for(Bola bol: bola){
            System.out.println("Volume Kubus : " + bol.GetVolume());
        }
        
        // Rata-Rata Volume mengguanakan enhanced loop
        double avg = 0;
        for(Bola bol: bola){
            avg += bol.GetVolume();
        }
        avg /= n;
        System.out.println("Rata-Rata volume semua balok: " + avg);
        
    }
}
