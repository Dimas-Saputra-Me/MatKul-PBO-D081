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
public class Bus {
    private ArrayList<Penumpang> penumpang = new ArrayList<>();
    public String lokasi = "Liyue";
    private int kapasitas = 0;

//    Constructor
    public Bus() {
        
    }

//    Method
    public void addPenumpang(Penumpang penumpang) {
        if (this.kapasitas < 20) {
            this.penumpang.add(penumpang);
        }

        // Update kapasitas
        this.kapasitas = this.penumpang.size();
    }

    public int removePenumpang() {
        this.penumpang.removeIf((Penumpang p) -> p.tujuan.equals(this.lokasi));
        
        // Update kapasitas
        int penumpangTurun = this.kapasitas - this.penumpang.size();
        this.kapasitas = this.penumpang.size();
        
        return penumpangTurun;
    }

    public void updateLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    // Setter Getter
    public int getKapasitas(){
        return this.kapasitas;
    }
    
    public ArrayList<Penumpang> getPenumpang(){
        return this.penumpang;
    }

}
