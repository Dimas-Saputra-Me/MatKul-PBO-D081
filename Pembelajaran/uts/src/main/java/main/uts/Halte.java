/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.uts;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Halte {

    private final String lokasi;
    private int penumpangMenunggu = 0;
    private int sisaPenumpangMenunggu = 0;
    private int penumpangTurun = 0;
    private int penumpangNaik = 0;

//    Constructor
    public Halte(String lokasi) {
        this.lokasi = lokasi;
    }

//    Method
    public String getLokasi() {
        return this.lokasi;
    }

    public void printHalte(ArrayList<Penumpang> penumpang, ArrayList<Penumpang> penumpangBus, int penumpangTurun) {
        
        // Hitung penumpang turun
        this.penumpangTurun = penumpangTurun;
        
        // Hitung penumpang naik
        penumpangBus.forEach((Penumpang p) -> {
            if(p.dari.equals(this.lokasi)) this.penumpangNaik++;
        });
        
        // Hitung penumpang menunggu
        penumpang.forEach((Penumpang p) -> {
            if(p.dari.equals(this.lokasi)) this.penumpangMenunggu++;
        });
        
        // Hitung sisa penumpang menunggu
        this.sisaPenumpangMenunggu = this.penumpangMenunggu - this.penumpangNaik;
        
        System.out.println("-> Halte " + this.lokasi + ": " + this.penumpangMenunggu + " penumpang menunggu");
        System.out.println("-> Bus Sampai di Halte " + this.lokasi);
        System.out.println("\t- " + this.penumpangTurun + " Penumpang turun");
        System.out.println("\t- " + this.penumpangNaik + " Penumpang naik");
        System.out.println("-> List Penumpang di Bus: ");
        System.out.println("\tNama\t\t\tDari\t\t\tTujuan");
        penumpangBus.forEach((Penumpang p) -> {
            System.out.println("\t"+p.nama+"\t\t\t"+p.dari+"\t\t\t"+p.tujuan);
        });
        
        System.out.println("-> Halte " + this.lokasi + ": " + this.sisaPenumpangMenunggu + " penumpang menunggu");
        System.out.println("-------------------------------------");
    }
    
}
